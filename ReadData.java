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
         in.nextLine();
         while (in.hasNext()) {
            
         //System.out.println(count);

         String line = in.nextLine();
         

         String artist = line.split(";")[0];
         String track = line.split(";")[1];
         int release_date = Integer.parseInt(line.split(";")[2]);
         String genre = line.split(";")[3];
         int duration = Integer.parseInt(line.split(";")[4]);
         double shake = Double.parseDouble(line.split(";")[5]);
         double obcene = Double.parseDouble(line.split(";")[6]);
         double danceability = Double.parseDouble(line.split(";")[7]);
         double loudness = Double.parseDouble(line.split(";")[8]);
         String topic = line.split(";")[9];

         songs[count] = new Song(artist, track, genre, release_date, danceability, obcene, shake);
         count++;
         }
         in.close();
      } catch (IOException e) {
         System.out.println("Error");

      }
      
      //System.out.println(totalSongs);
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
   public int getSongsYear(Song[] list, int year){
      int count = 0;
      for (int i = 0; i < list.length; i++){
         if (list[i].getYear() == year){
            count++;
         }
      }
      return count;
   }
   public int danceabilityRating(Song[] list){
      int count = 0;
      for (int i = 0; i < list.length; i++){
         if (list[i].getDanceabilty() > 0.80)
            count++;
      }
      return count;
   }
      public String lowestShake(Song[] list) {
      double shake = 1;
      String title2 = "";
      for (int i = 0; i < 28371; i++) {
         double newShake = list[i].getShakeability();
         if (newShake < shake) {
            shake = newShake;
            title2 = list[i].getTitle();
         }
         

      }
      return title2;
   }
}
