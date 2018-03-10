package com.example.demo.dto;

import java.math.BigDecimal;

public class QuoteStock {

	private String quoteName;

	private BigDecimal quotePrice;

	public QuoteStock() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuoteStock [quoteName=" + quoteName + ", quotePrice=" + quotePrice + "]";
	}

	/**
	 * @return the quoteName
	 */
	public String getQuoteName() {
		return quoteName;
	}

	/**
	 * @param quoteName
	 *            the quoteName to set
	 */
	public void setQuoteName(String quoteName) {
		this.quoteName = quoteName;
	}

	/**
	 * @return the quotePrice
	 */
	public BigDecimal getQuotePrice() {
		return quotePrice;
	}

	/**
	 * @param quotePrice
	 *            the quotePrice to set
	 */
	public void setQuotePrice(BigDecimal quotePrice) {
		this.quotePrice = quotePrice;
	}
}
