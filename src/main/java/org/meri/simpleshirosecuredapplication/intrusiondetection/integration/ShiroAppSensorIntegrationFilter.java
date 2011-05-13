package org.meri.simpleshirosecuredapplication.intrusiondetection.integration;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.servlet.AdviceFilter;

public class ShiroAppSensorIntegrationFilter extends AdviceFilter {

	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		AppSensorIntegrationThreadContext.remove();
		AppSensorIntegrationThreadContext.setCurrentRequest((HttpServletRequest)request);
		return true;
	}

}
