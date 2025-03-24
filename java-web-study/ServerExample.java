import java.io.*;
import java.net.*;

public class ServerExample {

    private static final int PORT = 8080; // 定义服务器端口号为常量
    private static final String LOG_PREFIX = "ServerExample: "; // 日志前缀

    public static void main(String[] args) {
        // 使用 try-with-resources 自动管理 ServerSocket 资源
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println(LOG_PREFIX + "Server started, waiting for client connection on port " + PORT);

            // 等待客户端连接
            try (Socket socket = server.accept()) {
                InetAddress clientAddress = socket.getInetAddress();
                System.out.println(LOG_PREFIX + "Client connected: " + clientAddress.getHostAddress());

                // 使用 try-with-resources 管理 BufferedReader 和 PrintWriter 资源
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) { // 添加 PrintWriter 用于写回客户端

                    String message = reader.readLine(); // 读取客户端消息
                    if (message == null) {
                        System.out.println(LOG_PREFIX + "Received empty message from client.");
                    } else {
                        System.out.println(LOG_PREFIX + "Message from client: " + message);

                        // 向客户端发送确认信息
                        String response = "Server received your message: " + message;
                        writer.println(response); // 发送确认信息
                        System.out.println(LOG_PREFIX + "Sent response to client: " + response);
                    }
                } catch (IOException e) {
                    handleException("Error while reading from or writing to client", e);
                }

            } catch (IOException e) {
                handleException("Error while accepting client connection", e);
            }
        } catch (IOException e) {
            handleException("Failed to start the server", e);
        }
    }

    /**
     * 统一的异常处理方法
     *
     * @param context 异常上下文信息
     * @param e       异常对象
     */
    private static void handleException(String context, Exception e) {
        System.err.println(LOG_PREFIX + context + ": " + e.getMessage());
        e.printStackTrace(); // 在生产环境中应替换为日志框架
    }
}