/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

/**
 *
 * @author umair
 */
public class Palindrome_Recursively {
    int temp=0;
    int rec=0;
    public void check(int num){
        int result=palindrome(num);
        if(num==result){
            System.out.print(num+" Is palindrome");
        }else{
            System.out.print(num+" Is not palindrome");
        }
    }
    private int palindrome(int v){
        rec=v%10;
        temp=(temp*10)+rec;
        v=v/10;
        if(v>0){
            palindrome(v);
        }
        return temp;
}    
}
