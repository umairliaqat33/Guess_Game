/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author umair
 */
public class Phase1_Guess_Game {
    private int game_board[];
    private int key_found, attempts;
    private int keys;
   
    Phase1_Guess_Game()
    {
        keys=3;
        key_found=0;
        attempts=6;
        game_board=new int [16];
        key_generator();
    }
   
   private  void key_generator()
    {
        Random rand = new Random();
        int number1 = rand.nextInt(16);
        int number2 = rand.nextInt(16);
        int number3 = rand.nextInt(16);
        game_board[number1] = 23;
        game_board[number2] = 23;
        game_board[number3] = 23;
    }
   
    public void start_game()
    {
        int in;
        Scanner scan=new Scanner(System.in);
        while (attempts!=0 && key_found!=3)
        {
            System.out.println("Enter Block no to explore :");
            in=scan.nextInt();
            if(game_board[in]==22)
            {
                System.out.println("Block Disabled !");
           
            }
           
            else if(game_board[in]==23)
            {
              System.out.println("Key Found !");
            System.out.println("Remaining Attempts :"+this.attempts);
           
                ++ key_found;
               
                game_board[in]=22;    
            }
            else
            {
                System.out.println("Missed !");
           
                -- attempts;
            System.out.println("Attempts Remaining ="+attempts);
                game_board[in]=22;
            }
           
        }
       System.out.println("Game Finish");
    }
}
