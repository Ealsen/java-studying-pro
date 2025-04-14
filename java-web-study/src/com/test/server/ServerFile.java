package com.test.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
    public static void main(String[] args) {
        int port = 8082;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                InputStream input = socket.getInputStream();
                OutputStream output = new FileOutputStream("src/com/test/server/received_test.txt");

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }

                socket.close();
                System.out.println("File received and saved.");
            }
        } catch (IOException ex) {
            System.out.println("server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
