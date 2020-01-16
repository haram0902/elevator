package com.project.elevator.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RequestForm {
    @Id
    private Integer id;

    private String name;

    private Integer num;

    public String getName() {
        return name;
    }
}
