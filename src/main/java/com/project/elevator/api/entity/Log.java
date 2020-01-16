package com.project.elevator.api.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Log {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer logId;

    @OneToMany
    @JoinColumn(name="playId")
    private Collection<Play> playIds;

    private Integer timeCount;

}
