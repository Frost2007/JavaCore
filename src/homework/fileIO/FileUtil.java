package homework.fileIO;

import java.io.*;

public class FileUtil {

    static void findLines(String path, String keyword) {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(path));) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage(String path) {
        File file = new File(path);
        if (file.isDirectory() && file.exists()) {
            File[] files = file.listFiles();
            int total = 0;
            for (File singleFile : files) {
                total = (int) (total + singleFile.length());
            }
            System.out.println("The total size of package is " + total + " bytes");

        } else System.err.println("The folder can not find");
    }

    static void createFileWithContent(String path, String fileName, String content) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
