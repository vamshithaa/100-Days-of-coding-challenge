// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class CalPowRec{
  public static int CalcPower(int x,int n){
    //base case
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int pow1=CalcPower(x,n-1);
    int pow2=x*(pow1);
    return pow2;
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
