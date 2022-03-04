package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");
        int number= inp.nextInt();
System.out.print(palindrom(number));
    }
    public static boolean palindrom(int number){
       int k=number, a=0,lastnumber;
       while(k!=0){
           lastnumber=k%10;
           a=(a*10)+lastnumber;
           k/=10;

       }
        return number==a;
    }
}
