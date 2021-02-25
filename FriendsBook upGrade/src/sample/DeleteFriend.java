package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class DeleteFriend {
    private static String name;
    private static String job;
    private static Double age;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllProducts(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String productString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                productString += line;
            } else {
                parseFriend(productString);
                productString = "";
            }
        }
        return friends;
    }

    private static void parseFriend(String string) {
        int pos = 0;
        String name = "";
        String job = "";
        Double age = 0.0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                pos = i;
                name = string.substring(0, pos);
                job = string.substring(pos + 1, string.indexOf("."));
                //age = //Double.parseDouble(string.substring(string.indexOf(".")+ 1));
            }


        }
        friends.remove(new Friend("", "", 0.0));
    }
}
