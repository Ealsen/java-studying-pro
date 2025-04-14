package com.test.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientFile {
    public static void main(String[] args) throws IOException {
        try( Socket socket = new Socket("localhost", 8082)){
            FileInputStream fileInputStream = new
                    FileInputStream("src/com/test/server/test.txt");
            OutputStream stream = socket
                    .getOutputStream();
            byte[] buffer = new byte[1024];
            int i;
            while((i = fileInputStream.read(buffer)) != -1){
                stream.write(buffer, 0, i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
