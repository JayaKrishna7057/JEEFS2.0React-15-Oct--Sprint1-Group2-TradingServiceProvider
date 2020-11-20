 package com.cg.tradingservice.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestorTest {
	 Investor investor;
	@BeforeEach
	void setUp() throws Exception {
		investor=new Investor(1,"JK","JKJK7057","jaikrishna7057@gmail.com","7995195799",0,0);
	}

	@AfterEach
	void tearDown() throws Exception {
		investor=null;
	}

	@Test
	void testInvestor() {
		 Investor investor=new Investor();
		 assertTrue(investor instanceof Investor);
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorId() {
		int expected=1;
		int actual=investor.getInvestorId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorId() {
		int expected=1;
		int actual=investor.getInvestorId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorName() {
		String expected="JK";
		String actual=investor.getInvestorName();          
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorName() {
		String expected="JK";
		String actual=investor.getInvestorName();          
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorPannum() {
		String expected="JKJK7057";
		String actual=investor.getInvestorPannum();       
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorPannum() {
		String expected="JKJK7057";
		String actual=investor.getInvestorPannum();       
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorEmail() {
		String expected="jaikrishna7057@gmail.com";
		String actual=investor.getInvestorEmail();      
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorEmail() {
		String expected="jaikrishna7057@gmail.com";
		String actual=investor.getInvestorEmail();      
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorPhone() {
		String expected="7995195799";
		String actual=investor.getInvestorPhone();       
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorPhone() {
		String expected="7995195799";
		String actual=investor.getInvestorPhone();      
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testGetNumOfStocks() {
		int expected=0;
		int actual=investor.getNumOfStocks();
		assertTrue(expected==actual);
		//fail("Not yet implemented");
	}

	@Test
	void testSetNumOfStocks() {
		int expected=0;
		int actual=investor.getNumOfStocks();
		assertTrue(expected==actual);
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestorInvestment() {
		int expected=0;
		int actual=investor.getInvestorInvestment();
		assertTrue(expected==actual);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestorInvestment() {
		int expected=0;
		int actual=investor.getInvestorInvestment();
		assertTrue(expected==actual);
		//fail("Not yet implemented");
	}

	@Test
	void testInvestorIntStringStringStringStringIntInt() {
		
		//fail("Not yet implemented");
	}

}
