/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	/**
	 * This method creates the Entity Manager for database
	 * 
	 * @return EntityManager
	 */
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		return emf.createEntityManager();
	}

}
