package com.project.elevator.api.entity;

import javax.persistence.*;

enum ElevatorStatus {
    STOP,
    UP,
    DOWN,
    OPEN,
    CLOSE;
}

@Entity
public class Elevator {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private ElevatorStatus status;

    private Integer floor;
}
