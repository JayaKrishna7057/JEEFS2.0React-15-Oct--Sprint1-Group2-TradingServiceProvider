/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyManagerTest {

	CompanyManager companyManager;

	// BeforeEach annotated method should be executed before each @Test method in
	// the current class.
	@BeforeEach
	void setUp() throws Exception {
		companyManager = new CompanyManager(1, "SWAPNA", "swapna@gmail.com", "9985742545");
	}

	// AfterEach annotated method should be executed after each @Test method in
	// the current class.
	@AfterEach
	void tearDown() throws Exception {
		companyManager = null;
	}

	// This test case is to check whether the instance is created successfully or
	// not.
	@Test
	void testCompanyManager() {
		companyManager = new CompanyManager();
		assertTrue(companyManager instanceof CompanyManager);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * CompanyManagerId.
	 */
	@Test
	void testGetCompanyManagerId() {
		int expected = 1;
		int actual = companyManager.getCompanyManagerId();
		assertEquals(actual, expected);
	}

	@Test
	void testSetCompanyManagerId() {
		int expected = 1;
		int actual = companyManager.getCompanyManagerId();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * CompanyManagerName.
	 */
	@Test
	void testGetCompanyManagerCompanyName() {
		String expected = "SWAPNA";
		String actual = companyManager.getCompanyManagerName();
		assertEquals(actual, expected);
	}

	@Test
	void testSetCompanyManagerCompanyName() {
		String expected = "SWAPNA";
		String actual = companyManager.getCompanyManagerName();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * CompanyManagerEmail.
	 */
	@Test
	void testGetCompanyManagerEmail() {
		String expected = "swapna@gmail.com";
		String actual = companyManager.getCompanyManagerEmailId();
		assertEquals(actual, expected);
	}

	@Test
	void testSetCompanyManagerEmail() {
		String expected = "swapna@gmail.com";
		String actual = companyManager.getCompanyManagerEmailId();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * CompanyManagerPhone.
	 */
	@Test
	void testGetCompanyManagerPhone() {
		String expected = "9985742545";
		String actual = companyManager.getCompanyManagerPhone();
		assertEquals(actual, expected);
	}

	@Test
	void testSetCompanyManagerPhone() {
		String expected = "9985742545";
		String actual = companyManager.getCompanyManagerPhone();
		assertEquals(actual, expected);
	}

}
