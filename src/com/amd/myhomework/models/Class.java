package com.amd.myhomework.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Class implements Serializable, MyHomeworkModel{

	private String name;
	private int color;
	
	public Class(String name, int color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}

	@Override
	public int getColor() {
		return color;
	}
}
