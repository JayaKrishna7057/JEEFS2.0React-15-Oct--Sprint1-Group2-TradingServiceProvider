/**
 * Desc -  Stock Management System which is used by investors to buy stocks/shares of a company.
 * Admin Module
 * @author Janani S
 */
package com.cg.trading_exception;
/**
 * This Exception class is used when user chooses invalid choice
 * @author Soft
 *
 */
public class InvalidChoiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidChoiceException(String message) {
		super(message);
	}

}
