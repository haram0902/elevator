package com.project.elevator.api.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer requestId;

    @OneToMany
    @JoinColumn(name="levelCaseId")
    private Collection<LevelCase> levelCaseIds;

    private Integer startFloor;

    private Integer endFloor;

    private Integer startTime;

    private String requestName;

}
