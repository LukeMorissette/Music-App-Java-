public class Content implements Comparable<Content>{
    private String title;
    private String artist;
    private int streams;
    public Content(String t,String A, int S){
        title = t;
        artist = A;
        streams = S;
    }

    public void play(){
        System.out.println("Playing " + title);
        streams += 1;
    }

    public String toString(){
        String S = "";
        S += "Title: " + title + "\n";
        S += "Artist: " + artist + "\n";
        S += "Streams: " + streams + "\n";
        return S;
    }

    public int compareTo(Content c) {
        int ret;
        if (streams > c.streams) {
          ret = -1;
        } else if (streams < c.streams) {
          ret = 1;
        } else {
          ret = 0;
        }
        return ret;
      }
}