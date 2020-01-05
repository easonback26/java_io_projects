import java.io.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        Scanner input = new Scanner(new File("input.txt"));
        OutputStream os = new FileOutputStream("output.txt");

        while (input.hasNext()) { // Input == people.txt
            //String line = input.nextLine();
            String line = input.nextLine().replace(",", "");
            line = line.replace(".", "");
            line = line.replace("。", "");
            line = line.replace("，", "");
            line = line.replace(" ", "");


            System.out.println(line);

            
            //String str = "Hello there";
    
            byte[] brffer = line.getBytes();
            os.write(brffer);
            os.write('\n');
            //os.close();
        }
        os.close();
    }
}