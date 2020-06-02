import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRequest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            System.out.println("开始监听8080端口...");
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String request = new String(bytes);
            System.out.println(request);
        }
    }
}
