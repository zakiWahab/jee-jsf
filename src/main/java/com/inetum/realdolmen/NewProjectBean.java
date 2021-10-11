package com.inetum.realdolmen;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Model
public class NewProjectBean {

    @NotNull
    private Project project = new Project();

    @EJB
    TRMBean trmBean;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String create(){
        System.out.printf("Should create project with " + project.getHours() + " hours");
        trmBean.createProject(project);
        return "projects?faces-redirect=true";
    }
}
