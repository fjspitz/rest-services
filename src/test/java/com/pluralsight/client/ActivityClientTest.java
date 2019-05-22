package com.pluralsight.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.pluralsight.model.Activity;

public class ActivityClientTest {

	@Test
	public void testGet() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("1234");
		
		assertNotNull(activity);
	}
	
	@Test
	public void testGetList() {
		ActivityClient client = new ActivityClient();
		
		List<Activity> activities = client.get();
		
		assertNotNull(activities);
	}
	
	@Test(expected = RuntimeException.class)
	public void testGetWithExceptionBadRequest() {
		ActivityClient client = new ActivityClient();
		
		client.get("123");
	}
}
