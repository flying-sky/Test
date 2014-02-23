package com.rihui.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private Integer pid;
	private String pname;
	private Student student;
	private List lists;
	private Set sets;
	private Map maps;
	private Properties properties;
	
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public Set getSets() {
		return sets;
	}
	public void setSets(Set sets) {
		this.sets = sets;
	}
	public Map getMaps() {
		return maps;
	}
	public void setMaps(Map maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
