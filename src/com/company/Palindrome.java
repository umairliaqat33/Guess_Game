/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

/**
 *
 * @author umair
 */
public class Palindrome extends Palindrome_Recursively {
   public void pali(){
          int n=141;
        int temp=0;
        int rem;
        int sum=0;
        while(n>0){
        rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;
        System.out.print("  "+sum);
    }
        System.out.print("  "+sum);
     
   }
}
