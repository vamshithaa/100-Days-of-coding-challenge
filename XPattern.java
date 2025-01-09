import java.util.*;
public class XPattern{
  public static void main(String[]args){
    System.out.println("********X PATTERN********");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n to terminate:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
         if(i==j||j==n-i+1){
           System.out.print("*");
         }
         else{
           System.out.print(" ");
         }
       }
      System.out.println();
    }
  }
}

      
