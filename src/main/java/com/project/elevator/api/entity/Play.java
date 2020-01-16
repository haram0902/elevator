package com.project.elevator.api.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Play {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer playId;

    @OneToOne
    @JoinColumn(name="levelCaseId")
    private LevelCase levelCaseId;

    @OneToMany
    @JoinColumn(name="userId")
    private Collection<User> users;

    private Integer tryNum; // 시도 수

}
