package com.clubs2win;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Instructions
        System.out.println("Instructions: You start with the number 21.");
        System.out.println("You and the computer will take turns subtracting either 2 or 1 from 21.");
        System.out.println("To subtract 2, press the key [2] and to subtract 1, press the key [1].");
        System.out.println("The player who makes the number zero first looses.");
        System.out.println("The name of your opponent, the computer, is Watson.");
        System.out.println("HAVE FUN AND GOOD LUCK!");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

        //C


//initialize such that watson is playing!!
        int current_player=1;
        int num1, result=21;
        int i=1;

        System.out.println("If you would like to go first, press the key [0].");
        System.out.println("If you would NOT like to go first, press the key [1] to let Watson start first.");

        Scanner keyboard = new Scanner(System.in);
        current_player = getUserInput(keyboard,0,1);
        if (current_player == 0)
            System.out.println("Your turn:");


        while (result > 0) {

            if(current_player==0)
            {

                num1 = getUserInput(keyboard, 1, 2);
                result = result - num1;
                if (result <= 0)
                {
                    System.out.println(result);
                    System.out.println("Watson wins!!");
                    break;
                }
                else
                {
                    System.out.println(result);
                }
                current_player = 1;
            }
            else {
                if (i==1)
                {
                    result = result - 1 ;
                    i=2;
                }
                else
                {
                    result = result - 2 ;
                    i=1;
                }

                if (result <= 0)
                {
                    System.out.println(result);
                    System.out.println("You win!!");
                    break;
                }
                else
                {
                    System.out.println(result);
                }
                current_player = 0;
            }



                //num1 = keyboard.nextInt();
                //result = result - num1;



            //if (result <= 0) {break;}
            //System.out.println(result);

//                result = result - 2;



  //          if (result <= 0) {break;}
    //        System.out.println(result);
      //          num1 = keyboard.nextInt();
        //        result = result - num1;
          //  if (result <= 0) {break;}
            //    System.out.println(result);



        }

    }

    private static int getUserInput(Scanner keyboard, int valid1, int valid2)
    {
        int j = 0;
        while (true)
        {
            j =keyboard.nextInt();
            if (j ==valid1 || j==valid2)
            {
                break;
            }
            System.out.printf("Invalid choice. Please enter [%d] or [%d]\n", valid1, valid2);
        }
        return j;
    }
}