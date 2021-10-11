package com.inetum.realdolmen;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

@Model
public class ProjectDetailBean {

    @EJB
    TRMBean trmBean;

    private FaceletContext faceletContext = (FaceletContext) FacesContext.getCurrentInstance().getAttributes().get(FaceletContext.FACELET_CONTEXT_KEY);
    private String id = (String) faceletContext.getAttribute("id");

    private Project project;

    public void load(){
        System.out.printf("IDDDD : " + id);
        project = trmBean.getProjectById(Long.parseLong(id));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
