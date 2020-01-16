package com.project.elevator.api.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer scoreId;

    @OneToMany
    @JoinColumn(name="userId")
    private Collection<User> userIds;

    @OneToOne
    @JoinColumn(name="levelCaseId")
    private LevelCase levelCaseId;

}
