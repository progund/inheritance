package com.sportmanagers.sportman;

import java.util.ArrayList;

public class Team {

    private String    name;

    // List of members (later on we will change the type of this list to java.util.List)
    private ArrayList members;
    
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public Team(String name, ArrayList members) {
        this.name    = name;
        this.members = members;
    }

    public String name() {
        return name;
    }
    
    public ArrayList members() {
        return members;
    }

    public void addMember(Member m) {
        members.add(m);
    }
    

}
