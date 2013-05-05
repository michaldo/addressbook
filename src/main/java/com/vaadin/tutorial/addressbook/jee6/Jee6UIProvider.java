package com.vaadin.tutorial.addressbook.jee6;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UICreateEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

public class Jee6UIProvider extends UIProvider {

	@Override
	public UI createInstance(UICreateEvent event) {
		return ((Jee6VaadinServlet)VaadinServlet.getCurrent()).getUI();
	}

	@Override
	public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
		return ((Jee6VaadinServlet)VaadinServlet.getCurrent()).getUI().getClass();
	}

}
