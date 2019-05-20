package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		
		activities.add(new Activity("Swimming", 55));
		activities.add(new Activity("Cycling", 120));
		activities.add(new Activity("Karate", 60));
		activities.add(new Activity("Kung-Fu", 60));
		activities.add(new Activity("Football", 90));
		activities.add(new Activity("Rugby", 90));
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		return new Activity("Ping-Pong", 45);
	}
}
