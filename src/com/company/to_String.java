package com.company;

public class to_String {
    int rollno;
    String name;
    String city;

    to_String(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method
        return rollno+" "+name+" "+city;
    }

}
