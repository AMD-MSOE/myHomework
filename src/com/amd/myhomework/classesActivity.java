package com.amd.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class classesActivity extends Activity{

	Button button;
	MainActivity main = new MainActivity();

	@Override
	public void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.classes);
	}

	public void addListenerOnButton() {

		button = (Button) findViewById(R.id.btnBack);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				switchActivity();

			}



		});

	}
	private void switchActivity() {
		Intent answer = new Intent(classesActivity.this, MainActivity.class);

		this.startActivity(answer);

	}

}
