// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class Reclogn{
  public static int CalcPower(int x,int n){
    //base case
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    if(n%2==0){
  return CalcPower(x,n/2)*CalcPower(x,n/2);
    }
    else{
       return CalcPower(x,n/2)*CalcPower(x,n/2)*x;
    }
}
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 
  System.out.print("Enter the number to calculate its power value:");
  int x=sc.nextInt();
   System.out.print("Enter the value of power to be calculated:");
  int n=sc.nextInt();
  int ans=CalcPower(x,n);
  System.out.println(ans);
}
}
