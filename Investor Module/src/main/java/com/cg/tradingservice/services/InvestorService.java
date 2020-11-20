 package com.cg.tradingservice.services;

import com.cg.tradingservice.entities.Investment;

public interface InvestorService {
		public boolean buyStock(int companySymbol, int count, int investorId);
		public boolean showStock();
		public boolean sellStock(int investorId, int investmentId);
		public boolean watchlistStock(int investorId);		
}
