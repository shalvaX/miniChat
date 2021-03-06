package ge.edu.btu.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        ChatService chatService = new ChatServiceImpl();
        while (true) {
            Socket socket = serverSocket.accept();
            SocketThread socketThread = new SocketThread(socket,chatService);
            socketThread.start();
        }
    }
}
