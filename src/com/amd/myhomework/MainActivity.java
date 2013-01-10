package com.amd.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button calendarButton;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six_icon_screen);
		
		calendarButton = (Button) findViewById(R.id.calendarButton);
		calendarButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
			}
			
		});
	}
}
