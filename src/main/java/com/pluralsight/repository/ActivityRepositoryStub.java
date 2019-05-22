package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	
	private static Logger LOGGER = LogManager.getLogger();

	static ActivityRepositoryStub repository;
	
	List<Activity> activities;
	
	public static ActivityRepositoryStub getInstance() {
		if (repository == null) {
			repository = new ActivityRepositoryStub();
		}
		return repository;
	}
	
	private ActivityRepositoryStub() {
		
		LOGGER.info("Inicializando lista");
		
		activities = new ArrayList<>();
		
		User user = new User("a125958", "Fernando J. Spitz");
		
		activities.add(new Activity("1", "Swimming", 55, user));
		activities.add(new Activity("2", "Cycling", 120, user));
		activities.add(new Activity("3", "Karate", 60, user));
		activities.add(new Activity("4", "Kung-Fu", 60, user));
		activities.add(new Activity("5", "Football", 90, user));
		activities.add(new Activity("6", "Rugby", 90, user));
	}
	
	@Override
	public List<Activity> findAllActivities() {
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		
		//return activities.contains(activityId);
		
		return new Activity("7", "Ping-Pong", 45, new User("a125958", "Fernando J. Spitz"));
	}

	@Override
	public Activity create(Activity activity) {
		LOGGER.info("Agregando actividad: {}", activity);
		
		activities.add(activity);

		return activity;
	}
}
