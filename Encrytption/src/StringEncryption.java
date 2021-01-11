import java.util.Scanner;
public class StringEncryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // this will allow someone to input a word
        System.out.println("Type in the word you want to Encrypt");
        String message = scan.next();
       // this length integer sets me up for some if, else conditional statements.
        int length = message.length();
        System.out.println("we are going to encrypt: " + message);
        if (length==1){ // it would be hard to encrypt a word that is 1 letter long, so I just removed that option
            System.out.println("error, word too short, try again");
        }
        // this is in case someone puts in a word that is 2 letters long
        else if (length ==2){// this will just reverse a string that is 2 letters long. and add % to the start and & to the end.
            String encrypt = ("%"+message.substring(message.length()-1)+message.substring(0,1)+"&"); //this stores the encryption code into the variable encrypt
            System.out.println("The encrypted string is: " +encrypt); // prints out the encrypted word
            String decrypt = (encrypt.substring(2,3)+encrypt.substring(1,2)); // stores the decryption code into a variable called decrypt
            System.out.println("The original word is: " + decrypt); // prints out the original word

        }
        // if someone types in a word that is 3 letter longs
        // this will move the last 2 letters of the string to the front, and add % to the start and & to the end
        else if (length ==3){
            String encrypt = ("%"+message.substring(message.length()-2)+message.substring(0,1)+"&");
            System.out.println("The encrypted string is: "+ encrypt);
            String decrypt = (encrypt.substring(3,4)+encrypt.substring(1,3)); /// this line of code stores the decrypted code into the variable decrypt
            System.out.println("The original word is: " + decrypt);
        }
        // if the string is more than 3 letters long, the encryption will print the last 3 letters of the string, the first 2 letters of the string and add % to the start and & to the end.
        else {
            System.out.println("The encrypted word is: " +"%"+message.substring(message.length()-3)+message.substring(0,2)+"&");// prints the 2nd index of the string, removes the last 3 indexes of the string and adds in "!@#$" at the end.
            System.out.println("The original word is: "+message);
        }
        //the above line was going to be my original encryption code, but what if someone inputs a string with less than 4 characters. it would get an error.

    }

}


