package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Grid g=new Grid(8);
//        g.installGridScreen();
//        Difficulty_mode d=new Difficulty_mode();
//        Guess_Gam g=new Guess_Gam();
//        g.start_game();
//        FirstPage firstPage=new FirstPage();
//        Register_database register_database=new Register_database();
//        register_database.install();
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(55);
        arr.add(6);
        System.out.println(arr);
        arr.set(1, 9);
        System.out.println(arr);
        Collections.sort(arr);
//        arr.add(1,0);
//        System.out.println(arr);
//        System.out.println(arr.size());
        List a = new ArrayList();
        a.add(55);
        a.add(51);
        a.add(53);
        a.add(25);
        a.add(53);
        a.add(45);
        a.add(75);
        System.out.println(a);
//        arr.retainAll(a);
//        System.out.println(arr);
//        a.replaceAll();
        arr.removeAll(a);
        System.out.println("After removing: ");
        System.out.println(arr);
        System.out.println(a);
//        System.out.println(arr.get(3));
//        for(var i:arr){
//            System.out.print(i);
//        }
//        arr.forEach(a->{
//                System.out.println(arr);
//        });
//        Login_Database login=new Login_Database();
//        login.SetLFrame();
//        Game_Over game_over=new Game_Over();
//        game_over.install();
    }
}
