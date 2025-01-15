import java.util.*;
public class SlantHollowSquarePatt{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=n;k++){
        if(k==1||k==n||i==1||i==n){
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
