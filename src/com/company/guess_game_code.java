package com.company;

import java.util.Random;
import java.util.Scanner;

public class guess_game_code {
    private int game_board[];
    private int store_key[];
    private int store_index;
    private int key_found;
    public int index;
    public int key_percnt;
    public int attempt_percnt;
    private int n,i,z;
    Random rand;

    public guess_game_code()
    {
        rand = new Random();
        key_found=0;
        System.out.print("Enter Number of Index : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        game_board = new int[index]; // Game_board create;
        KeyPercentage();
        AtmptPercnt();
        store_index = key_percnt;
        store_key = new int[store_index];
        key_generator();
    }

    private void KeyPercentage(){          // 40% key generate;
        key_percnt = (index*100)/250;
        System.out.println("Total Keys : "+key_percnt);
    }

    private void AtmptPercnt(){
        attempt_percnt = (index*100)/130;  // 70% attempt
        System.out.println("Total Attempt : "+attempt_percnt);
    }

    private  void key_generator()
    {
        if(i<store_index){
            n = rand.nextInt(index);
            if(n==0&&i<store_index){
                key_generator();
            }
            //System.out.println("Rand : "+n);
            z=0;
            while(z<store_index){
                if(n==store_key[z]){
                    key_generator();
                }
                else
                    z++;
            }
            store_key[i] = n;
            game_board[n] = 23;
            if(i<store_index-1){
                i++;
                if(i==store_index){
                    i--;
                }
                key_generator();
            }
        }
    }

    public void random_keys(){
        for(int j=0;j<store_index;j++){
            System.out.println("Random numbers : "+store_key[j]);
        }
    }

    public void start_game()
    {
        int in;
        Scanner scan=new Scanner(System.in);
        while (attempt_percnt!=0 && key_found!=key_percnt)
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
                System.out.println("Remaining Attempts :"+this.attempt_percnt);
                ++ key_found;
                game_board[in]=22;
            }
            else
            {
                System.out.println("Missed !");
                -- attempt_percnt;
                System.out.println("Attempts Remaining ="+attempt_percnt);
                game_board[in]=22;
            }
        }
        System.out.println("Game Finish");
    }
}
