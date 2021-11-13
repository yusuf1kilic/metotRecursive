package com.company;

import java.util.Scanner;

public class Main {
    public static int power(int a,int b){
        if (a==1){
            return 1;

        }else if(b==0){
            return 1;
        }else{
            return a*power(a,b-1);
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("lütfen tabanı giriniz : ");
        int number= input.nextInt();
        System.out.print("lütfne üs değeri giriniz : ");
        int number2= input.nextInt();
        System.out.println("hesap : "+power(number,number2));


    }
}
