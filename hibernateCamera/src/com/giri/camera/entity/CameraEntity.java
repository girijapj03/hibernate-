package com.giri.camera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "camera_table")
public class CameraEntity {
	@Column(name = "c_id")
	@Id
	private int id;
	@Column(name = "mod_name")
	private String modelName;
	@Column(name = "resolution")
	private double resolution;
	@Column(name = "brand")
	private String brand;
	@Column(name = "lens_type")
	private String lensType;
	@Column(name = "video_cap_res")
	private double videoCaptureResolution;
	@Column(name = "screen_size")
	private double screenSize;//b_id int AI PK 
	@Column(name = "dis_type")
	private String displayType;
	@Column(name = "origin")
	private String brandOrigin;
	@Column(name = "flash")
	private boolean flash;
	
	public CameraEntity() {}

	public CameraEntity(String modelName, double resolution, String brand, String lensType,
			double videoCaptureResolution, double screenSize, String displayType, String brandOrigin, boolean flash) {
		super();
		this.modelName = modelName;
		this.resolution = resolution;
		this.brand = brand;
		this.lensType = lensType;
		this.videoCaptureResolution = videoCaptureResolution;
		this.screenSize = screenSize;
		this.displayType = displayType;
		this.brandOrigin = brandOrigin;
		this.flash = flash;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", modelName=" + modelName + ", resolution=" + resolution + ", brand=" + brand
				+ ", lensType=" + lensType + ", videoCaptureResolution=" + videoCaptureResolution + ", screenSize="
				+ screenSize + ", displayType=" + displayType + ", brandOrigin=" + brandOrigin + ", flash=" + flash
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((brandOrigin == null) ? 0 : brandOrigin.hashCode());
		result = prime * result + ((displayType == null) ? 0 : displayType.hashCode());
		result = prime * result + (flash ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((lensType == null) ? 0 : lensType.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(resolution);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(screenSize);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(videoCaptureResolution);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CameraEntity other = (CameraEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (brandOrigin == null) {
			if (other.brandOrigin != null)
				return false;
		} else if (!brandOrigin.equals(other.brandOrigin))
			return false;
		if (displayType == null) {
			if (other.displayType != null)
				return false;
		} else if (!displayType.equals(other.displayType))
			return false;
		if (flash != other.flash)
			return false;
		if (id != other.id)
			return false;
		if (lensType == null) {
			if (other.lensType != null)
				return false;
		} else if (!lensType.equals(other.lensType))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (Double.doubleToLongBits(resolution) != Double.doubleToLongBits(other.resolution))
			return false;
		if (Double.doubleToLongBits(screenSize) != Double.doubleToLongBits(other.screenSize))
			return false;
		if (Double.doubleToLongBits(videoCaptureResolution) != Double.doubleToLongBits(other.videoCaptureResolution))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLensType() {
		return lensType;
	}

	public void setLensType(String lensType) {
		this.lensType = lensType;
	}

	public double getVideoCaptureResolution() {
		return videoCaptureResolution;
	}

	public void setVideoCaptureResolution(double videoCaptureResolution) {
		this.videoCaptureResolution = videoCaptureResolution;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getBrandOrigin() {
		return brandOrigin;
	}

	public void setBrandOrigin(String brandOrigin) {
		this.brandOrigin = brandOrigin;
	}

	public boolean isFlash() {
		return flash;
	}

	public void setFlash(boolean flash) {
		this.flash = flash;
	}
	
		
}
