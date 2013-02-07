package com.amd.myhomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_about);
	}
	
	public void leftButtonClicked(View view) {
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View view) {
		//pass
	}
}
