package com.company;

public class Nested_Classes {
    private int i;
    int j;
    Nested_Classes(int v){
        i=v;
    }
    class inner{
        void in(){
            System.out.println("value:"+i);
        }
    }
}
