package com.rihui.mvc.annotation;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("personAction")
@Scope("prototype")
public class PersonAction {
	@Resource(name = "personService")
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
