import java.util.HashSet;
public class seqrechash{
  public static void sequence(String str, int idx, String newString, HashSet<String> set){
    if(idx==str.length()){
      if(set.contains(newString)){
        return;
      }
      else
    {
      System.out.println(newString);
      set.add(newString);
      return;
    }
    }
    char character=str.charAt(idx);
    sequence(str, idx+1,newString+character,set);
    sequence(str, idx+1,newString,set);
  }
    public static void main(String[]args){
      String str="aaa";
      HashSet<String> set=new HashSet<>();
       sequence(str, 0,"",set);
    }
}
     
     
