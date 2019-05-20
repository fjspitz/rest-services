package com.pluralsight.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {
	
	private String description;
	private int duration;
	
	public Activity() { }
	
	public Activity(String description, int duration) {
		super();
		this.description = description;
		this.duration = duration;
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
}
