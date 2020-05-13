package com.appinicio.pruebas.entity;

import java.util.Date;

public class Registro {

	private Date date;
	private String project;
	private String workItem;
	private String task;
	private Float hours;
	
	public Registro(Date date, String project, String workItem, String task, Float hours) {
		this.date = date;
		this.project = project;
		this.workItem = workItem;
		this.task = task;
		this.hours = hours;
	}
	
	public Registro() {
		
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public String getWorkItem() {
		return workItem;
	}
	
	public void setWorkItem(String workItem) {
		this.workItem = workItem;
	}
	
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public Float getHours() {
		return hours;
	}
	
	public void setHours(Float hours) {
		this.hours = hours;
	}
}
