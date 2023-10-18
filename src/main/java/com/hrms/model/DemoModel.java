package com.hrms.model;

public class DemoModel {
	
	public String name;
	public int id;
	public DemoModel(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public DemoModel() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
