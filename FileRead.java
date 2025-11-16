import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {

        try {
            
            File file = new File("E:/non_existing_file.txt");
            Scanner sc = new Scanner(file);

            
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
