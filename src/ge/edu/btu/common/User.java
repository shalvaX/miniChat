package ge.edu.btu.common;

import java.util.Scanner;

public class User {
    private String name;
    private String id;
    private Scanner find = new Scanner(System.in);
    private String input;

    public User(){}
    public User(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInput(){
        input = find.nextLine();
        return input;
    }

}
