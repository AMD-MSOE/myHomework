package com.amd.myhomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SettingsActivity extends Activity {
	
	ListView lstData;
	DataAdapter dataAdapter;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		lstData = (ListView)findViewById(R.id.activity_settings_lst_data);
	}
	
	private class DataAdapter extends BaseAdapter {
		
		private String[] data = {"Remove all classes","Remove all homework"};

		@Override
		public int getCount() {
			return 2;
		}

		@Override
		public Object getItem(int position) {
			return data[position];
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView message = new TextView(SettingsActivity.this);
			message.setText(data[position]);
			
			message.setCompoundDrawables(SettingsActivity.this.getResources().getDrawable(R.drawable.trash), null, null, null);
			
			return message;
		}
		
	}
}
