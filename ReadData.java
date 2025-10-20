import java.util.Scanner;
import java.io.*;

public class ReadData {

   public Song [] read() {
      int totalSongs = 0;
      int totalPerYear = 0;
      Scanner in;
      int count = 0;
      Song[] songs = new Song[28371];
      try {
         in = new Scanner(new File("songs 2025-2026ANSI.csv"));
         
         while (in.hasNext()) {
            count++;
            System.out.println(count);

         String line = in.nextLine();
         System.out.println("The number of songs in 1982 is " + totalPerYear);

         String artist = line.split(";")[0];
         String track = line.split(";")[1];
         int release_date = Integer.parseInt(in.nextLine().split(";")[2]);
         String genre = line.split(";")[3];
         int duration = Integer.parseInt(line.split(";")[4]);
         double shake = Integer.parseInt(line.split(";")[5]);
         String obcene = line.split(";")[6];
         double danceability = Double.parseDouble(line.split(";")[7]);
         String loudness = line.split(";")[8];
         String topic = line.split(";")[9];

         songs[count] = new Song(artist, track, genre, release_date, danceability);
         }
         in.close();
      } catch (IOException e) {
         System.out.println("Error");

      }
      
      System.out.println(totalSongs);
      return songs;

   }

   public String getLongestTitle(Song[] list) {
      String title = "";
      for (int i = 0; i < 28371; i++) {
         String newTitle = list[i].getTitle();
         if (newTitle.length() > title.length()) {
            title = newTitle;
         }

      }
      return title;
   }
}
