package com.sportmanagers.sportman.test;

import java.util.ArrayList;
import com.sportmanagers.sportman.Member;

public class MemberEqualsTest {

    public static void main(String[] args) {

        Member m1 = new Member("Ada", "ada@lovelace.org", 1);
        Member m2 = new Member("Ada", "ada@lovelace.org", 1);

        System.out.print("Comparing two member object with the same content. They are");
        if ( ! m1.equals(m2)) {
            System.out.print(" not");
        }
        System.out.println(" equal");

        System.out.println("Hashcode for the objects:");
        System.out.println(" * m1: " + m1.hashCode());
        System.out.println(" * m2: " + m2.hashCode());

        
        
    }

    
}
