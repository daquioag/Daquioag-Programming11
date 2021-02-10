import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please type in a word to search");
        Scanner scan = new Scanner(System.in); // scanning
        String word = scan.next();
        System.out.println("Looking for: "+ word);
        int wordLength = word.length();


        ArrayList<String> ProgrammingHistoryList = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        String temp ="";

        while ((line = br.readLine()) != null) {
            ProgrammingHistoryList.add(line);
           // System.out.println(line);

        }
        br.close();
        System.out.println(ProgrammingHistoryList);
        for (String s : ProgrammingHistoryList) {
            temp += s+"   ";
        }
        System.out.println(temp);
        for (int i =0; i<temp.length();i++){
            if(i == temp.length()-wordLength){
                break;
            }
            if (temp.substring(i,i+wordLength).equals(word)){
                System.out.println("Index Position: " + i +"\t" + temp.substring(i,i+wordLength));
            }
        }
    }
}


