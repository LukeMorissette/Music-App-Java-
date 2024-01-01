import java.util.LinkedList;
import java.util.Collections;
public class Listener extends Account{
    private LinkedList<Content> favorites = new LinkedList<Content>();


    public Listener(LinkedList<Content> favs){
        super();
        favorites = favs;
    }
    public Listener(String name, String type, LinkedList<Content> favs){
        super(name,type);
        favorites = favs;
    }

    public LinkedList<Content> getfavorites(){
        return favorites;
    }
    public void setfavorites(LinkedList<Content> favs){
        favorites = favs;
    }
    public void addfavorite(Content c){
        favorites.add(c);
        Collections.sort(favorites);
    }

    public String toString(){
        String S = super.toString();
        S += favorites;
        return S;
    }

}