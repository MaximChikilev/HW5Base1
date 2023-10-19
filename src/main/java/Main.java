import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File folderIn = new File("C:\\Users\\Maxim\\IdeaProjects\\Homeworks\\module2OOP\\untitled\\From");
        File folderOut = new File("C:\\Users\\Maxim\\IdeaProjects\\Homeworks\\module2OOP\\untitled\\To");
        folderOut.mkdirs();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter extension :");
        String extension = scanner.next();

        try {
            System.out.println(FileOperation.copyFilesWithSpecificExtensionToAnotherFolder(folderIn, folderOut, extension) + " files were copied");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
