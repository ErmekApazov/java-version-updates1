package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{

    private String name;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( player.getName() + " is already on the team");
            return false;
        }else{
            System.out.println( player.getName() + " picked for team " + this.name);
            return true;
        }

    }
}
