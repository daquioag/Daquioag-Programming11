import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args) {
        int playerChoice; // just a variable
        int rock = 1;
        int paper = 2;
        int scissors = 3;

        System.out.println("Let's play rock paper scissors! \nPick one of the following:\n1 for rock\n2 for paper \n3 for scissors"); // this is just a description with instructions
        Scanner scan = new Scanner(System.in); // scanning
        playerChoice = Integer.parseInt(scan.next()); // this is where the player will input his/her choice
        if(playerChoice==1){
            System.out.println("you have picked Rock"); // if you pick 1, the console will tell you that you picked rock
        }
        else if (playerChoice==2) {
            System.out.println("You have picked Paper");// the console will tell you if you picked paper
        }
        else if(playerChoice==3){
            System.out.println("You have picked Scissors");//the console will tell you if you picked scissors.
        }
        else {
            System.out.println("Invalid response!");// if you pick a number other than 1-3,the program will be invalid.
            System.exit(0);// this will end the program following an invalid input
        }
        // if the lines above, i am trying to convert the integer input into either rock paper or scissors.
        // and this will print out what what the player has chosen
        int computerChoice = (int)(Math.random() * (scissors - rock + 1 ) + rock); // this will generate a random number from 1-3
        if (computerChoice ==1){    // the lines 26-34 just tell the audience what the computer has chosen. The program can run without these lines, I just added them in for extra information.

            System.out.println("I have picked Rock");
        }
        else if (computerChoice==2){
            System.out.println("I have picked Paper");
        }
        else if(computerChoice ==3){
            System.out.println("I have picked Scissors");
        }
// the lines below are if, else if, and else conditional statements that correspond with what the player has chosen with what the computer has chosen. States the results of the game.
        if(computerChoice == playerChoice){
            System.out.println("it is a draw, no one wins");
        }
        else if (computerChoice ==1 && playerChoice == 2){
            System.out.println("you have chosen Paper, and I have chosen rock, you win!");
        }
        else if (computerChoice ==1 && playerChoice == 3){
            System.out.println("you have chosen Scissors  and I have chosen rock, you Lose!");
        }
        else if (computerChoice ==2 && playerChoice == 3) {
            System.out.println("you have chosen Scissors and I have chosen paper, you win!");
        }
        else if (computerChoice ==2 && playerChoice == 1) {
            System.out.println("you have chosen Rock and I have chosen paper, you lose!");
        }
        else if (computerChoice ==3 && playerChoice == 2) {
            System.out.println("you have chosen paper and I have chosen Scissors, you lose!");
        }
        else if (computerChoice ==3 && playerChoice == 1) {
            System.out.println("you have chosen Rock and I have chosen Scissors, you win");
        }

    }

}