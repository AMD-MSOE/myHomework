package com.amd.myhomework;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import com.amd.myhomework.R.id;
import com.amd.myhomework.adapters.SimpleListAdapter;
import com.amd.myhomework.models.Class;
import com.amd.myhomework.sharedpreferences.SavePreferences;

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
		adapterClasses = new SimpleListAdapter<Class>(this, classes);
		lstClasses.setAdapter(adapterClasses);
		SavePreferences.getInstance().setContext(this);
	}
	
	public void leftButtonClicked(View v) {
		this.onBackPressed();
	}
	
	public void rightButtonClicked(View v) {
		showClassDialog();
	}
	
	public void addClass(String name, int color) {
		classes.add(new Class(name, color));
		adapterClasses.notifyDataSetChanged();
	}
	
	public void showClassDialog() {
		final Dialog dialog = new Dialog(this, android.R.style.Theme_Holo_Light_Dialog);
		dialog.setTitle("Add a Class");
		dialog.setContentView(R.layout.dialog_add_class);
		
		final EditText className = (EditText)dialog.findViewById(R.id.dialog_add_class_txt_name);
		final RadioGroup colorButtons = (RadioGroup)dialog.findViewById(R.id.dialog_add_class_grp_color);
		
		final RadioButton blue = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_blue);
		final RadioButton gray = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_gray);
		final RadioButton green = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_green);
		final RadioButton orange = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_orange);
		final RadioButton pink = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_pink);
		final RadioButton purple = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_purple);
		final RadioButton red = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_red);
		final RadioButton yellow = (RadioButton)dialog.findViewById(R.id.dialog_add_class_grp_btn_yellow);
		
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
			public void onClick(View v) {
				String name = className.getText().toString();
				int classColor = Color.WHITE;
				if (colorButtons.getCheckedRadioButtonId() != -1){
					ToggleButton selectedColor = (ToggleButton)dialog.findViewById(colorButtons.getCheckedRadioButtonId());
					if (selectedColor.equals(blue)){
						classColor = Color.BLUE;
					} else if (selectedColor.equals(gray)){
						classColor = Color.GRAY;
					} else if (selectedColor.equals(green)){
						classColor = Color.GREEN;
					} else if (selectedColor.equals(orange)){
						classColor = Color.rgb(231, 143, 24); // orange
					} else if (selectedColor.equals(pink)){
						classColor = Color.rgb(221, 34, 165); // pink
					} else if (selectedColor.equals(purple)){
						classColor = Color.rgb(146, 71, 106); // purple
					} else if (selectedColor.equals(red)){
						classColor = Color.RED;
					} else if (selectedColor.equals(yellow)){
						classColor = Color.YELLOW;
					}
				} else {
					classColor = Color.WHITE;
				}
				addClass(name, classColor);
				dialog.dismiss();
			}
			
		});
		
		dialog.show();
		dialog.getWindow().setGravity(Gravity.CENTER);
	}

}
