package proekt.models;

import javax.persistence.Entity;


@Entity
public class Relation extends BaseEntity {

	private String startDestination;
	private String endDestination;

	public String getStartDestination() {
		return startDestination;
	}

	public void setStartDestination(String startDestination) {
		this.startDestination = startDestination;
	}

	public String getEndDestination() {
		return endDestination;
	}

	public void setEndDestination(String endDestination) {
		this.endDestination = endDestination;
	}

}
