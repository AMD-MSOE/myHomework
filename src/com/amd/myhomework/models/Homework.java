package com.amd.myhomework.models;

public class Homework implements MyHomeworkModel {
	
	private String name;
	private Class parentClass;
	
	public Homework(String name, Class parentClass) {
		this.name = name;
		this.parentClass = parentClass;
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
		return parentClass.getColor();
	}
}
