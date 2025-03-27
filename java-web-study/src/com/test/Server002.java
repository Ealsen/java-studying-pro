package com.test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server002 {
    public static void main(String[] args) {
        // http://localhost:8086/
        try(ServerSocket server = new ServerSocket(8086)){
            Socket socket = server.accept();
            System.out.println("Server is listening on port "+ server.getLocalPort());
            System.out.println("Connected.IP Address is " + socket.getInetAddress().getHostAddress());
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <title>测试网站</title>
            </head>
            <body>
                <h1>欢迎访问我们的测试网站</h1>
                <p>这个网站包含很多你喜欢的内容，但是没办法展示出来，因为我们还没学会</p>
            </body>
            </html>
            """;
            writer.write("HTTP/1.1 200 OK\r\n");   //根据HTTP协议规范，返回对应的响应格式
            writer.write("Content-Type: text/html;charset=utf-8\r\n");  //务必加一下内容类型和编码，否则会乱码
            writer.write("\r\n");
            writer.write(html);
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
