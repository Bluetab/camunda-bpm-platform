package org.camunda.bpm.engine.rest.security.auth.impl;

import org.camunda.bpm.engine.ProcessEngine;

public class HttpBasicUsernameAuthenticationProvider extends HttpBasicAuthenticationProvider {
    @Override
    protected boolean isAuthenticated(ProcessEngine engine, String userName, String password) {
        engine.getIdentityService().setAuthenticatedUserId(userName);
        return true;
    }
}