package com.ebiz.test;

import com.ebiz.Customer;

public class CustomerTest {

    public static void main(String[] args) {

        Customer c1 = new Customer("Bob", "bob@email.com");
        Customer c2 = new Customer("Kim", "kim@email.com");
        Customer c3 = new Customer("Kim", "kim@email.com");
        Customer c4 = new Customer("Kim", "kim@email2.com");

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        
        System.out.println("c1 name:  " + c1.name() );
        System.out.println("c1 email: " + c1.email() );

        System.out.println("Is c1 equal to c2: " + c1.equals(c2));
        System.out.println("Is c2 equal to c3: " + c2.equals(c3));
        System.out.println("Is c2 equal to c4: " + c2.equals(c4));
        
        System.out.println("hashCode, c1: " + c1.hashCode());
        System.out.println("hashCode, c2: " + c2.hashCode());
        System.out.println("hashCode, c3: " + c3.hashCode());
        
    }
    

}

