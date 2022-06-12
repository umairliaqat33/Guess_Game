package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Assignment1 {
    int sum = 0;
    String tem = "0";
    int j = 0;
    public int findSum(String str) {
        int l = str.length();
        int sum = 0;
        String tem = "0";
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                tem = tem + ch;
            } else {
                sum = sum + Integer.parseInt(tem);
                tem = "0";
            }
        }
        return sum + Integer.parseInt(tem);
    }

    public int findSum_R(String st) {
        int l = st.length();
        if (j < l) {
            char ch = st.charAt(j);
            if (Character.isDigit(ch)) {
                tem = tem + ch;
                ++j;
                findSum_R(st);
            } else {
                ++j;
                sum = sum + Integer.parseInt(tem);
                tem = "0";
                findSum_R(st);
            }
        }
        return sum + Integer.parseInt(tem);
    }


    public String Iswitch(String str) {
        String[] sliced = str.split("\\s");
        int c = 0;
        int l = sliced.length;
        String target = "I";
        for (String s : sliced) {
            if (Objects.equals(s, "I")) {
                str = str.replace(target, "We");
                c++;
            }
        }
        System.out.println("I appeared " + c + " times");
        return str;
    }


    public String Iswitch_R(String str) {
        int c = 1;
        String target = "I";
        char ch = str.charAt(j);
        if (Objects.equals(ch, 'I')) {
            Iswitch_R(str = str.replace(target, "We"));
            ++c;
            j++;
        }
        System.out.println("I appeared " + c + " times");
        return str;
    }

    public boolean sliceArray(int []arr){
        int s=0;
        boolean r;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        if(s%2==0){
            r=true;
        }else {
            r=false;
        }
        return r;
    }




    public boolean sliceArray_R(int [] arr){
//        boolean r=false;
        int s1=0;
        int s2=0;
        int i1=1;
        int i2= arr.length-i1;

        for(int i=0;i<i1;i++){
            s1+=arr[i];
        }
        for(int i=i2;i>=i1;i--){
            s2+=arr[i];
        }
        if(i1!=i2){
            if(s1==s2){
                return true;
            }
            else {
                i1 += 1;
                i2 -= 1;
                sliceArray_R(arr);
            }
        }
        return false;

    }
}
