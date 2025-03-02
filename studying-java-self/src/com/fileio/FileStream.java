package com.fileio;
import java.io.*;

public class FileStream {
    public static void testFileIOTest() throws FileNotFoundException {
        // java默认运行目录在项目的根目录下，所以要写上相对路径
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() > 0) {
                System.out.print((char) fis.read());
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFileIOTest1() throws FileNotFoundException {
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        try(FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.available() > 0) {
                System.out.print((char) fis.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFileIOTest2() throws FileNotFoundException {
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        try(FileOutputStream fis = new FileOutputStream(fileName, true)) {
        fis.write("\nHello World,fis!\n".getBytes());
        fis.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFileIOTest3() throws FileNotFoundException {
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        try(FileReader fis = new FileReader(fileName)) {
            while (fis.ready()) {
                System.out.print((char) fis.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFileIOTest4() throws FileNotFoundException {
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        try(FileWriter fis = new FileWriter(fileName, true)) {
            fis.write("\nHello World,fis!\n");
            fis.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void testFileIOTest5() throws FileNotFoundException {
        String fileName = ".\\src\\com\\fileio\\testFis.txt";
        File file = new File(fileName);
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
    }
}
