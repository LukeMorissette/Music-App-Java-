public class Podcast extends Content{
    private int episode;
    
    public Podcast(String title,String artist, int streams,int E){
        super(title,artist,streams);
        episode = E;
    }
    public String toString(){
        String S = super.toString();
        S += "Episode: " + episode + "\n";
        return S;
    }
}