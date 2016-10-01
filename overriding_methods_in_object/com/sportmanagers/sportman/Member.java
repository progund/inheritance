package com.sportmanagers.sportman;

public class Member {

    private String   name;
    private String   email;
    private int      id;

    private final static String SEPARATOR = "|";
    
    public Member(String name, String email, int id) {
        this.name  = name;
        this.email = email;
        this.id    = id;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String toString() {
        return /*super.toString() + ":" + */ this.id + SEPARATOR + this.name + SEPARATOR + this.email;
    }

}
