package com.spring.command;

public class PageMaker {
	private int page = 1;
	private int perPageNum = 10;
	private String searchType = "";
	private String keyword = "";
	
	private int totalCount;
	private int startPage = 1;
	private int endPage = 1;
	private int realEndPage;
	private boolean prev;
	private boolean next;
	
	private int displayPageNum = 10;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		
		calcData();
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public int getRealEndPage() {
		return realEndPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public boolean isNext() {
		return next;
	}
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	
	public int getStartRow() {
		return (this.displayPageNum - 1) * this.perPageNum;
	}
	
	private void calcData() {
		endPage = (int) (Math.ceil(page / (double) displayPageNum) * displayPageNum);
		startPage = (endPage - displayPageNum) + 1;
		
		realEndPage = (int) (Math.ceil(totalCount / (double) perPageNum));
		
		if (startPage < 0) {
			startPage = 1;
		}
		if (endPage > realEndPage) {
			endPage = realEndPage;
		}
		
		prev = startPage == 1 ? false : true;
		next = endPage < realEndPage ? true : false;
	}
	
}
