package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="listdata")
public class Listdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer listid;
	private Integer userid;
	private String task;
	private String notes;
	public Listdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Listdata(Integer userid, String task, String notes) {
		super();
		this.userid = userid;
		this.task = task;
		this.notes = notes;
	}
	public Integer getListid() {
		return listid;
	}
	public void setListid(Integer listid) {
		this.listid = listid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
