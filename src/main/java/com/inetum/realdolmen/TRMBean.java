package com.inetum.realdolmen;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TRMBean {

    @PersistenceContext
    EntityManager entityManager;

    public void createProject(Project project){
        entityManager.persist(project);
    }

    public List<Project> getAllProjects(){
        return entityManager.createQuery(
                "select p from Project p", Project.class).getResultList();
    }

    public Project getProjectById(Long id){
        return entityManager.createQuery(
                "select p from Project p where p.id = ?1",
                Project.class)
                .setParameter(1, id)
                .getSingleResult();
    }
}
