package ge.edu.btu.common;
import java.util.HashMap;
import java.util.Map;

public class Chat {
    private Map<String, String> messages = new HashMap<String, String>();
    private String name;

    public Chat(){}
    public Chat(String name){
        this.name = name;
    }

    public Map<String, String> getFullChat() {
        return messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMessages(String userm,String chatm){
        messages.put(userm,chatm);
    }
}
