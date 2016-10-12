
package org.sofgen.ers.model;

import java.util.List;

public class SearchResult<T> {

	List<T> results;
	
	int fetchSize;
	
	int page;
	
	int numberOfPages;
	
	public SearchResult(List<T> results, int fetchSize, int page){
		this.results = results;
		this.fetchSize = fetchSize;
		this.page = page;
		this.numberOfPages = results.size()/page;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	public int getFetchSize() {
		return fetchSize;
	}

	public void setFetchSize(int fetchSize) {
		this.fetchSize = fetchSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	
}
