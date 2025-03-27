package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever001 {
    public static void main(String[] args) {
        // http://localhost:8085/
        try(ServerSocket server = new ServerSocket(8085)) {
            System.out.println("Server is listening on port "+ server.getLocalPort());
            Socket socket = server.accept();
            System.out.println("Connected.IP Address is " + socket.getInetAddress().getHostAddress());
            InputStream in = socket.getInputStream();
            System.out.println("Reading from socket:\n");
            while (true) {
                int i = in.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
