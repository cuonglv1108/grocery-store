import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class LinkedLists {
    public static void main(String[] args) {
        Appointment p1 = new Appointment();
        Appointment p2 = new Appointment();
        Scanner read = null;
        try {
                read = new Scanner(new FileInputStream("Requets.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.exit(0);
            }

        ArrayList<String> book = new ArrayList<String>();
        while (read.hasNextLine()){
            String info = read.nextLine();
            book.add(info);
        }
    //reading file
        for(int i=0; i<book.size(); i++){
            String[] result = book.get(i).split("\\s+");
            String id = result[0];
            String stTime = result[1];
            String enTime = result[2];
        }

    }

}
