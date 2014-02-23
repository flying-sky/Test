package com.rihui.mvc.annotation;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{

	public void save() {
		System.out.println("save person ... ");
	}

	public void update() {
		System.out.println("update person ... ");
	}

}
