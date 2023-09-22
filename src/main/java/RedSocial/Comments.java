package RedSocial;

import java.util.Date;

public class Comments {
    private String comment;
    private Date commentDate;
    private String owner;

    public Comments(String comment, Date commentDate, String owner) {
        this.comment = comment;
        this.commentDate = commentDate;
        this.owner = owner;
    }
}
