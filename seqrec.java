public class seqrec{
  public static void sequence(String str, int idx, String newString){
    if(idx==str.length()){
      System.out.println(newString);
      return;
    }
    char character=str.charAt(idx);
    sequence(str, idx+1,newString+character);
    sequence(str, idx+1,newString);
  }
    public static void main(String[]args){
      String str="abc";
       sequence(str, 0,"");
    }
}
     
