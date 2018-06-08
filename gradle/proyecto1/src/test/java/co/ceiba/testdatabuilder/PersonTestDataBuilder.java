package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "Rafael";
		this.lastName = "Barrientos";
	}
	
	public PersonTestDataBuilder whitName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder whitLastName(String lastname) {
		this.lastName = lastname;
		return this;
	}
	
	public Person build(){
		return new Person(this.name,this.lastName);
	}
}
