package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;

    private List<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println( ((Player)player).getName() + " is already on the team");
            return false;
        }else{
            System.out.println( ((Player)player).getName() + " picked for team " + this.name);
            return true;
        }

    }
}
