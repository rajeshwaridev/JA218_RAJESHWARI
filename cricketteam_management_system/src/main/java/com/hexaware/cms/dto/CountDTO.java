package com.hexaware.cms.dto;

public class CountDTO {
	private long count;
	private String countryName;
	public CountDTO() {
		super();
	}
	public CountDTO(long count, String countryName) {
		super();
		this.count = count;
		this.countryName = countryName;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "CountDTO [count=" + count + ", countryName=" + countryName + "]";
	}
	
	

}
