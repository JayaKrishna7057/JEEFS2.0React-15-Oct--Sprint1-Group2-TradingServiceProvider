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

class InvestorTest {
	Investor investor;

	// BeforeEach annotated method should be executed before each @Test method in
	// the current class.
	@BeforeEach
	void setUp() throws Exception {
		investor = new Investor(1, "JAYAKRISHNA", "BSQ7190", "jayakrishna@gmail.com", "9802311852", 0, 0);
	}

	// AfterEach annotated method should be executed after each @Test method in
	// the current class.
	@AfterEach
	void tearDown() throws Exception {
		investor = null;
	}

	// This test case is to check whether the instance is created successfully or
	// not.
	@Test
	void testInvestor() {
		Investor investor = new Investor();
		assertTrue(investor instanceof Investor);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investorId.
	 */
	@Test
	void testGetInvestorId() {
		int expected = 1;
		int actual = investor.getInvestorId();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorId() {
		int expected = 1;
		int actual = investor.getInvestorId();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investorName.
	 */
	@Test
	void testGetInvestorName() {
		String expected = "JAYAKRISHNA";
		String actual = investor.getInvestorName();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorName() {
		String expected = "JAYAKRISHNA";
		String actual = investor.getInvestorName();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investorPanNum.
	 */
	@Test
	void testGetInvestorPannum() {
		String expected = "BSQ7190";
		String actual = investor.getInvestorPanNum();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorPannum() {
		String expected = "BSQ7190";
		String actual = investor.getInvestorPanNum();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investorEmailId.
	 */
	@Test
	void testGetInvestorEmail() {
		String expected = "jayakrishna@gmail.com";
		String actual = investor.getInvestorEmailId();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorEmail() {
		String expected = "jayakrishna@gmail.com";
		String actual = investor.getInvestorEmailId();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investorPhone.
	 */
	@Test
	void testGetInvestorPhone() {
		String expected = "9802311852";
		String actual = investor.getInvestorPhone();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorPhone() {
		String expected = "9802311852";
		String actual = investor.getInvestorPhone();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * number of stocks.
	 */

	@Test
	void testGetNumOfStocks() {
		int expected = 0;
		int actual = investor.getNoOfStocks();
		assertEquals(actual, expected);
	}

	@Test
	void testSetNumOfStocks() {
		int expected = 0;
		int actual = investor.getNoOfStocks();
		assertEquals(actual, expected);
	}

	/**
	 * The below two test cases is used to validate the getters and setters of
	 * investor's invested amount.
	 */
	@Test
	void testGetInvestorInvestment() {
		int expected = 0;
		int actual = investor.getInvestorsInvestment();
		assertEquals(actual, expected);
	}

	@Test
	void testSetInvestorInvestment() {
		int expected = 0;
		int actual = investor.getInvestorsInvestment();
		assertEquals(actual, expected);
	}

}
