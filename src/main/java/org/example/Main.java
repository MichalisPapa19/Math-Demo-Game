package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To The Math-Game!");

        Scanner myObj = new Scanner(System.in);
        int score=0;

        System.out.println("Give 1 to Start the Game or  0 to Stop the Game:");
        int Userinput = myObj.nextInt();
        while(Userinput!=0) {

            //Sum Game Start !
            while (score <= 4 && Userinput!=0 ) {
                System.out.println("Score:" + score);
               int sum = SumRanNam.randomNum(20, 70);
                System.out.println("Give the number:");
                Userinput = myObj.nextInt();
                if (sum == Userinput) {
                    System.out.println("Υou gave a correct result !");
                    score++;
                }else if(sum != Userinput && Userinput!=0){
                    System.out.println("Ιt is okay try again");
                }
            }

            if(score==5){
                System.out.println("-----------Good job the next Game is Subtract-----------");
            }

            //Sub Game Start!
            while(score <=10 && score>=5 && Userinput!=0){
                System.out.println("Score:" + score);
                int sub= SubRanNam.randomNum(20,70);
                Userinput = myObj.nextInt();
                if (sub == Userinput) {
                    System.out.println("Υou gave a correct result !");
                    score++;
                }
                else if(sub != Userinput && Userinput!=0){
                    System.out.println("Try again!");
                }
            }
            if(score==10){
                System.out.println(" Good job the next Game is Subtract !");
            }




        }
        if(Userinput==0) {
            System.out.println("The Game Stopped !");
        }


    }


}