package com.amd.myhomework;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import com.amd.myhomework.adapters.SimpleListAdapter;
import com.amd.myhomework.models.Class;

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
		adapterClasses = new SimpleListAdapter<Class>(this, classes, Color.rgb(255, 0, 0));
		lstClasses.setAdapter(adapterClasses);
	}
	
	public void leftButtonClicked(View v) {
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View v) {
		showClassDialog();
		addClass();
	}
	
	public void addClass() {
		classes.add(new Class("Class - "+System.currentTimeMillis()));
		adapterClasses.notifyDataSetChanged();
	}
	
	public void showClassDialog() {
		final Dialog dialog = new Dialog(this, android.R.style.Theme_Holo_Light_Dialog);
		dialog.setTitle("Add a Class");
		dialog.setContentView(R.layout.dialog_add_class);
		
		Button cancelButton = (Button)dialog.findViewById(R.id.dialog_add_class_btn_cancel);
		cancelButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
			
		});
		
		Button addButton = (Button)dialog.findViewById(R.id.dialog_add_class_btn_add);
		addButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
			}
			
		});
		
		dialog.show();
		dialog.getWindow().setGravity(Gravity.CENTER);
	}

}
