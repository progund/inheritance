package com.sportmanagers.sportman.test;

import java.util.ArrayList;
import com.sportmanagers.sportman.Member;

public class MemberTest {

    public static void main(String[] args) {

        ArrayList<Member> register = new ArrayList<>();

        register.add(new Member("Ada", "ada@lovelace.org", 1));
        register.add(new Member("Bart", "bart@simpson.net", 2));
        register.add(new Member("Marge", "marge@simpson.net", 3));

        // The above is a shorter way of writing the code below.
        //
        // We create the Members and store the references to them
        // directly without using a variable name.
        //
        // It is a reference (or references) to instance(s) we store
        // in an variable(s), array or ArrayList, never the actual
        // object.
        //
        
        /*
        Member m1 = new Member("Ada", "ada@lovelace.org", 1);
        Member m2 =new Member("Bart", "bart@simpson.net", 2);
        Member m3 =new Member("Marge", "marge@simpson.net", 3);
        register.add(m1);
        register.add(m2);
        register.add(m3);
        */
        // or another example:
        /*
        Member m1 = new Member("Ada", "ada@lovelace.org", 1);
        register.add(m1);

        m1 =new Member("Bart", "bart@simpson.net", 2);
        register.add(m1);

        m1 =new Member("Marge", "marge@simpson.net", 3);
        register.add(m1);
        */
        
        
        for (Member m : register) {
            System.out.println(m);
        }
        
    }

    
}
