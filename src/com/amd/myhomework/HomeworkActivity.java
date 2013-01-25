package com.amd.myhomework;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.amd.myhomework.adapters.SimpleListAdapter;

public class HomeworkActivity extends Activity {
	
	private List<Object> homework;
	private SimpleListAdapter adapter;
	private ListView listView;
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.homework);
		
		homework = new ArrayList<Object>();
		homework.add("one");
		homework.add("two");
		
		adapter = new SimpleListAdapter(this, homework, null);
		
		listView = (ListView)findViewById(R.id.list);
		listView.setAdapter(adapter);
		
		homework.add("three");
		adapter.notifyDataSetChanged();
	}

}
