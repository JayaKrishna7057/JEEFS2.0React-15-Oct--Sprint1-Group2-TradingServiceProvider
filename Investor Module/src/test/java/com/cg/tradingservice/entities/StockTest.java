 package com.cg.tradingservice.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTest {
	  Stock stock;
	@BeforeEach
	void setUp() throws Exception {
		stock=new Stock(1,"JIO",6,"LIMIT",10,15000);
	}

	@AfterEach
	void tearDown() throws Exception {
		stock=null;
	}

	@Test
	void testStock() {
		Stock stock=new Stock();
		 assertTrue(stock instanceof Stock);
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockCompanySymbol() {
		int expected=1;
		int actual=stock.getStockCompanySymbol();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockCompanySymbol() {
		int expected=1;
		int actual=stock.getStockCompanySymbol();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockCompanyName() {
		String expected="JIO";
		String actual=stock.getStockCompanyName();          
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockCompanyName() {
		String expected="JIO";
		String actual=stock.getStockCompanyName();          
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockShareQuantity() {
		int expected=6;
		int actual=stock.getStockShareQuantity();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockShareQuantity() {
		int expected=6;
		int actual=stock.getStockShareQuantity();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockOrderType() {
		String expected="LIMIT";
		String actual=stock.getStockOrderType();
		assertTrue(actual.equals(expected));
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockOrderType() {
		String expected="LIMIT";
		String actual=stock.getStockOrderType();
		assertTrue(actual.equals(expected));
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockSharePrice() {
		int expected=10;
		int actual=stock.getStockSharePrice();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockSharePrice() {
		int expected=10;
		int actual=stock.getStockSharePrice();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testGetStockMaxAmount() {
		int expected=15000;
		int actual=stock.getStockMaxAmount();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testSetStockMaxAmount() {
		int expected=15000;
		int actual=stock.getStockMaxAmount();
		assertTrue(actual==expected);
		//fail("Not yet implemented");
	}

	@Test
	void testStockIntStringIntStringIntInt() {
		//fail("Not yet implemented");
	}

	

}
