package com.example.demo.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuoteNamesVo {

	private List<String> quoteNames;

	public QuoteNamesVo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param quoteNames
	 */
	public QuoteNamesVo(List<String> quoteNames) {
		super();
		this.quoteNames = quoteNames;
	}

	/**
	 * @return the quoteNames
	 */
	public List<String> getQuoteNames() {
		return quoteNames;
	}

	/**
	 * @param quoteNames
	 *            the quoteNames to set
	 */
	public void setQuoteNames(List<String> quoteNames) {
		this.quoteNames = quoteNames;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuoteNamesVo [quoteNames=" + quoteNames + "]";
	}

}
