package com.rihui.mvc.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService{
	@Resource(name="personDao")
	private PersonDao personDao;
	
	public void save() {
		this.personDao.save();
	}

	public void update() {
		this.personDao.update();
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
