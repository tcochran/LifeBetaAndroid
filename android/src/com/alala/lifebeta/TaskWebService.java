package com.alala.lifebeta;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TaskWebService {

	public List<Task> getTasks() throws IOException
	{
	
		URL url = new URL("http://192.168.2.2:3000/tasks");
	    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	    try {
	     InputStream in = new BufferedInputStream(urlConnection.getInputStream());
	     
	     return getTaskList(readSteam(in));
	    }
	    finally {
	     urlConnection.disconnect();
	    }
		
	}
	
	
	protected List<Task> getTaskList (String jsonString){
		Gson gson = new Gson();
		List<Task> taskList = null;
		Type typeOfCollectionOfFoo = new TypeToken<List<Task>>(){}.getType();
				
		taskList = gson.fromJson(jsonString, typeOfCollectionOfFoo);
		return taskList;
	}
	
	private String readSteam(InputStream in) throws IOException
	{
		InputStreamReader is = new InputStreamReader(in);
		StringBuilder sb=new StringBuilder();
		BufferedReader br = new BufferedReader(is);
		String read = br.readLine();
		return read;
	}
}
