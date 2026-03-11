import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void createFile(String name) {
        try {
            File file = new File(name);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }

    public static void main(String[] args) {
        createFile("test.txt");
    }
}
