import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        // 定义服务器地址和端口号
        String serverAddress = "localhost"; // 服务器地址，这里假设服务器运行在同一台机器上
        int port = 8080; // 服务器端口号

        try (Socket socket = new Socket(serverAddress, port);
             Scanner scanner = new Scanner(System.in); // 使用 try-with-resources 自动关闭 Scanner
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream(), "UTF-8")) {

            System.out.println("Connected to server at " + serverAddress + ":" + port);

            // 获取用户输入并发送给服务器
            if (scanner.hasNextLine()) { // 检查是否有下一行输入
                String userInput = scanner.nextLine();
                writer.write(userInput + '\n'); // 发送用户输入到服务器
                writer.flush();

                // 读取服务器的响应
                String response = reader.readLine(); // 读取服务器发送的消息
                if (response != null) {
                    System.out.println("Server response: " + response);
                } else {
                    System.out.println("Received empty response from server.");
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Server address unknown: " + serverAddress);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Failed to connect to server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}