package com.rihui.mvc.xml;

public class PersonServiceImpl implements PersonService{

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
