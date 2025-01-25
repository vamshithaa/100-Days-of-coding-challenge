import java.util.*;
public class Reverse{
  public static void revr(String str, int idx){
    if(idx==0){
      System.out.print(str.charAt(idx));
      return;
    }
    System.out.print(str.charAt(idx));
    revr(str, idx-1);
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter the String to be reversed:");
    String str=sc.nextLine();
    revr(str,str.length()-1);
  }
}
