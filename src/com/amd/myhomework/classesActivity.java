package com.amd.myhomework;

import com.amd.myhomework.models.Class;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.amd.myhomework.adapters.SimpleListAdapter;

public class ClassesActivity extends Activity{

	ListView lstClasses;
	SimpleListAdapter<Class> adapterClasses;
	List<Class> classes;
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_classes);
		
		classes = new ArrayList<Class>();
		lstClasses = (ListView)findViewById(R.id.activity_classes_lst_classes);
		adapterClasses = new SimpleListAdapter<Class>(this, classes, Color.argb(127, 10, 50, 170));
		lstClasses.setAdapter(adapterClasses);
	}
	
	public void leftButtonClicked(View v) {
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View v) {
		addClass();
	}
	
	public void addClass() {
		classes.add(new Class("Class - "+System.currentTimeMillis()));
		adapterClasses.notifyDataSetChanged();
	}

}
