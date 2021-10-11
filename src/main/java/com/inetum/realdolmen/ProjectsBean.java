package com.inetum.realdolmen;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.inject.Model;
import java.util.List;

@Model
public class ProjectsBean {

    private List<Project> projects;

    @EJB
    TRMBean trmBean;

    @PostConstruct
    public void loadProjects(){
        projects = trmBean.getAllProjects();
    }

    public List<Project> getProjects() {
        return projects;
    }
}
