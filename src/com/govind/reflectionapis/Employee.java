/**
 * 
 */
package com.govind.reflectionapis;

import java.util.Date;

/**
 * @author govindaraju.v
 *
 */
public class Employee {

	private String empId;
	private String empName;
	private Date createDate;
	
 
	public Employee(String empId, String empName, Date createDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.createDate = createDate;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
