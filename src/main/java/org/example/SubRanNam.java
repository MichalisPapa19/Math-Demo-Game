package org.example;

public class SubRanNam {
    public static int randomNum( int min,int max) {
        // Generate random int value from min to max
        int sub;
        int random_num1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_num2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        while(random_num1 == random_num2){
            random_num1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            random_num2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        System.out.println(random_num1 + "-" + random_num2);
        sub=random_num1 - random_num2;
        return sub;


    }
}

