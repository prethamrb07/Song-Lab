public class Driver {
   public static void main (String [] arg){
      ReadData r = new ReadData();
      Song [] list = r.read();
      r.getLongestTitle(list);
   }
}
