package com.project.elevator.api.entity;

import javax.persistence.*;

public class LogElevator {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer logElevatorId;

    @OneToOne
    @JoinColumn(name="elevatorId")
    private Elevator elevatorId;

    @OneToOne
    @JoinColumn(name="logId")
    private Log log;
}
