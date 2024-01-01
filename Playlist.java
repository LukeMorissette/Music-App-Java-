import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;
public class Playlist{
    private String m_name;
    private LinkedList<Content> my_content = new LinkedList<Content>();
    int i;
    int q;
    
    public Playlist(LinkedList<Content> content, String name){
        my_content = content;
        m_name = name;
    }
    public void addContent(Content c){
        my_content.add(c);
        Collections.sort(my_content);
    }
    public void shuffle(){
        LinkedList<Integer> played = new LinkedList<Integer>();
        int count = 0;
        while (count < my_content.size()){
            Random r = new Random();
            q = r.nextInt(my_content.size());
            boolean t = false;
            for (i = 0; i < played.size(); i++){
                if (q == played.get(i)){
                    t = true;
                }
            }
            if (t == false){
                my_content.get(q).play();
                played.add(q);
                count += 1;
                
            }
        }
    }
    public void playAlbum(){
        for (i = 0; i < my_content.size(); i++){
            my_content.get(i).play();
        }
    }
    public LinkedList<Content> getContent(){
        return my_content;
    }
    public void setContent(LinkedList<Content> content){
        my_content = content;
    }
    public String getName(){
        return m_name;
    }
    public String toString(){
        String S = "";
        S += m_name + "\n";
        S += my_content + "\n";
        return S;
    }
}    