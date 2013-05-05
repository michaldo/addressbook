package com.vaadin.tutorial.addressbook.jee6;

import javax.inject.Inject;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@WebServlet(urlPatterns = "/*", 
	initParams = { 
		@WebInitParam(name = "UIProvider", value = "com.vaadin.tutorial.addressbook.jee6.Jee6UIProvider") })
public class Jee6VaadinServlet extends VaadinServlet {
	
	@Inject 
    private UI ui;
	
	public UI getUI() {
		return ui;
	}
	
}
