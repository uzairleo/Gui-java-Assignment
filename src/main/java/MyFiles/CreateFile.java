package MyFiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            // Creating an object of a file
            File myObj = new File("D:\\data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
