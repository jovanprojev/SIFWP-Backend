package proekt.models;

import javax.persistence.Entity;

@Entity
public class Pin extends BaseEntity {
	private enum Type {
		KAFE_NA_PAT, POLICIJA_NA_PAT, RABOTA_NA_PAT
	}
	
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private double latitude;
	private double longitude;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	
}
