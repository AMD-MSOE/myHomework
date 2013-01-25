package com.amd.myhomework;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.amd.myhomework.adapters.SimpleListAdapter;

public class classesActivity extends Activity{

	ListView lstClasses;
	SimpleListAdapter adapterClasses;
	List<Object> classes;
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_classes);
		
		classes = new ArrayList<Object>();
		lstClasses = (ListView)findViewById(R.id.activity_classes_lst_classes);
		adapterClasses = new SimpleListAdapter(this, classes, Color.BLUE);
	}
	
	public void leftButtonClicked(View v) {
		
	}
	
	public void rightButtonClicked(View v) {
		addClass();
	}
	
	public void addClass() {
		
	}

}
