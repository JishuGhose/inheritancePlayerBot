package com.example.inheritancepalyerbot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "bot")
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "player_id")
public class Bot extends Player{
    private int ranki;
}
