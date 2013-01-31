package com.amd.myhomework.adapters;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.amd.myhomework.R;

/**
 * This list adapter can be used for homework, or for classes or any list that simply
 * want to display a simple text view with a colored background
 * @author Josh Ault
 *
 */
public class SimpleListAdapter<T extends Object> extends BaseAdapter {
	
	List<T> items;
	Context context;
	int borderColor, backgroundColor;
	
	public SimpleListAdapter(Context context, List<T> items, int color) {
		this.items = items;
		this.context = context;
		this.borderColor = color;
		this.backgroundColor = Color.argb(60, Color.red(color), Color.green(color), Color.blue(color));
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
    	LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    	View view = vi.inflate(R.layout.adapter_item, null);
    	
    	TextView txtGroup = (TextView) view.findViewById(R.id.adapter_item_lbl_name);
    	
    	txtGroup.setText(items.get(position).toString());
    	view.setBackgroundColor(borderColor);
    	
    	view.findViewById(R.id.adapter_item_transparent).setBackgroundColor(backgroundColor);
    	
		return view;
	}

}
