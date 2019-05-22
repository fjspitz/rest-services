package com.pluralsight.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {
	
	private String id;
	private String description;
	private int duration;
	private User user;
	
	public Activity() { }
	
	public Activity(String id, String description, int duration, User user) {
		super();
		this.id = id;
		this.description = description;
		this.duration = duration;
		this.user = user;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
