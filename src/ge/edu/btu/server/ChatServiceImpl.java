package ge.edu.btu.server;

import ge.edu.btu.common.Chat;
import ge.edu.btu.common.User;
import java.util.List;
import java.util.Map;

public class ChatServiceImpl implements  ChatService {
    private List<Chat> chats;
    private String newMessage;

    @Override
    public void initChats(List<Chat> chats) {
        this.chats = chats;

    }

    @Override
    public Map<String,String> getMessage(User user, Chat chat) {
        return chat.getFullChat();
    }

    @Override
    public void sendMessage(User user, Chat chat) {
        this.newMessage = user.getName()+";"+user.getId()+";"+user.getInput();
        chat.addMessages(newMessage,chat.getName());
    }

    @Override
    public void showMessages(Chat chat){
        for (Map.Entry<String, String> me : chat.getFullChat().entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

    @Override
    public void createUser(String name, String id){
        User user = new User(name, id);
    }

    @Override
    public void createRoom(String name){
        Chat chat = new Chat(name);
    }
}
