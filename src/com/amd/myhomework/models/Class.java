package com.amd.myhomework.models;

import java.io.Serializable;

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
