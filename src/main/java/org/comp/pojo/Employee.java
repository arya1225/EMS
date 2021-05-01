package org.comp.pojo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	private int empId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mailId;
	private Date empbirthDate;
	private long mobileNo;
	private String empAddress;
	private String empStatus;
	private Date joinDate;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Date getEmpbirthDate() {
		return empbirthDate;
	}

	public void setEmpbirthDate(Date empbirthDate) {
		this.empbirthDate = empbirthDate;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mailId=" + mailId + ", empbirthDate=" + empbirthDate + ", mobileNo=" + mobileNo
				+ ", empAddress=" + empAddress + ", empStatus=" + empStatus + ", joinDate=" + joinDate + "]";
	}
}
