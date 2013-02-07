package com.amd.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalendarActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_calendar);
	}
	
	public void leftButtonClicked(View view) {
		super.onBackPressed();
	}
	
	public void rightButtonClicked(View view) {
		startActivity(new Intent(CalendarActivity.this, HomeworkActivity.class));
	}

}
