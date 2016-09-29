package com.sportmanagers.sportman.test;

import java.util.ArrayList;
import com.sportmanagers.sportman.Member;

public class MemberTest {

    public static void main(String[] args) {

        ArrayList<Member> register = new ArrayList<>();

        register.add(new Member("Ada", "ada@lovelace.org", 1));
        register.add(new Member("Bart", "bart@simpson.net", 2));
        register.add(new Member("Marge", "marge@simpson.net", 3));

        for (Member m : register) {
            System.out.println(m);
        }
        
    }

    
}
