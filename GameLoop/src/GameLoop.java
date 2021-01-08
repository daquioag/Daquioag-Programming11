import java.util.Scanner;
public class GameLoop {
    public static void main(String[] args) {
        String playerChoice; // the variable that the player will pick
        String opponentChoice; // the variable that the computer chooses.
        int playerScore = 0; // playerScore variable will keep track of the player's score
        int opponentScore = 0; // this variable will keep track of the computer's score
        String playAgain;

        while (playerScore < 10 || opponentScore < 10) { //I used a while loop to keep track of the score. if someone reaches 10, the program will end.

            System.out.println("Let's play rock paper scissors! \nFirst one up to 10 wins \nPick one of the following and make sure it is in upper case:\nR for rock\nP for paper \nS for scissors"); // this is just a description with instructions
            Scanner scan = new Scanner(System.in); // scanning
            playerChoice = scan.next(); // this is where the player will input his/her choice of R P and S
                if (playerChoice.equals("R")) {
                    playerChoice = "Rock";
                    System.out.println("you have picked: " + playerChoice); // an If statement that if you pick R, the variable playerChoice will be set to Rock
                } else if (playerChoice.equals("P")) {
                    playerChoice = "Paper";
                    System.out.println("You have picked Paper: " + playerChoice);// and else if statement that if you pick P, the variable playerChoice will be set to Paper
                } else if (playerChoice.equals("S")) {
                    playerChoice = "Scissors";
                    System.out.println("You have picked: " + playerChoice);// another else if statement that if you pick S, the variable player choice will be set to Scissors.
                } else {
                    System.out.println("Invalid response! please play again");
                    break;
                    //If I do not add a break in here, the program keeps going.
                }
            int computerChoice = (int) ((Math.random() * 3) + 1);
            // Math.random will generate a random number from 0-1, including 0 and not 1. So we multiple it by 3, but the results are always 0-2. So I use the +1 to make it from 1-3.
            if (computerChoice == 1) { // This if & else if statements show the audience what the computer has chosen which correspond to the random number generated from math.random.
                opponentChoice = "Rock"; //These convert the random number to strings. (if 1 --> rock. 2 --> Paper. 3 --> Scissors). And the variable opponentChoice will be set to that string.
                System.out.println("I have picked: " + opponentChoice);
            }
            else if (computerChoice == 2) { // if the computer randomly gets 2, the opponentChoice variable will be stored as paper.
                opponentChoice = "Paper";
                System.out.println("I have picked: " + opponentChoice);
            }
            else {
                opponentChoice = "Scissors"; //if the computer does not get 1 or 2, the opponentChoice variable will stored as scissors.
                System.out.println("I have picked: " + opponentChoice);
            }

            // the lines below are if, else if, and else conditional statements that correspond with what the player and computer has chosen.  Overall States the results of the game.
            if (opponentChoice.equals("Rock")) { //these if statements explore all the results if the computer has gotten 1 or rock
                if (playerChoice.equals("Scissors")) {
                    System.out.println(opponentChoice+" Crushes " +playerChoice+" , you lose! I get +1");
                } else if (playerChoice.equals("Paper")) {
                    System.out.println(playerChoice + " covers " + opponentChoice + ", you win! you get +1!");
                    playerScore++; // this adds 1 to the playerScore variable.
                }
                else
                    System.out.println("We both picked "+ playerChoice +" It is a draw! No one gets a point!");
            }
            else if (opponentChoice.equals("Paper")) { //these else/if statements  explore all the possible results with the computer choosing 2 or paper
                if (playerChoice.equals("Rock")) {
                    System.out.println(opponentChoice + " covers " + playerChoice + " , you lose! I get +1!");
                    opponentScore++;
                } else if (playerChoice.equals("Scissors")) {
                    System.out.println(playerChoice + " cuts " + opponentChoice + ", you win! you get +1");
                    playerScore++;
                } else
                    System.out.println("We both have chosen " + playerChoice + ", it is a tie! No one gets a point");

            }
            else { // these statements explore all the possible results if the computer does not pick 1(rock) or 2(paper).
                if (playerChoice.equals("Rock")) {
                    System.out.println(playerChoice + " crushes " + opponentChoice + ", you win! you get +1");
                    playerScore++;
                } else if (playerChoice.equals("Paper")) {
                    System.out.println(opponentChoice + " cuts " + playerChoice + ", you lose! I get + 1!");
                    opponentScore++;
                } else
                    System.out.println("we both have chosen " + playerChoice + ",  it is a tie! No one gets a point!");
            }
            if (playerScore==10){ // if you reach 10 points, the program ends
                System.out.println("The game is now over!\nyou have reached: "+playerScore+" points first!");
                break;
            }
            else if(opponentScore==10){ // if the computer reaches 10 points, the program ends.
                System.out.println("THe game is now over!\nI have reached: "+opponentScore+" points first!");
                break;
            }
            System.out.println("Your current Score is: " + playerScore + "\nMy Current score is: " + opponentScore + "\nwould you like to play again? \ny= yes \nn= no"); //this statement says the current score and asks if you want to play again
            playAgain = scan.next(); //
            if (playAgain.equals("n")) {//if you pick n, the program ends and the current scores will be displayed
                System.out.println("Game over! Your final score is: " + playerScore + "\tMy final score is: " + opponentScore);
                break;
            }
            else if (playAgain.equals("y")) { // if you pick y, the program keeps on running, and stores the current values of the scores.
                    System.out.println("Your current score is: "+playerScore+" my current score: " +opponentScore);
            }
            else
                System.out.println("Invalid response. Please play again!");

        }

    }
}