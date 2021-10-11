package com.inetum.realdolmen;

import javax.enterprise.inject.Model;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Model
public class LogoutBean {

    public String logout(HttpServletRequest req) throws ServletException{
        req.logout();
        req.getSession().invalidate();
        return "/login?";
    }
}
