import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fileToRead.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        System.out.println(scan);
    }

}


