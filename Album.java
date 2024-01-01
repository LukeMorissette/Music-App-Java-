import java.util.LinkedList;
public class Album extends Playlist{
    int i;
    public Album(LinkedList<Content> content, String name){
        super(content, name);

    }
    public void addContent(Content c){
        if (c instanceof Podcast){
            System.out.println("You can't add a Podcast to an Album");
        }
        else {
            super.addContent(c);
        }
    }
}   