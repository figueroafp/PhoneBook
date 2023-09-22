package RedSocial;

import java.util.List;
import java.util.ArrayList;

public class Users {
    private String name;
    private List<Users> friendList = new ArrayList<>();
    private List<Post> postList = new ArrayList<>();


    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Users> getFriendList() {
        return friendList;
    }

    public List<Post> getPostList() {
        return postList;
    }
}