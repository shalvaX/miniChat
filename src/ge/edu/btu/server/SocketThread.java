package ge.edu.btu.server;
import ge.edu.btu.common.Command;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketThread extends Thread {
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private ChatService chatService;

    public SocketThread(Socket socket,ChatService chatService) throws IOException {
        this.output = new ObjectOutputStream(socket.getOutputStream());
        this.input = new ObjectInputStream(socket.getInputStream());
        this.chatService = chatService;
    }

    @Override
    public void run(){
        while(true){
            try {
                Command command = (Command) input.readObject();
                switch (command){
                    case SEND_MESSAGES:
                        break;
                    case SHOW_MESSAGES:
                        output.writeObject(chatService.showMessages());
                        break;
                    case CREATE_USER:
                        break;
                    case CREATE_ROOM:
                        break;
                }
            } catch (IOException | ClassNotFoundException exception) {
                exception.printStackTrace();
            }
        }
    }
}
