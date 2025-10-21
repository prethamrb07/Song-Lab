public class Driver {
   public static void main (String [] arg){
      ReadData r = new ReadData();
      Song [] list = r.read();
     
      int numSongs = list.length;
      System.out.println(numSongs);
      int year1982 = r.getSongsYear(list, 1982);
      int year2000 = r.getSongsYear(list, 2000);
      int year2015 = r.getSongsYear(list, 2015);
      System.out.println(year1982);
      System.out.println(year2000);
      System.out.println(year2015);
      int danceLess80 = r.danceabilityRating(list);
      System.out.println(danceLess80);
       System.out.println(r.getLongestTitle(list));
       System.out.println(r.lowestShake(list));
       
   }
}
