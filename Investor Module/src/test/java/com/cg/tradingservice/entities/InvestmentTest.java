 package com.cg.tradingservice.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestmentTest {
	Investment inv;
	@BeforeEach
	void setUp() throws Exception {
		inv=new Investment(2,9,"ITC",4,1,100);
	}

	@AfterEach
	void tearDown() throws Exception {
		inv=null;
	}

	@Test
	void testInvestment() {
		Investment inv=new Investment();
		assertTrue(inv instanceof Investment);
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestmentId() {
		int expected=2;
		int actual=inv.getInvestmentId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestmentId() {
		int expected=2;
		int actual=inv.getInvestmentId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetInvestmentAmount() {
		int expected=9;
		int actual=inv.getInvestmentAmount();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestmentAmount() {
		int expected=9;
		int actual=inv.getInvestmentAmount();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	} 
	
	
	@Test
	void testGetInvestmentCompanyName() {
		String expected="ITC";
		String actual=inv.getInvestmentCompanyName();
		assertTrue(actual.equals(expected));
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestmentCompanyName() {
		String expected="ITC";
		String actual=inv.getInvestmentCompanyName();
		assertTrue(actual.equals(expected));
		//fail("Not yet implemented");
	}

	@Test
	void testGetInvestmentCompanySymbol() {
		int expected=4;
		int actual=inv.getInvestmentCompanySymbol();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestmentCompanySymbol() {
		int expected=4;
		int actual=inv.getInvestmentCompanySymbol();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	} 

	

	

	@Test
	void testGetInvestmentInvestorId() {
		int expected=1;
		int actual=inv.getInvestmentInvestorId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetInvestmentInvestorId() {
		int expected=1;
		int actual=inv.getInvestmentInvestorId();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	} 

	@Test
	void testGetNoOfStocks() {
		int expected=100;
		int actual=inv.getNoOfStocks();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetNoOfStocks() {
		int expected=100;
		int actual=inv.getNoOfStocks();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	} 

	@Test
	void testInvestmentIntIntStringIntIntInt() {
		
		//fail("Not yet implemented");
	} 

}