package com.company;

public class quiz {
    //1. Create an abstract class pen with methods write () and refill () as
    //abstract methods.
    //1.1. Use the pen class from Q1 to create a concrete class fountain
    //pen with additional method change Nib ().
    abstract class pen{
        public void write(){}
        public void refill(){}
    }
    class fountain_pen extends pen{
        public void Nib(){}
    }



    //Q2Create a class monkey with jump ( ) and bite ( ) methods Create a
    //class human which inherits this monkey class and implements basic animal interface with eat ( ) and sleep methods
    class monkey{
        public void jump(){}
        public void bite(){}
    }
    interface animal{
        public void eat();
        public void sleep();
    }
    static class human implements animal{
        @Override
        public void eat() {
            System.out.println("eats");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeps");
        }

    }



    //Q3 Create a class telephone with ( ) , lift ( ) and disconnected ( )
    //methods as abstract methods create another class smart telephone
    //and demonstrate polymorphism
    abstract class  telephone{
        public void lift(){}
        public void disconnected(){}
    }
    class Smart_Telephone extends telephone{
        @Override
        public void lift() {                    //Polymorphism used
            System.out.println("Lift called");
        }
        @Override
        public void disconnected() {             //Polymorphism used
            System.out.println("Disconnected called");
        }
    }


    //Q5 Create an interface TV remote and use it to inherit another interface smart TV remote
    interface  TV_Remote extends  Smart_Tv_Remote{

    }
    interface Smart_Tv_Remote{

    }

    //Q6 Create a class TV which implements TV remote interface from Q5.
    class Tv implements TV_Remote{

    }

    //7. Observe the class diagram below and provide the solution code:

    class Person{
        String name;
        String address;
        Person(String n,String add){
            name=n;
            address=add;
        }
        public String tostring(Person p){
            return p.tostring(p);
        }
    }
    class Student extends Person{
        String program;
        int year;
        double fee;
        Student(String n, String add,String p,int y,double f) {
            super(n,add);
            address=add;
            name=n;
            program=p;
            y=year;
            fee=f;
        }
        public String tostring(Student s){
            return tostring(s);
        }
    }
    class staff extends Person{
        String school;
        double pay;
        staff(String n, String add,String s,double p) {
            super(n, add);
            school=s;
            pay=p;
            name=n;
            address=add;
        }
        public String tostring(){
            staff st=new staff("hhh","kjhkh","hgjjhg",987987);
            return st.toString();
        }
    }
}
