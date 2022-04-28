package com.sportmanagers.sportman.test;

import com.sportmanagers.sportman.Member;
import com.sportmanagers.sportman.Team;
import java.util.ArrayList;

public class TeamTest {

  public static void main(String[] args) {

    // Create an ArrayList with three members (to pass to the constructor)
    // ... later on we will change the type of this list to java.util.List
    ArrayList<Member> threeMembers = new ArrayList<>();
    threeMembers.add(new Member("Ada", "ada@lovelace.org", 1));
    threeMembers.add(new Member("Bart", "bart@simpson.net", 2));
    threeMembers.add(new Member("Marge", "marge@simpson.net", 3));

    // Crete a team, pass a name and the list of three members
    Team myTeam = new Team("One Team", threeMembers);

    // Verify size (three members - so the size should be three)
    System.out.print("Checking size of myTeam:       ");
    assert (myTeam.numberOfMembers() == 3) : "Wrong size, expected 3";
    System.out.println("ok");

    // Crete another team, pass a name ... no list 
    Team myOtherTeam = new Team("One More Time");

    // Verify size (no members - so the size should be 0)
    System.out.print("Checking size of myOtherTeam:  ");
    assert (myOtherTeam.numberOfMembers() == 0) : "Wrong size, expected 0";
    System.out.println("ok");

    // Add the members to the second team
    myOtherTeam.addMember(new Member("Lisa", "lisa@simpson.net", 4));
    myOtherTeam.addMember(new Member("Maggie", "maggie@simpson.net", 5));
    myOtherTeam.addMember(new Member("Ned", "ned@flanders.org", 6));
        
    // Verify size (We added three members - so the size should be 3)
    System.out.print("Checking size of myOtherTeam:  ");
    assert (myOtherTeam.numberOfMembers() == 3) : "Wrong size, expected 3";
    System.out.println("ok");

    System.out.println("myTeam: " + myTeam);
    System.out.println("myTeam: " + myTeam.toString());

    System.out.print("Comparing my teams.. they are");
    if (! myTeam.equals(myOtherTeam)) {
      System.out.print(" not");
    }
    System.out.println(" the same");

    Team teamWithName = new Team("AS Roma");
    Team teamWithSameName = new Team("AS Roma");
    System.out.print("Comparing two teams objects "
                     + "with the same name.. they are");
    if (! teamWithName.equals(teamWithSameName)) {
      System.out.print(" not");
    }
    System.out.println(" the same");        
  }
  
}
