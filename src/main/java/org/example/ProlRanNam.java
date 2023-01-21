package org.example;

public class ProlRanNam {
    public static int randomNum( int min,int max) {
        // Generate random int value from min to max
        int random_num1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_num2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_num1 + "*" + random_num2);
        return random_num1 * random_num2;
    }
}
