package com.amd.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private ImageButton calendarButton;
	private ImageButton homeworkButton;
	private ImageButton classesButton;
	private ImageButton settingsButton;
	private ImageButton aboutButton;
	private enum SwitchActivity {Calendar, Homework, Classes, Settings, Account, About};
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six_icon_screen);
		
		View v = (View) findViewById(R.id.activity_main_action_bar);
		v.findViewById(R.id.btn_left).setVisibility(View.GONE);
		v.findViewById(R.id.btn_right).setVisibility(View.GONE);
		
		calendarButton = (ImageButton) findViewById(R.id.calendarButton);
		calendarButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				switchActivity(SwitchActivity.Calendar);
			}
			
		});
		
		homeworkButton = (ImageButton) findViewById(R.id.homeworkButton);
		homeworkButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				switchActivity(SwitchActivity.Homework);
			}
			
		});
		
		classesButton = (ImageButton) findViewById(R.id.classesButton);
		classesButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				switchActivity(SwitchActivity.Classes);
			}
			
		});
		
		settingsButton = (ImageButton) findViewById(R.id.settingsButton);
		settingsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				switchActivity(SwitchActivity.Settings);
			}
			
		});
		
		aboutButton = (ImageButton) findViewById(R.id.aboutButton);
		aboutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				switchActivity(SwitchActivity.About);
			}
		});
		
	}
	
	private void switchActivity(SwitchActivity type){
		Intent activityChange;
		switch (type){
		case Calendar:
			activityChange = new Intent(MainActivity.this, CalendarActivity.class);
			this.startActivity(activityChange);
			break;
		case Homework:
			activityChange = new Intent(MainActivity.this, HomeworkActivity.class);
			this.startActivity(activityChange);
			break;
		case Classes:
			activityChange = new Intent(MainActivity.this, ClassesActivity.class);
			this.startActivity(activityChange);
			break;
		case Settings:
			activityChange = new Intent(MainActivity.this, SettingsActivity.class);
			this.startActivity(activityChange);
			break;
		case About:
			activityChange = new Intent(MainActivity.this, AboutActivity.class);
			this.startActivity(activityChange);
		}
	}
	
	public void leftButtonClicked(View v){
		//pass
	}
	
	public void rightButtonClicked(View v){
		//pass
	}
}
