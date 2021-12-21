package homework.fileIO;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the path of file");
        String path = scanner.nextLine();

        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            System.out.println("please input searching word ");
            String searchWord = scanner.nextLine();

            if (files != null) {
                for (File file : files) {
                    if (file.getName().contains(".txt")) {
                        try (BufferedReader content = new BufferedReader(new FileReader(file.getPath()))) {
                            String line;
                            while ((line = content.readLine()) != null) {
                                if (line.contains(searchWord)) {
                                    System.out.println(file.getName());
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }

        } else System.out.println("the folder not found");
    }
}