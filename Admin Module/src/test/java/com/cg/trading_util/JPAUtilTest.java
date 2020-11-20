/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */
package com.cg.trading_util;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JPAUtilTest {
	JPAUtil jpaUtil;

	// BeforeEach annotated method should be executed before each @Test method in
	// the current class.
	@BeforeEach
	void setUp() throws Exception {
		jpaUtil = new JPAUtil();
	}

	// AfterEach annotated method should be executed after each @Test method in
	// the current class.
	@AfterEach
	void tearDown() throws Exception {
		jpaUtil = null;
	}

	// Test annotation tells JUnit that the public void method to which it is
	// attached can be run as a test case.
	@Test
	void testGetEntityManager() {
		EntityManager actual = jpaUtil.getEntityManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		assertNotNull(actual);
		assertNotNull(em);
	}

}