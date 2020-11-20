/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_dao;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;
import com.cg.trading_util.JPAUtil;

class TradingAdminDaoImplTest {

	TradingAdminDAOImpl tradeTest = new TradingAdminDAOImpl();
	JPAUtil initialize = new JPAUtil();
	Investor investor;
	CompanyManager companyManager;

	@BeforeEach
	void setUp() throws Exception {
		investor = new Investor();
		companyManager = new CompanyManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		investor = null;
		companyManager = null;
	}

	@Test
	void testAddInvestor() {
		EntityManager em = initialize.getEntityManager();
		assertTrue(tradeTest
				.addInvestor(new Investor(2, "jayakrishna", "CMJH2344J", "jayakrishna@gmail.com", "98878455", 0, 0)));
	}

	@Test
	void testDeleteInvestor() {
		EntityManager em = initialize.getEntityManager();
		assertTrue(tradeTest.deleteInvestor(2));
	}

	@Test
	void testUpdateInvestor() {
		EntityManager em = initialize.getEntityManager();
		assertTrue(tradeTest.updateInvestorDetails(2,
				new Investor(2, "jayakrishna", "CMJH2344J", "jayakrishna@gmail.com", "98878455", 0, 0)));
	}

	@Test
	void testAddCompanyManager() {
		EntityManager em = initialize.getEntityManager();
		assertTrue(tradeTest.addCompanyManager(new CompanyManager(2, "ASHA", "asha@gmail.com", "08512")));
	}

	@Test
	void testDeleteCompanyManager() {
		EntityManager em = initialize.getEntityManager();
		boolean result = false;
		result = tradeTest.deleteCompanyManager(2);
		assertTrue(result);
	}

	@Test
	void testUpdateCompanyManager() {
		EntityManager em = initialize.getEntityManager();
		assertTrue(
				tradeTest.updateCompanyManagerDetails(2, new CompanyManager(2, "ASHA", "asha123@gmail.com", "08512")));
	}

	@Test
	void testSetMaxamountOnStock() {
		int expected = 10000;
		int actual = tradeTest.setMaximumAmountOnStock();
		assertTrue(expected == actual);
	}

	@Test
	void testSetMaxamountOnCompany() {
		int expected = 0;
		int actual = tradeTest.setMaximumAmountOnCompany(0);
		assertTrue(expected == actual);
	}

}
