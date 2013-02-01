package com.amd.myhomework.models;

public class Homework {
	
	private String name;
	
	public Homework(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
