package RedSocial;

public class MediaPost extends Post{
    private int duration;
    private String quality;

    public MediaPost(String title, int duration, String quality) {
        super(title);
        this.duration = duration;
        this.quality = quality;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getQuality(){
        return quality;
    }

    public void setQuality(String quality){
        this.quality = quality;
    }
}
