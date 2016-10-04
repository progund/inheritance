package com.ebiz;

import java.util.Objects;

public class Customer {

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name  = name;
        this.email = email;
    }


    public String email() {
        return email;
    }
    
    public String name() {
        return name;
    }

    // Please compiler, make sure that this method overrides some
    // method in my superclass(es)
    @Override
    public String toString() {
        // Bob <bob@email.com>
        return this.name + " <" + this.email + ">";
    }
    
    @Override
    public int hashCode() {
        int hash = Objects.hash(name, email);

        // Or another example:
        //   int hash = name.hashCode()+email.hashCode();
        
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o==null) {
            return false;
        }

        // please please java check if o is a Customer for us... and
        // if not return false
        if ( ! (o instanceof Customer) ) {
            return false;
        }

        Customer c = (Customer) o;
        
        // Compare the Strings name and email , using the equals method in String
        if (this.name.equals(c.name) && this.email.equals(c.email) ) {
            return true;
        }
        
        return false;
    }

}
