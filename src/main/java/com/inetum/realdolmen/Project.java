package com.inetum.realdolmen;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Positive
    @NotNull
    @Column(name = "hours", nullable = false)
    private Integer hours;

    @NotBlank
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<TimeRegistration> timeRegistrations = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHours() {
        return hours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TimeRegistration> getTimeRegistrations() {
        return timeRegistrations;
    }

    public void setTimeRegistrations(List<TimeRegistration> timeRegistrations) {
        this.timeRegistrations = timeRegistrations;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
