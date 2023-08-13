package com.fantasyfootball.fantasyfootball.api.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer playerID;

    public Integer rank;

    public Integer tier;

    public String name;

    public String position;

    public String team;

    public Integer bye;

    public Integer schedule;

    public Integer adp;
}
