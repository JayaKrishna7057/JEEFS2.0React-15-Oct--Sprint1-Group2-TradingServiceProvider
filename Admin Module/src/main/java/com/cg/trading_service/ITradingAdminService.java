/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */

package com.cg.trading_service;

import com.cg.trading_model.CompanyManager;
import com.cg.trading_model.Investor;

public interface ITradingAdminService {

	/**
	 * Declaration of methods to be implemented by TradingAdminServiceImpl
	 * 
	 */

	public boolean addCompanyManager(CompanyManager companyManager);

	public boolean deleteCompanyManager(int companyManagerId);

	public boolean updateCompanyManagerDetails(int companyManagerId, CompanyManager companyManager);

	public boolean addInvestor(Investor investor);

	public boolean deleteInvestor(int investorId);

	public boolean updateInvestorDetails(int investorId, Investor investor);

	public int setMaximumAmountOnStock();

	public int setMaximumAmountOnCompany(int stockPrice);

}
