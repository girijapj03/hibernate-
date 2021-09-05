package com.giri.custom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class CustomerEntity {
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_from")
	private String from;
	@Column(name = "customer_to")
	private String to;
	@Column(name = "customer_addr")
	private String address;
	@Column(name = "customer_pasportno")
	private int passpostNum;
	@Column(name = "customer_edu")
	private String education;// b_id int AI PK
	@Column(name = "customer_married")
	private boolean married;

	public CustomerEntity() {
	}

	public CustomerEntity(int id, String customerName, String from, String to, String address, int passpostNum,
			String education, boolean married) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.from = from;
		this.to = to;
		this.address = address;
		this.passpostNum = passpostNum;
		this.education = education;
		this.married = married;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + id;
		result = prime * result + (married ? 1231 : 1237);
		result = prime * result + passpostNum;
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id != other.id)
			return false;
		if (married != other.married)
			return false;
		if (passpostNum != other.passpostNum)
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", customerName=" + customerName + ", from=" + from + ", to=" + to
				+ ", address=" + address + ", passpostNum=" + passpostNum + ", education=" + education + ", married="
				+ married + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPasspostNum() {
		return passpostNum;
	}

	public void setPasspostNum(int passpostNum) {
		this.passpostNum = passpostNum;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

}
