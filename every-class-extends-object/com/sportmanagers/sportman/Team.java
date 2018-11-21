package com.sportmanagers.sportman;

import java.util.ArrayList;

public class Team {

  private String name;

  // List of members (later on we will
  // change the type of this list to java.util.List)
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
    // We return a copy, so that calling
    // code cannot add, clear or remove members
    // from our original list
    return new ArrayList<>(members);
  }

  /* Code using this class might
   * want to know how many members we have
   * in the Team. We shouldn't force them
   * to get a copy of the list and ask the list
   * for its size, we'll offer them a method for this
   * instead!
   */
  public int numberOfMembers() {
    return members.size();
  }
  
  public void addMember(Member m) {
    members.add(m);
  }
    
  @Override
  public String toString() {
    return name + " " + members;
  }
}
