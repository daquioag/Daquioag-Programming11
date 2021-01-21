public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0; // this is where we will store out answer
        for (int i = 0; i < s.length(); i++) { //for i starting at 1, and increasing by 1 until the string length
            String letter = s.substring(i, i + 1); // this will print out a substring of a letter, and in the forl oop, it will keep increasing
            if (letter.equals("a")) {   // if the letter equals a, add 1 to the answer
                answer++;
            } else if (letter.equals("e")) { //if the letter equals e, add 1 to the answer
                answer++;
            } else if (letter.equals("i")) {  // so if a letter equals a vowel, we will add 1 to the answer integer.
                answer++;
            } else if (letter.equals("o")) { // so in generally we made it so that if the letter going through the for loop equals a vowel, we will add 1 to the answer integer.
                answer++;
            } else if (letter.equals("u")) {
                answer++;
            }
        }
        System.out.println("\nThe number of vowels in the string: " + s + " is " + answer);
        return answer;

    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0; // this is where we will store our answer
        for (int i = 0; i < s.length() && i != s.length() - 2; i++) { // this for loop will loop through the given string, and end when the string reaches the 2nd last character, it will break.
            // i  originally codded it to say if(i==ss.length()-2{break} but I think the program changed it for me.
            String word = s.substring(i, i + 3); // the for loop will loop at every 3letter word, and if it equals to bob, it will add 1 to the answer.
            if (word.equals("bob")) {
                ++answer;
            }
        }
        System.out.println("\nThe word 'bob' occurs  " + answer + "  times in the string " + s);
        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        String emptyList = " ";
        String tempList = "";
        String longestList = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= emptyList .charAt(0)) { // i just made a conditional statement that returns true if the character at i is bigger than the an empty list.
                tempList  += s.charAt(i); // this appends the character at index i to the empty string temp
            } else {
                tempList  = Character.toString(s.charAt(i)); // when the character reaches the end of the string, we set the character at the index to a string
            }
            if (tempList .length() > longestList.length()) { //when the temp length is longer than the found string length, we make make the temp string equal to the temp string found length
                longestList = tempList ;
            }

            emptyList  = Character.toString(s.charAt(i)); // sets the string of first to each index's letter

        }
        System.out.println(longestList.stripLeading( )); // i added strip leading because I got random blank spaces in front of my answer. so I had to find a way to get rid of them.
        return longestList.stripLeading(); // returns the final string.
        }



    public static void main(String[] args) {



        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

    }
}
