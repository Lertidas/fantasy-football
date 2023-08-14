package com.fantasyfootball.fantasyfootball.api.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`playerID`")
    public Integer playerID;

    @Column(name = "`rank`")
    public Integer rank;

    @Column(name = "`tier`")
    public Integer tier;

    @Column(name = "`name`")
    public String name;

    @Column(name = "`position`")
    public String position;

    @Column(name = "`team`")
    public String team;

    @Column(name = "`bye`")
    public Integer bye;

    @Column(name = "`schedule`")
    public Integer schedule;

    @Column(name = "`ecr`")
    public Integer ecr;
}
