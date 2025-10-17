import java.util.Scanner;
import java.io.*;
public class ReadData {
   public static void main(String [] args){
      int totalSongs = 0;
      int total1982 = 0;
      int total2000 = 0;
      int total2015 = 0;
      Scanner in;
      int count;
      try{
         in = new Scanner (new File("songs 2025-2026ANSI.csv"));
         while(in.hasNext()){
            count++;
            System.out.println(count);
            System.out.println(in.nextLine().split(";")[2]);
            totalSongs++;
            
            String artist = in.nextLine().split(";")[0];
            String track = in.nextLine().split(";")[1];
            int release_date = Integer.parseInt(in.nextLine().split(";")[2]);
            String genre = in.nextLine().split(";")[3];
            int duration = Integer.parseInt(in.nextLine().split(";")[4]);
            double shake = Integer.parseInt(in.nextLine().split(";")[5]);
            String obcene = in.nextLine().split(";")[6];
            double danceability = Double.parseDouble(in.nextLine().split(";")[7]);
            String loudness = in.nextLine().split(";")[8];
            String topic = in.nextLine().split(";")[9];

            songs[count] = new Song( artist, track,  genre,  release_date, danceability);
         }  
         in.close();
      }catch(IOException e){
         System.out.println("Error");
   
   }
   System.out.println(totalSongs);
   }
}

