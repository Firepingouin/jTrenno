package com.cpe.jee.controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.cpe.jee.beans.ActivityModelBean;
import com.cpe.jee.facade.ActivityManagerLocal;

@ManagedBean
@ApplicationScoped
public class ActivityController {

	@Inject
	private ActivityManagerLocal activityManager;

	public void addActivity(ActivityModelBean a) throws Exception {
		try {
			activityManager.createActivity(a.getWorkedTime(), a.getEmployee(), a.getProject());
		} catch (Exception ex) {
			String errorMessage = getRootErrorMessage(ex);
		}
	}

	private String getRootErrorMessage(Exception e) {
		// Default to general error message that registration failed.
		String errorMessage = "Creation failed. See server log for more information";
		if (e == null) {
			// This shouldn't happen, but return the default messages
			return errorMessage;
		}

		// Start with the exception and recurse to find the root cause
		Throwable t = e;
		while (t != null) {
			// Get the message from the Throwable class instance
			errorMessage = t.getLocalizedMessage();
			t = t.getCause();
		}
		// This is the root cause message
		return errorMessage;
	}
}