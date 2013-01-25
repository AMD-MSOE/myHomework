package com.amd.myhomework.models;

public class Class {

	private String name;
	
	public Class(String name) {
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
