package homework.fileIO;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        System.out.println("Input the path of file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (!(files == null)) {
                System.out.println("please input file name");
                String fileName = scanner.nextLine();
                for (File singleFile : files) {
                    if (singleFile.getName().equalsIgnoreCase(fileName)) {
                        System.out.println(singleFile.exists());
                    }
                }search(path,fileName);
            }
        } else {
            System.err.println("the folder not found");
        }
    }

    private static void search(String path, String fileName){
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()){
                for (File listFile : file.listFiles()) {
                    search(listFile.getPath(),fileName);
                    if (file.isFile() && file.getName().equalsIgnoreCase(fileName)){
                        System.out.println(file.exists());
                    }
                }
            }
        }
    }
}
