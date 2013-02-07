package com.amd.myhomework;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.amd.myhomework.adapters.SimpleListAdapter;
import com.amd.myhomework.models.Homework;
import com.amd.myhomework.sharedpreferences.SavePreferences;

public class HomeworkActivity extends Activity {
	
	private List<Homework> homework;
	private SimpleListAdapter<Homework> adapter;
	private ListView listView;
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.homework);
		
		homework = new ArrayList<Homework>();
		
		adapter = new SimpleListAdapter<Homework>(this, homework);
		
		listView = (ListView)findViewById(R.id.list);
		listView.setAdapter(adapter);
		
		adapter.notifyDataSetChanged();
		SavePreferences.getInstance().setContext(this);
	}
	
	public void leftButtonClicked(View v){
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View v){
		//pass
	}

}
