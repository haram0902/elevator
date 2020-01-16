package com.project.elevator.api.entity;

import javax.persistence.*;

@Entity
public class LogRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer logRequestId;

    @OneToOne
    @JoinColumn(name="requestId")
    private Request requestId;

    @OneToOne
    @JoinColumn(name="logId")
    private Log log;
}
