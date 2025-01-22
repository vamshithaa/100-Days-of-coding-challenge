import java.util.*;
public class Reccur{
  public static void Recfunc(int n){
      if(n==0){
          return;
      }
    System.out.println(n);
    Recfunc(n-1);
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    Recfunc(n);
  }
}
    
