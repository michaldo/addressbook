package com.vaadin.tutorial.addressbook.jee6;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UICreateEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.ui.UI;

public class Jee6UIProvider extends UIProvider {

	@Override
	public UI createInstance(UICreateEvent event) {
		Jee6VaadinServletService service = (Jee6VaadinServletService) event.getService();
		return service.getUi();
	}

	@Override
	public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
		Jee6VaadinServletService service = (Jee6VaadinServletService) event.getService();
		return service.getUi().getClass();
	}

}
