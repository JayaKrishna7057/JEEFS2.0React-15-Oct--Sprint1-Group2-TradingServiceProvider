 package com.cg.tradingservice.services;

import com.cg.tradingservice.entities.Investment;
import com.cg.tradingservice.repository.InvestorRepositoryImpl;

public class InvestorServiceImpl implements InvestorService {
	InvestorRepositoryImpl ad = new InvestorRepositoryImpl();
	

	@Override
	public boolean buyStock(int companySymbol, int count, int investorId) {
		// TODO Auto-generated method stub
		ad.buyStock(companySymbol,count,investorId);
		return true;
	}
    @Override
	public boolean showStock() {
		ad.showStock();
		return true;
	}
	@Override
	public boolean sellStock(int investorId, int investmentId) {
		// TODO Auto-generated method stub
		ad.sellStock( investorId,  investmentId);
		return true;
	}

	@Override
	public boolean watchlistStock(int investorId) {
		// TODO Auto-generated method stub
		ad.watchlistStock( investorId);
		return true;
	}
	

}
