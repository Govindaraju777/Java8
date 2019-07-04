package com.govind.java8.streams;

public class TradeInput {

	private String city;
	private String counry;
	private String gender;
	private Double salary;

	
	public TradeInput() {
	}
	public TradeInput(String city, String counry, String gender, Double salary) {
		super();
		this.city = city;
		this.counry = counry;
		this.gender = gender;
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounry() {
		return counry;
	}

	public void setCounry(String counry) {
		this.counry = counry;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TradeInput [city=" + city + ", counry=" + counry + ", gender=" + gender + ", salary=" + salary + "]";
	}
	

}
