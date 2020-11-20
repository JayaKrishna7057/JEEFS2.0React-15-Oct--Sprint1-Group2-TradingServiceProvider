/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */
package com.cg.trading_dao;

import javax.persistence.EntityManager;

import org.jboss.logging.Logger;

import com.cg.trading_exception.InvalidChoiceException;
import com.cg.trading_exception.MaximumAmountOnStockException;
import com.cg.trading_exception.UserNotFoundException;
import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;
import com.cg.trading_util.JPAUtil;

public class TradingAdminDAOImpl {

	JPAUtil init = new JPAUtil();

	/**
	 * 1. Begin Transaction 2. Add Company manager details into database 3. Commits
	 * Transaction
	 * 
	 * @param companyManager
	 * @return result
	 */

	public boolean addCompanyManager(CompanyManager companyManager) {
		/**
		 * Logger is used to report error messages and warning messages as well as info
		 * message...
		 */
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		boolean result = false;
		try {
			EntityManager em = init.getEntityManager();
			em.getTransaction().begin();
			// Persist merges the given entity object into the database
			em.persist(em.merge(companyManager));
			result = true;
			em.getTransaction().commit();
			em.close();
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		logger.info("Company manager added successfully");
		return result;
	}

	/**
	 * 1. Begin Transaction 2. Checks the availability of given Id from existing
	 * database. 3. Remove the details of given Id 4. End Transaction
	 * 
	 * @param companyManagerId
	 * @return result
	 */

	public boolean deleteCompanyManager(int companyManagerId) {
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		boolean result = false;
		EntityManager em = init.getEntityManager();
		try {
			CompanyManager companyManager = em.find(CompanyManager.class, companyManagerId);
			if (companyManager != null) {
				em.getTransaction().begin();
				// Removes the given entity object from the database
				em.remove(companyManager);
				result = true;
				em.getTransaction().commit();
				em.close();
			} else {
				throw new UserNotFoundException("Company Manager not found");
			}
		} catch (Exception e) {
			e.getMessage();
			em.getTransaction().rollback();
		}
		logger.info("Company manager deleted successfully");
		return result;
	}

	/**
	 * 1. Begin Transaction 2. Checks the availability of given Id from existing
	 * database. 3. Update the details belonging to the given Id 4. End Transaction
	 * 
	 * @param companyManagerId
	 * @param companyManager
	 * @return result
	 */
	public boolean updateCompanyManagerDetails(int companyManagerId, CompanyManager companyManager) {
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		boolean result = false;
		try {
			EntityManager em = init.getEntityManager();
			CompanyManager cmObj = em.find(CompanyManager.class, companyManagerId);
			if (cmObj != null) {
				em.getTransaction().begin();
				cmObj.setCompanyManagerName(companyManager.getCompanyManagerName());
				cmObj.setCompanyManagerEmailId(companyManager.getCompanyManagerEmailId());
				cmObj.setCompanyManagerPhone(companyManager.getCompanyManagerPhone());
				result = true;
				em.getTransaction().commit();

				em.close();

			} else {
				throw new InvalidChoiceException("Appointment not found");
			}
		} catch (InvalidChoiceException e) {
			e.getStackTrace();
		}
		logger.info("Company manager details updated successfully");
		return result;
	}

	/**
	 * 1. Begin Transaction 2. Add Company manager details into database 3. Commits
	 * Transaction
	 * 
	 * @param companyManager
	 * @return result
	 */

	public boolean addInvestor(Investor investor) {
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		boolean result = false;
		try {
			EntityManager em = init.getEntityManager();
			em.getTransaction().begin();
			// Persist merges the given entity object into the database
			em.persist(em.merge(investor));
			result = true;
			em.getTransaction().commit();
			em.close();
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		logger.info("Investor added successfully");
		return result;

	}

	/**
	 * 1. Begin Transaction 2. Checks the availability of given Id from existing
	 * database. 3. Remove the details of given Id 4. End Transaction
	 * 
	 * @param investorId
	 * @return result
	 */
	public boolean deleteInvestor(int investorId) {
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		boolean result = false;
		EntityManager em = init.getEntityManager();
		try {
			Investor investor = em.find(Investor.class, investorId);
			if (investor != null) {
				em.getTransaction().begin();
				// Removes the given entity object from the database
				em.remove(investor);
				result = true;
				em.getTransaction().commit();
				em.close();
			} else {
				throw new UserNotFoundException("Investor not found");
			}
		} catch (Exception e) {
			e.getMessage();
			em.getTransaction().rollback();
		}
		logger.info("Investor deleted successfully");
		return result;
	}

	/**
	 * 1. Begin Transaction 2. Checks the availability of given Id from existing
	 * database. 3. Update the details belonging to the given Id 4. End Transaction
	 * 
	 * @param companyManagerId
	 * @param companyManager
	 * @return result
	 */
	public boolean updateInvestorDetails(int investorId, Investor investor) {
		Logger logger = Logger.getLogger("TradingAdminDAOImpl.class");
		EntityManager em = init.getEntityManager();
		boolean result = false;
		try {
			Investor investortemp = em.find(Investor.class, investorId);
			if (investortemp != null) {
				em.getTransaction().begin();
				investortemp.setInvestorName(investor.getInvestorName());
				investortemp.setInvestorPanNum(investor.getInvestorPanNum());
				investortemp.setInvestorEmailId(investor.getInvestorEmailId());
				investortemp.setInvestorPhone(investor.getInvestorPhone());
				investortemp.setNoOfStocks(investor.getNoOfStocks());
				investortemp.setInvestorsInvestment(investor.getInvestorsInvestment());
				result = true;
				em.getTransaction().commit();
				em.close();

			} else {
				throw new UserNotFoundException("Enter Valid Id");
			}
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		logger.info("Investor details updated successfully");
		return result;
	}

	/**
	 * This method sets maximum limits to the stock price
	 * 
	 * @return
	 */

	public int setMaximumAmountOnStock() {

		return 10000;
	}

	/**
	 * This method sets limit to maximum amount spent on one company
	 * 
	 * @param stockSharePrice
	 * @return maxAmount
	 */

	public int setMaximumAmountOnCompany(int stockSharePrice) {
		int maxAmount = 0;
		try {
			if (stockSharePrice <= setMaximumAmountOnStock()) {
				if (stockSharePrice >= 1000) {
					maxAmount = 500000;
				} else if (stockSharePrice < 1000 && stockSharePrice >= 500) {
					maxAmount = 375000;
				} else if (stockSharePrice < 500 && stockSharePrice > 0) {
					maxAmount = 150000;
				} else
					maxAmount = 0;
			}

			else {
				throw new MaximumAmountOnStockException("Stock price reached its maximum limit!!!");
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
		return maxAmount;
	}

}
