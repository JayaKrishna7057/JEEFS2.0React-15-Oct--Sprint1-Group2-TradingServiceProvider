 package com.cg.tradingservice.repository;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.jboss.logging.Logger;

import com.cg.tradingservice.entities.Investment;
import com.cg.tradingservice.entities.Investor;
import com.cg.tradingservice.entities.Stock;
import com.cg.tradingservice.exception.StockLimitException;
import com.cg.tradingservice.exception.UserNotFoundException;
import com.cg.tradingservice.util.JPAUtil;



public class InvestorRepositoryImpl implements InvestorRepository  {

	@Override
	public boolean buyStock(int companySymbol, int count, int investorId) {
		EntityManager em = JPAUtil.getEntityManager();
		Logger logger=Logger.getLogger("InvestorRepositoryImpl.class");
		boolean flag=true;
		int temp =0;
		Stock s = em.find(Stock.class, companySymbol);
		Investor investor = em.find(Investor.class,investorId );
		try {
			if(investor != null) {
		Investment invest = new Investment();
		int price = count * (s.getStockSharePrice());
		try {
		if(price < s.getStockMaxAmount())
		{
		em.getTransaction().begin();
		temp = s.getStockShareQuantity();
		s.setStockShareQuantity(temp - count);
		int bought = investor.getNumOfStocks();
		investor.setNumOfStocks(bought+count);
		investor.setInvestorInvestment(investor.getInvestorInvestment() + price); 
		invest.setInvestmentInvestorId(investorId);
			invest.setInvestmentAmount(price);
			invest.setInvestmentCompanySymbol(companySymbol);
			invest.setInvestmentCompanyName(s.getStockCompanyName());
			invest.setNoOfStocks(count);
			em.persist(invest);
			flag=true;
		System.out.println(+s.getStockCompanySymbol()+" "+s.getStockCompanyName()+ " " +s.getStockOrderType()+ " "+s.getStockSharePrice()+" "+s.getStockShareQuantity() );
	    em.getTransaction().commit();
	     em.close();
		}
		else {
			throw new StockLimitException(" Limit Exceeded");
		}
		}
		catch(StockLimitException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
			}
			else {
				throw new UserNotFoundException("Investor not found");
			}
		}
		catch(UserNotFoundException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		logger.info("End of Dao!");
		return flag;
		}
	
	
		// TODO Auto-generated method stub 
	public boolean showStock() {
		EntityManager em = JPAUtil.getEntityManager();
		Logger logger=Logger.getLogger("InvestorRepositoryImpl.class");
		boolean flag=false;
		TypedQuery<Stock> query = em.createQuery("select s from Stock s", Stock.class);
		List<Stock> list =   query.getResultList();
		for( Stock s:list ){
			System.out.print(s.getStockCompanySymbol()+"     ");
			System.out.print(s.getStockCompanyName()+"     ");
			System.out.print(s.getStockOrderType()+"      ");
			System.out.print(s.getStockSharePrice()+"     ");
			System.out.println(s.getStockShareQuantity()+"    ");
			flag=true;
		}
		logger.info("End of Dao!");
		return flag;
	}


	@Override
	public boolean sellStock(int investorId, int investmentId) {
		EntityManager em = JPAUtil.getEntityManager();
		Logger logger=Logger.getLogger("InvestorRepositoryImpl.class");
		boolean flag=false;
		Stock stock = new Stock();
		Investment investment = em.find(Investment.class,investmentId);
		try {
			if(investment != null) {
		Investor investor = em.find(Investor.class, investment.getInvestmentInvestorId());
		if(stock != null) {
		stock = em.find(Stock.class,investment.getInvestmentCompanySymbol());
		em.getTransaction().begin();
		int num = investment.getNoOfStocks();
		stock.setStockShareQuantity(num +stock.getStockShareQuantity());
		investor.setNumOfStocks(investor.getNumOfStocks() - num);
		investor.setInvestorInvestment(investor.getInvestorInvestment() - investment.getInvestmentAmount());
		em.remove(investment);
		flag=true;
		em.getTransaction().commit();
		em.close();
			}
		else
		{
			throw new UserNotFoundException(" Investor not found");
		}
			}
			else {
				throw new UserNotFoundException("No such Investment Found");
			}
		}
		catch(UserNotFoundException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		logger.info("End of Dao!");
		return flag;
	}

	@Override
	public boolean watchlistStock( int investorId) {
		EntityManager em = JPAUtil.getEntityManager();
		Logger logger=Logger.getLogger("InvestorRepositoryImpl.class");
		boolean flag=false;
		javax.persistence.Query query = em.createQuery("select i from Investment i where i.investmentInvestorId = ?1", Investment.class);
		 query.setParameter(1, investorId);
		List<Investment> list1=(List<Investment>)query.getResultList( );
		for(Investment i : list1) {
			System.out.print(i.getInvestmentId());
			System.out.print(i.getInvestmentCompanySymbol());
			System.out.print(i.getInvestmentCompanyName());
			System.out.print(i.getInvestmentAmount());
        
		}
		logger.info("End of Dao!");
		return flag;
	}
	

}
