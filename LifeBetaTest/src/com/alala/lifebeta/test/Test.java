package com.alala.lifebeta.test;

import java.io.IOException;
import java.util.List;

import com.alala.lifebeta.Task;
import com.alala.lifebeta.TaskWebService;

import junit.framework.TestCase;

public class Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testShouldWork() throws IOException
	{
		TaskWebService webService = new TaskWebService();
		
		List<Task> tasks = webService.getTasks();
		assertEquals(3, tasks.size());
		Task task = tasks.get(0);
		assertEquals("Email Jenn", task.getName());
	}
}
