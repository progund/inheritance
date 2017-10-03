package com.sportmanagers.sportman;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {

    private String    name;

    // List of members (later on we will change the type of this list to java.util.List)
    private ArrayList<Member> members;
    
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public Team(String name, ArrayList<Member> members) {
        this.name    = name;
        this.members = members;
    }

    public String name() {
        return name;
    }
    
    public ArrayList<Member> members() {
        return members;
    }

    public void addMember(Member m) {
        members.add(m);
    }


    public String toString() {
        return this.name + " members: " + members;

        // Solution where we loop and add the String representations
        // of our Member instances one by one
        /*
        result += " members: [";
        for (Member m : members) {
            result += m;
            // There are better (faster) ways to append/concat many
            // strings to a string ... Look at StringBuilder :)
        }
        result += " ]";
        */
    }


}
