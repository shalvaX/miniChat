package ge.edu.btu.server;

import ge.edu.btu.common.Chat;
import ge.edu.btu.common.User;
import java.util.List;
import java.util.Map;

public interface ChatService {
    void initChats(List<Chat>chats);
    Map<String,String> getMessage(User user, Chat chat);
    void sendMessage(User user, Chat chat);
    void showMessages(Chat chat);
    void createUser(String name, String id);
    void createRoom(String name);
}
