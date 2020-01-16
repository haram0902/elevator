package com.project.elevator.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LevelCase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer levelCaseId;

    private Integer numOfElevator;
}
