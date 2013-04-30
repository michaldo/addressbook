package com.vaadin.tutorial.addressbook.jee6;

import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletService;
import com.vaadin.ui.UI;

public class Jee6VaadinServletService extends VaadinServletService {
	
	private UI ui;

	public Jee6VaadinServletService(VaadinServlet servlet,
			DeploymentConfiguration deploymentConfiguration, UI ui) {
		super(servlet, deploymentConfiguration);
		this.ui = ui;
	}
	
	public UI getUi() {
		return ui;
	}

}
