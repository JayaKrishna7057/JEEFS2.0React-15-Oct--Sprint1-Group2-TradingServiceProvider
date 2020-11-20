/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */
package com.cg.trading_exception;

/**
 * This Exception class handles MaximumAmountOnStockException
 * When the stock amount reached the limit
 * @author Soft
 *
 */
public class MaximumAmountOnStockException extends Exception {

	static final long serialVersionUID = 1L;

	public MaximumAmountOnStockException(String message) {
		super(message);
	}

}
