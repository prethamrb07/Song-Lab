public class Song {
   private String artist, title, genre;
   private int year;
   private double danceability, obcene, shakeability;
   
   public Song(String artist, String title, String genre, int year, double danceability, double obcene, double shakeability)
   {
      this.artist = artist;
      this.title = title;
      this.genre = genre;
      this.year = year;
      this.danceability = danceability;
      this.obcene = obcene;
      this.shakeability = shakeability;
   }
   public String getArtist(){
      return artist;
   }
   public String getTitle(){
      return title;
   }
   public int getYear(){
      return year;
   }
   public double getDanceabilty(){
      return danceability;
   }
   public double getShakeability(){
      return shakeability;
   }
  
}
