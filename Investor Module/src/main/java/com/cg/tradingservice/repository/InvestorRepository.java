 package com.cg.tradingservice.repository;

import com.cg.tradingservice.entities.Investment;

public interface InvestorRepository {
		public boolean buyStock(int companySymbol, int count,int investorId);
		public boolean showStock();
		public boolean sellStock(int investorId, int investmentId);
		public boolean watchlistStock(int investorId);
}
