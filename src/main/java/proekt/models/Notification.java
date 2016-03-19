package proekt.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Notification extends BaseEntity {

	@OneToOne
	private User user;
	private Date date;
	private String message;
	private int likes;
	private int dislikes;
	@ManyToOne
	private Relation relation;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Pin> pins;

	public Notification() {
		pins = new ArrayList<Pin>();
	}

	public void addPin(Pin pin) {
		pins.add(pin);
	}

	public List<Pin> getPins() {
		return pins;
	}

	public void setPins(List<Pin> pins) {
		this.pins = pins;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

}
