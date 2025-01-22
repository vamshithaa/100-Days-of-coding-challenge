import java.util.*;
public class Reccursion{
  public static void Recfunc(int n, int k){
     if(n==k+1){
          return;
      }
    System.out.println(n);
    Recfunc(n+1,k);
  }
  public static void main(String[]args){
  int n=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of termination:");
    int k=sc.nextInt();
    Recfunc(n,k);
  }
}
    
