import java .util.*;
public class Main{
  public static int factorial(int n){
    //base case
    if(n==1||n==0){
      return 1;
    }
  int fact_nm1=factorial(n-1);
    int fact_n=n*fact_nm1;
    return fact_n;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value to find the factorial:");
    int n=sc.nextInt();
    int ans=factorial(n);
    System.out.println("The Factorial of" +n+" is:"+ans);
  }
}


