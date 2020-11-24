package ge.edu.btu.server;

import ge.edu.btu.common.Chat;
import ge.edu.btu.common.User;

import java.util.HashMap;
import java.util.List;

public interface ChatService {
    void initChats(List<Chat>Chats);
    String getMessage(User user);
    String sendMessage(User user);
    HashMap<String,String>getFullConvo(Chat chat );
}
