import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class MusicAppDriver{
    public static void main(String[] args){
        LinkedList<Playlist> my_playlists = new LinkedList<Playlist>();
        Content C1 = new Content("All the Debts I owe", "Caamp", 100000);
        Content C2 = new Content("Great Heights", "Caamp", 200000);
        Content C3 = new Content("Vagabond", "Caamp", 300000);
        Content C4 = new Content("Iffy", "Caamp", 400000);
        Content C5 = new Content("See the World", "Caamp", 500000);
        Content C6 = new Content("John Henry", "Caamp", 600000);
        LinkedList<Content> my_content1 = new LinkedList<Content>();
        Album Pl1 = new Album(my_content1, "Caamp");
        Pl1.addContent(C1);
        Pl1.addContent(C2);
        Pl1.addContent(C3);
        Pl1.addContent(C4);
        Pl1.addContent(C5);
        Pl1.addContent(C6);
        my_playlists.add(Pl1);
        Podcast P1 = new Podcast("Ted's Podcast", "Ted", 100000, 1);
        Podcast P2 = new Podcast("Ted's Podcast", "Ted", 200000, 2);
        Podcast P3 = new Podcast("Ted's Podcast", "Ted", 300000, 3);
        Podcast P4 = new Podcast("Ted's Podcast", "Ted", 400000, 4);
        Podcast P5 = new Podcast("Ted's Podcast", "Ted", 500000, 5);
        Podcast P6 = new Podcast("Ted's Podcast", "Ted", 600000, 6);
        LinkedList<Content> my_content2 = new LinkedList<Content>();
        Playlist Pl2 = new Playlist(my_content2, "Ted's Podcast");
        Pl2.addContent(P1);
        Pl2.addContent(P2);
        Pl2.addContent(P3);
        Pl2.addContent(P4);
        Pl2.addContent(P5);
        Pl2.addContent(P6);
        my_playlists.add(Pl2);
        Podcast P11 = new Podcast("Crazy Podcast", "Luke", 100000, 1);
        Podcast P12 = new Podcast("Crazy Podcast", "Luke", 200000, 2);
        Podcast P13 = new Podcast("Crazy Podcast", "Luke", 300000, 3);
        Content C11 = new Content("Pink + White", "Frank Ocean", 400000);
        Content C12 = new Content("Nike", "Frank Ocean", 500000);
        Content C13 = new Content("Lost", "Frank Ocean", 600000);
        LinkedList<Content> my_content3 = new LinkedList<Content>();
        Playlist Pl3 = new Playlist(my_content3, "Crazy Mashup");
        Pl3.addContent(P11);
        Pl3.addContent(P12);
        Pl3.addContent(P13);
        Pl3.addContent(C11);
        Pl3.addContent(C12);
        Pl3.addContent(C13);
        my_playlists.add(Pl3);
        int i;
        int p = 0;
        String name;
        int count = 0;
        String Writer;
        String Song;
        int Streams;
        int index;
        int episode;
        int podcast;
        LinkedList<Content> favs = new LinkedList<Content>();
        Listener User = new Listener("new","type",favs);
        System.out.println("Welcome to Sputify");
        System.out.println("Please start by selecting 1 and creating a listener account");
        while (p != 7){
            Scanner Scnr = new Scanner(System.in);
            System.out.println("1. Create a listener account");
            System.out.println("2. List all Playlists and Albums and their contents");
            System.out.println("3. Add songs to an existing playlist");
            System.out.println("4. Shuffle an existing Playlist or listen to an Album");
            System.out.println("5. Add a song or podcast to favorites");
            System.out.println("6. Export all of a listener’s favorites out to a file in ascending order by times streamed");
            System.out.println("7. Exit");
            try {
                p = Scnr.nextInt();
                } catch (Exception e){
                    System.out.println("That's okay! You need to input an integer next time though!");
                    continue;
                }

            if (p == 1){
                LinkedList<Content> favorites = new LinkedList<Content>();

                System.out.println("What would you like your name to be?");
                Scanner inputName = new Scanner(System.in);
                name = inputName.nextLine();
                User.setuserName(name);
                User.setaccountType("Listener");
                System.out.println("Welcome " + User.getuserName());
                count = 1;
            }
            if (p == 2){
                if (count == 0){
                    System.out.println("First create a listener account!");
                    continue;
                }
                System.out.println(my_playlists);
            }
            if (p == 3){
                if (count == 0){
                    System.out.println("First create a listener account!");
                    continue;
                }
                System.out.println("Which Playlist or Album would you like to add to?");
                for (i = 0; i < my_playlists.size(); i++){
                    System.out.println(i + ". " + my_playlists.get(i).getName());
                }
                Scanner playlist = new Scanner(System.in);
                index = playlist.nextInt();
                if (my_playlists.get(index) instanceof Album){
                    System.out.println("What is the name of your song?");
                    Scanner songName = new Scanner(System.in);
                    Song = songName.nextLine();
                    System.out.println("Who wrote it?");
                    Scanner writerName = new Scanner(System.in);
                    Writer = writerName.nextLine();
                    System.out.println("How many streams does it have?");
                    Scanner streamNum = new Scanner(System.in);
                    Streams = streamNum.nextInt();
                    Content NewSong = new Content(Song,Writer,Streams);
                    my_playlists.get(index).addContent(NewSong);
                    System.out.println("Great! " + Song + " is now apart of the Album " + my_playlists.get(index).getName());
                }
                else{
                    System.out.println("1. Podcast");
                    System.out.println("2. Song");
                    Scanner choice = new Scanner(System.in);
                    podcast = choice.nextInt();
                    if (podcast == 1){
                        System.out.println("What is the name of your podcast?");
                        Scanner songName = new Scanner(System.in);
                        Song = songName.nextLine();
                    }
                    else{
                        System.out.println("What is the name of your song?");
                        Scanner songName = new Scanner(System.in);
                        Song = songName.nextLine();
                    }
                    System.out.println("Who made it?");
                    Scanner writerName = new Scanner(System.in);
                    Writer = writerName.nextLine();
                    System.out.println("How many streams does it have?");
                    Scanner streamNum = new Scanner(System.in);
                    Streams = streamNum.nextInt();
                    if (podcast == 1){
                        System.out.println("What episode of the podcast is it?");
                        Scanner epiNum = new Scanner(System.in);
                        episode = epiNum.nextInt();
                        Podcast NewPodcast = new Podcast(Song,Writer,Streams,episode);
                        my_playlists.get(index).addContent(NewPodcast);
                        System.out.println("Great! " + Song + " is now apart of the Album " + my_playlists.get(index).getName());
                    }
                    else{
                        Content NewSong = new Content(Song,Writer,Streams);
                        my_playlists.get(index).addContent(NewSong);
                        System.out.println("Great! " + Song + " is now apart of the Album " + my_playlists.get(index).getName());
                    }
                }
            }
            if (p == 4){
                if (count == 0){
                    System.out.println("First create a listener account!");
                    continue;
                }
                System.out.println("Which Playlist or Album would you like to add to?");
                for (i = 0; i < my_playlists.size(); i++){
                    System.out.println(i + ". " + my_playlists.get(i).getName());
                }
                Scanner playlist = new Scanner(System.in);
                index = playlist.nextInt();
                if (my_playlists.get(index) instanceof Album){
                    my_playlists.get(index).playAlbum();
                }
                else{
                    my_playlists.get(index).shuffle();
                }
            }
            if (p == 5){
                if (count == 0){
                    System.out.println("First create a listener account!");
                    continue;
                }
                System.out.println("1. Podcast");
                System.out.println("2. Song");
                Scanner choice = new Scanner(System.in);
                podcast = choice.nextInt();
                if (podcast == 1){
                    System.out.println("What is the name of your podcast?");
                    Scanner songName = new Scanner(System.in);
                    Song = songName.nextLine();
                }
                else{
                    System.out.println("What is the name of your song?");
                    Scanner songName = new Scanner(System.in);
                    Song = songName.nextLine();
                }
                System.out.println("Who made it?");
                Scanner writerName = new Scanner(System.in);
                Writer = writerName.nextLine();
                System.out.println("How many streams does it have?");
                Scanner streamNum = new Scanner(System.in);
                Streams = streamNum.nextInt();
                if (podcast == 1){
                    System.out.println("What episode of the podcast is it?");
                    Scanner epiNum = new Scanner(System.in);
                    episode = epiNum.nextInt();
                    Podcast NewPodcast = new Podcast(Song,Writer,Streams,episode);
                    User.addfavorite(NewPodcast);
                    System.out.println("Great! " + Song + " is now apart of the your favorites ");
                }
                else{
                    Content NewSong = new Content(Song,Writer,Streams);
                    User.addfavorite(NewSong);
                    System.out.println("Great! " + Song + " is now apart of the your favorites");
                }
            }
            if (p == 6){
                if (count == 0){
                    System.out.println("First create a listener account!");
                    continue;
                }
                try{
                 PrintWriter pw = new PrintWriter(new FileWriter("Favorites.txt"));
                 pw.println(User.getuserName() + "'s Favorites:");
                 for(i = 0; i < (User.getfavorites().size()); i++){
                    pw.println(User.getfavorites().get(i));
                 }
                 pw.close();
               } catch(IOException ioe){
                 System.err.println("Couldn't output to file!");
                 ioe.printStackTrace();
               }
            }
            if (p == 7){
                if (count == 1){
                    System.out.println("Thanks for listening!");
                }
                else{
                    System.out.println("Lame");
                }
            }
            else{
                System.out.println("Please input a number between 1 and 7");
            }

        }
    }
}
