package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	@GeneratedValue
	int id;
	String subj;
	String desc;
	int unit;
	
	public Subject() {
		super();
	}
	public Subject(int id, String subj, String desc, int unit) {
		super();
		this.id = id;
		this.subj = subj;
		this.desc = desc;
		this.unit = unit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", subj=" + subj + ", desc=" + desc + ", unit=" + unit + "]";
	}
	
	
	
	
	
}
