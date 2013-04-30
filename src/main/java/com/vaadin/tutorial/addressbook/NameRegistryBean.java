package com.vaadin.tutorial.addressbook;

import javax.ejb.Stateless;

@Stateless
public class NameRegistryBean {
	
	public String[] getFirstNames(){
		return new String[]{ "Peter", "Alice", "Joshua", "Mike", "Olivia",
			"Nina", "Alex", "Rita", "Dan", "Umberto", "Henrik", "Rene",
			"Lisa", "Marge" };
	}
	
	public String[] getLastNames() {
		return new String[]{ "Smith", "Gordon", "Simpson", "Brown", "Clavel",
			"Simons", "Verne", "Scott", "Allison", "Gates", "Rowling",
			"Barks", "Ross", "Schneider", "Tate" };
	}

}
