 package com.cg.tradingservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "INVESTMENT_TABLE")
@Entity
public class Investment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "INVESTMENT_ID")
  private int investmentId;
	
	@Column(name = "INVESTMENT_COMPANYSYMBOL")
  private int investmentCompanySymbol;
	
	@Column(name = "INVESTMENT_COMPANYNAME")
  private String investmentCompanyName;
	
	@Column(name= "INVESTMENT_AMOUNT")
  private int investmentAmount;
	
	@Column(name = "INVESTMENT_INVESTORID")
private int investmentInvestorId;
	
	@Column(name = "NO_OF_STOCKS")
	private int noOfStocks;
	
  public Investment()
  {
	  
  }
  
public Investment(int investmentId, int investmentCompanySymbol, String investmentCompanyName, int investmentAmount,
		int investmentInvestorId, int noOfStocks) {
	super();
	this.investmentId = investmentId;
	this.investmentCompanySymbol = investmentCompanySymbol;
	this.investmentCompanyName = investmentCompanyName;
	this.investmentAmount = investmentAmount;
	this.investmentInvestorId = investmentInvestorId;
	this.noOfStocks = noOfStocks;
}

public int getInvestmentId() {
	return investmentId;
}
public void setInvestmentId(int investmentId) {
	this.investmentId = investmentId;
}
public int getInvestmentCompanySymbol() {
	return investmentCompanySymbol;
}
public void setInvestmentCompanySymbol(int investmentCompanySymbol) {
	this.investmentCompanySymbol = investmentCompanySymbol;
}
public String getInvestmentCompanyName() {
	return investmentCompanyName;
}
public void setInvestmentCompanyName(String investmentCompanyName) {
	this.investmentCompanyName = investmentCompanyName;
}
public int getInvestmentAmount() {
	return investmentAmount;
}
public void setInvestmentAmount(int investmentAmount) {
	this.investmentAmount = investmentAmount;
}
public int getInvestmentInvestorId() {
	return investmentInvestorId;
}
public void setInvestmentInvestorId(int investmentInvestorId) {
	this.investmentInvestorId = investmentInvestorId;
}
public int getNoOfStocks() {
	return noOfStocks;
}
public void setNoOfStocks(int noOfStocks) {
	this.noOfStocks = noOfStocks;
}


}