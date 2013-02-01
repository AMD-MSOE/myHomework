package com.amd.myhomework.models;

import java.io.Serializable;

public class Class implements Serializable{

	private String name;
	private int color;
	
	public Class(String name, int color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
