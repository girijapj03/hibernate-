package com.giri.bird.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.giri.bird.constants.BirdType;



@Entity
@Table(name = "bird")
public class BirdEntity {
	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_lifespan")
	private int lifespan;
	@Column(name = "flying_hours")
	private int flyingHours;
	@Column(name = "b_lyingEggs")
	private boolean eggs;
	@Column(name = "b_nest")
	private boolean nest;//b_id int AI PK 
	@Column(name = "b_wings")
	private String wings;
	@Column(name = "b_type")
	private BirdType type;
	
	public BirdEntity() {}

	public BirdEntity(int id, String name, String color, int lifespan, int flyingHours, boolean eggs, boolean nest,
			String wings, BirdType type) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.lifespan = lifespan;
		this.flyingHours = flyingHours;
		this.eggs = eggs;
		this.nest = nest;
		this.wings = wings;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", color=" + color + ", lifespan=" + lifespan
				+ ", flyingHours=" + flyingHours + ", eggs=" + eggs + ", nest=" + nest + ", wings=" + wings + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (eggs ? 1231 : 1237);
		result = prime * result + flyingHours;
		result = prime * result + id;
		result = prime * result + lifespan;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (nest ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((wings == null) ? 0 : wings.hashCode());
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
		BirdEntity other = (BirdEntity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (eggs != other.eggs)
			return false;
		if (flyingHours != other.flyingHours)
			return false;
		if (id != other.id)
			return false;
		if (lifespan != other.lifespan)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nest != other.nest)
			return false;
		if (type != other.type)
			return false;
		if (wings == null) {
			if (other.wings != null)
				return false;
		} else if (!wings.equals(other.wings))
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	public int getFlyingHours() {
		return flyingHours;
	}

	public void setFlyingHours(int flyingHours) {
		this.flyingHours = flyingHours;
	}

	public boolean isEggs() {
		return eggs;
	}

	public void setEggs(boolean eggs) {
		this.eggs = eggs;
	}

	public boolean isNest() {
		return nest;
	}

	public void setNest(boolean nest) {
		this.nest = nest;
	}

	public String getWings() {
		return wings;
	}

	public void setWings(String wings) {
		this.wings = wings;
	}

	public BirdType getType() {
		return type;
	}

	public void setType(BirdType type) {
		this.type = type;
	}
}
