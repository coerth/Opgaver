import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {


    public static String[] readFieldData() {
        String[] data = new String[40];
        File file = new File("src/fields.txt");
        String s;
        int i = 0;
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//ignorerer headeren

            while(scan.hasNextLine()){
                 s = scan.nextLine();
                 data[i] = s;
                 i++;
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getCause());
        }
        return data;
    }
}
