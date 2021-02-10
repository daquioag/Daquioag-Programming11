import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Reading {
    
    public static void main(String[]  args) throws IOException{
        ArrayList<String> ProgrammingHistoryList = new ArrayList<>();
        int c;
        FileInputStream in;
        FileOutputStream out;
        in = new FileInputStream("ProgrammingHistory.txt");
        out = new FileOutputStream("out.txt");
        while ((c = in.read()) != 1){
            out.write(c);

        }



    }
}
