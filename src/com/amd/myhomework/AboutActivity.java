package com.amd.myhomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_about);
		
		View v = (View) findViewById(R.id.activity_about_action_bar);
		v.findViewById(R.id.btn_right).setVisibility(View.GONE);
	}
	
	public void leftButtonClicked(View view) {
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View view) {
		//pass
	}
}
