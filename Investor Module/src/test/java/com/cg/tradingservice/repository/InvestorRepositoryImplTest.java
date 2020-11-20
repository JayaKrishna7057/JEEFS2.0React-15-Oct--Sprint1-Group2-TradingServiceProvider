 package com.cg.tradingservice.repository;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.tradingservice.entities.Stock;
import com.cg.tradingservice.util.JPAUtil;

class InvestorRepositoryImplTest {
	 Stock stock;
	@BeforeEach
	void setUp() throws Exception {
		stock=new Stock();
	}

	@AfterEach
	void tearDown() throws Exception {
		stock=null;
	}

	@Test
	void testBuyStock() {
		
		//fail("Not yet implemented");
	}

	@Test
	void testShowStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		InvestorRepositoryImpl vv=new InvestorRepositoryImpl();
		 v=vv.buyStock(8,1,1);
			assertTrue(v);
		//fail("Not yet implemented");
	}

	@Test
	void testSellStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		InvestorRepositoryImpl vv=new InvestorRepositoryImpl();
		 v=vv.sellStock(1,4);
			assertTrue(v);
		//fail("Not yet implemented");
	}

	@Test
	void testWatchlistStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		InvestorRepositoryImpl vv=new InvestorRepositoryImpl();
		 v=vv.watchlistStock(1);
			assertTrue(v);
		//fail("Not yet implemented");
	}

}
