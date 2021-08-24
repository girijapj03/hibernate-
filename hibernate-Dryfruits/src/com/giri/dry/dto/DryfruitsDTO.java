package com.giri.dry.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dryfruits")
public class DryfruitsDTO implements Serializable{
	@Column(name = "d_id")
	@Id
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_brand")
	private String brand;
	@Column(name = "d_country")
	private String country;
	@Column(name = "d_cost")
	private int cost;
	@Column(name = "d_distributed")
	private String distributedBy;
	public DryfruitsDTO() {}
	public DryfruitsDTO(int id, String name, String brand, String country, int cost, String distributedBy) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.country = country;
		this.cost = cost;
		this.distributedBy = distributedBy;
	}
	@Override
	public String toString() {
		return "DryfruitsDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", country=" + country + ", cost="
				+ cost + ", distributedBy=" + distributedBy + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cost;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((distributedBy == null) ? 0 : distributedBy.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		DryfruitsDTO other = (DryfruitsDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost != other.cost)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (distributedBy == null) {
			if (other.distributedBy != null)
				return false;
		} else if (!distributedBy.equals(other.distributedBy))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDistributedBy() {
		return distributedBy;
	}
	public void setDistributedBy(String distributedBy) {
		this.distributedBy = distributedBy;
	}
	
}
