package RedSocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Post {
    private List<Comments> commentslist = new ArrayList<>();
    private Date date;
    private String title;

    public Post(String title) {
        this.date = new Date();
        this.title = title;
    }
}
