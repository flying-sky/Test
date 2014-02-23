package com.rihui.mvc.xml;

public class PersonAction {

	private PersonService personService;
	
	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public void savePerson(){
		this.personService.save();
	}
	
	public void updatePerson(){
		this.personService.update();
	}
	
}
