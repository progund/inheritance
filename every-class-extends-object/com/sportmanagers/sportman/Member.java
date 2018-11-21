package com.sportmanagers.sportman;

public class Member {

  private String name;
  private String email;
  private int id;


  public Member(String name, String email, int id) {
    this.name = name;
    this.email = email;
    this.id = id;
  }

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return super.toString() + ":" +
      this.id + "," + this.name + "," + this.email;
  }

}
