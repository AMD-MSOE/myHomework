package com.amd.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	ImageButton calendarButton;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six_icon_screen);
		
		calendarButton = (ImageButton) findViewById(R.id.calendarButton);
		calendarButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				goToCalendar();
			}
			
		});
		
	}
	
	private void goToCalendar() {
		Intent calendarChange = new Intent(MainActivity.this, CalendarActivity.class);
		this.startActivity(calendarChange);
	}
}
