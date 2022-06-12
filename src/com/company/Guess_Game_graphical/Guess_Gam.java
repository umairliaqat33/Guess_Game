package com.company.Guess_Game_graphical;

import java.awt.*;
import java.util.*;

public class Guess_Gam {
    private int[] game_board;
    private int[] store_key;
    private int store_index;
    public int key_found;
    public int index;
    public int key_percnt;
    public int attempt_percnt;
    public int total_attempts=0;
    private int n,i,z;
    Random rand;

    public Guess_Gam(){

    }

    public Guess_Gam(int i)
    {
        rand = new Random();
        key_found=0;
        index =i;             //sc.nextInt();
        game_board = new int[index]; // Game_board create;
        KeyPercentage();
        AtmptPercnt();
        store_index = key_percnt;
        store_key = new int[store_index];
        key_generator();
    }

    private void KeyPercentage(){          // 40% key generate;
        if(index==9){
            key_percnt = (index*100)/250;
//            System.out.println("Total Keys : "+key_percnt);
        } else if (index==25) {
            key_percnt = (index*100)/450;
        }else {
            key_percnt = (index*100)/550;
        }
    }

    private void AtmptPercnt(){
        if(index==9){
            attempt_percnt = (index*100)/130;  // 70% attempt
            total_attempts=attempt_percnt;
        } else if (index==25) {
            attempt_percnt = (index*100)/190;  // 70% attempt
            total_attempts=attempt_percnt;
        }else{
            attempt_percnt = (index*100)/220;  // 70% attempt
            total_attempts=attempt_percnt;

        }
    }

    private  void key_generator()
    {
        if(i<store_index){
            n = rand.nextInt(index);
            if(n==0&&i<store_index){
                key_generator();
            }
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


    public Color start_game(int i)
    {
        int in;
        if (attempt_percnt!=0 && key_found!=key_percnt)
        {
            in=i;
            if(game_board[in]==23)
            {
                ++ key_found;
                game_board[in]=22;
                return Color.green;
            }
            else
            {
                -- attempt_percnt;
                game_board[in]=22;
                return Color.red;
            }
        }else {
            return null;
        }
    }
}
