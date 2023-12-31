package ss16_io_biobanry.pratice.th2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            os = new FileOutputStream(source);
            is = new FileInputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter you source: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter you dest: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.println("Copy completed");
        }catch (IOException e){
            System.out.println("Can't copy that file!!");
            e.printStackTrace();
        }
    }
}
