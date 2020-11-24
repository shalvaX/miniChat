package ge.edu.btu.server;
import ge.edu.btu.common.Chat;
import ge.edu.btu.common.User;

import java.util.HashMap;
import java.util.List;

public class ChatServiceImpl implements  ChatService {
    private HashMap<String, String> massages = new HashMap<String, String>();
    private String name;

    @Override
    public void initChats(List<Chat> Chats) {

    }

    @Override
    public String getMessage(User user) {
        return null;
    }

    @Override
    public String sendMessage(User user) {
        return null;
    }

    @Override
    public HashMap<String, String> getFullConvo(Chat chat) {
        return null;
    }
}
