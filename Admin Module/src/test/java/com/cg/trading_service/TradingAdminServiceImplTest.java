/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.trading_dao.TradingAdminDAOImpl;
import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;

class TradingAdminServiceImplTest {

	TradingAdminDAOImpl service = new TradingAdminDAOImpl();

	Investor investor;
	CompanyManager companymanager;

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void testAddInvestor() {
		assertTrue(service
				.addInvestor(new Investor(2, "jayakrishna", "CMJH2344J", "jayakrishna@gmail.com", "98878455", 0, 0)));
	}

	@Test
	void testDeleteInvestor() {
		assertTrue(service.deleteInvestor(2));
	}

	@Test
	void testUpdateInvestorDetails() {
		assertTrue(service.updateInvestorDetails(2,
				new Investor(2, "jayakrishna", "CMJH23441", "jayakrishna@gmail.com", "98878455", 0, 0)));
	}

	@Test
	void testAddCompanyManager() {
		assertTrue(service.addCompanyManager(new CompanyManager(2, "ASHA", "asha@gmail.com", "08512")));
	}

	@Test
	void testDeleteCompanyManager() {
		assertTrue(service.deleteCompanyManager(2));
	}

	@Test
	void testUpdateCompanyManagerDetail() {
		assertTrue(service.updateCompanyManagerDetails(2, new CompanyManager(2, "ASHA", "asha123@gmail.com", "08512")));
	}

	@Test
	void testSetMaxamountOnStock() {
		int expected = 10000;
		int actual = service.setMaximumAmountOnStock();
		assertTrue(expected == actual);
	}

	@Test
	void testSetMaxamountOnCompany() {
		int expected = 0;
		int actual = service.setMaximumAmountOnCompany(0);
		assertTrue(expected == actual);
	}

}
