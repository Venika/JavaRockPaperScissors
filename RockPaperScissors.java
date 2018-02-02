/*
 * NAME-VENIKA GAUR
 * DATE-02/13/2016
 * CLASS- CS 103-01
 * THIS PROGRAM PLAYS A GAME OF ROCK/PAPER/SCISSORS WITH THE USER.
 */

package rockpaperscissors;

import java.util.Scanner;   

public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        System.out.println("WELCOME TO THE *ROCK PAPER SCISSORS* GAME");                        //Welcoming the user
        
        System.out.print("Enter Your Choice: ");                                                //Prompting user to enter a value
        String choice=in.next();                                                                //Reading the value from the user        
        
        String a="ROCK";                                                                        //Initialising strings for comparisons
        String b="PAPER";
        String c="SCISSORS";
        String ComputerChoice="";                                                               //Giving an initial value to the string.
       
        
        /*Now this code block will generate a random value, assign that value to the
          string to determine computer's choice and then display the result*/
        
        if(a.equalsIgnoreCase(choice)||b.equalsIgnoreCase(choice)||c.equalsIgnoreCase(choice)){ //To make sure no other values are entered.
                            
            int num=(int)(Math.random()*3);                                                     //Generating a random value
                
            switch(num){                                                                        //Using Switch case to determine computer's choice from the random number 
                    case 0:ComputerChoice="ROCK";
                    break;
                    case 1:ComputerChoice="PAPER";
                    break;
                    case 2:ComputerChoice="SCISSORS";
                    break;
                    }   
            
            System.out.println("My choice is: "+ComputerChoice);                                 //Displaying Computer's choice
        
            if (ComputerChoice.equalsIgnoreCase("ROCK")&&choice.equalsIgnoreCase("PAPER"))       //Determining the winner
                System.out.println("YOU WON! I AM SURE YOU CHEATED (-_-)");
            else if (ComputerChoice.equalsIgnoreCase("PAPER")&&choice.equalsIgnoreCase("PAPER"))
                System.out.println("A TIE!!! (^_~)");
            else if (ComputerChoice.equalsIgnoreCase("SCISSORS")&&choice.equalsIgnoreCase("PAPER"))
                System.out.println("YOU LOST. HA! (>_<)");
            else if (ComputerChoice.equalsIgnoreCase("ROCK")&&choice.equalsIgnoreCase("SCISSORS"))
                System.out.println("YOU LOST. HA! (>_<)");
            else if (ComputerChoice.equalsIgnoreCase("PAPER")&&choice.equalsIgnoreCase("SCISSORS"))
                System.out.println("YOU WON! I AM SURE YOU CHEATED (-_-)");
            else if (ComputerChoice.equalsIgnoreCase("SCISSORS")&&choice.equalsIgnoreCase("SCISSORS"))
                System.out.println("A TIE!!! (^_~)");
            else if (ComputerChoice.equalsIgnoreCase("ROCK")&&choice.equalsIgnoreCase("ROCK"))
                System.out.println("A TIE!!! (^_~)");
            else if (ComputerChoice.equalsIgnoreCase("PAPER")&&choice.equalsIgnoreCase("ROCK"))
                System.out.println("YOU LOST. HA! (>_<)");
            else if (ComputerChoice.equalsIgnoreCase("SCISSORS")&&choice.equalsIgnoreCase("ROCK"))
                System.out.println("YOU WON! I AM SURE YOU CHEATED (-_-)");
        }                                                                                         //'If' closed
        
        else System.out.println("ERROR! Only 'ROCK'/'PAPER'/'SCISSORS' ACCEPTED.");               //If someone entered some other value
    }                                                                                          
}                                                                                                 
            
    
    

