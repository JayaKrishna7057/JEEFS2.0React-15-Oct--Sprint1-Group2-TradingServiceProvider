/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_service;

import com.cg.trading_dao.TradingAdminDAOImpl;
import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;

public class TradingAdminServiceImpl implements ITradingAdminService {

	TradingAdminDAOImpl tradeRepo = new TradingAdminDAOImpl();

	/**
	 * Overriding addCompanyManger method from DAO Layer It passes the entity object
	 * as a parameter to add it into the database Returns true or false
	 */
	@Override
	public boolean addCompanyManager(CompanyManager companyManager) {
		return tradeRepo.addCompanyManager(companyManager);

	}

	/**
	 * Overriding deleteCompanyManger method from DAO Layer. It passes the entity
	 * object as a parameter to delete it from the database. Returns true or false.
	 */
	@Override
	public boolean deleteCompanyManager(int companyManagerId) {

		return tradeRepo.deleteCompanyManager(companyManagerId);

	}

	/**
	 * Overriding updateCompanyManger method from DAO Layer. It passes the entity
	 * object as a parameter to update the details of the particular Id. Returns
	 * true or false.
	 */
	@Override
	public boolean updateCompanyManagerDetails(int companyManagerId, CompanyManager companyManager) {
		return tradeRepo.updateCompanyManagerDetails(companyManagerId, companyManager);
	}

	/**
	 * Overriding addInveator method from DAO Layer It passes the entity object as a
	 * parameter to add it into the database Returns true or false
	 */
	@Override
	public boolean addInvestor(Investor investor) {
		return tradeRepo.addInvestor(investor);
	}

	/**
	 * Overriding deleteInvestor method from DAO Layer. It passes the entity object
	 * as a parameter to delete it from the database. Returns true or false.
	 */
	@Override
	public boolean deleteInvestor(int investorId) {
		return tradeRepo.deleteInvestor(investorId);

	}

	/**
	 * Overriding updateInvestor method from DAO Layer. It passes the entity object
	 * as a parameter to update the details of the particular Id. Returns true or
	 * false.
	 */
	@Override
	public boolean updateInvestorDetails(int investorId, Investor investor) {
		return tradeRepo.updateInvestorDetails(investorId, investor);
	}

	/**
	 * Overriding setMaximumAmountOnStock method from DAO Layer. This methods sets
	 * limit to maximum amount to stocks price.
	 * 
	 */
	@Override
	public int setMaximumAmountOnStock() {

		return tradeRepo.setMaximumAmountOnStock();
	}

	/**
	 * Overriding setMaximumAmountOnCompany method from DAO Layer. This method sets
	 * limit to maximum amount spent on one company
	 */
	@Override
	public int setMaximumAmountOnCompany(int stockPrice) {
		return tradeRepo.setMaximumAmountOnCompany(stockPrice);
	}

}
