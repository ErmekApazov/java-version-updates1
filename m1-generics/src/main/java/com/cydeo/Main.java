package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    FootballPlayer joe = new FootballPlayer("Joe");
    BaseballPlayer pat = new BaseballPlayer("Pat");
    SoccerPlayer beckham = new SoccerPlayer("Beckham");

    Team<SoccerPlayer> liverpool = new Team("Liverpool");
    liverpool.addPlayer(beckham);


    }
}
