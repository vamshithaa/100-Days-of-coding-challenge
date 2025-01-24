import java.util.*;
public class FibRecc{
  public static void fibonacci(int a,int b,int n){
     //base condition
    if(n==0){
      return ;
    }
    int c=a+b;
    System.out.println(c);
    fibonacci(b,c,n-1);
}
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the value of n:");
  int n=sc.nextInt();
  System.out.println("The Fibonacci series are:");
  int a=0,b=1;
  System.out.println(a);
  System.out.println(b);
  fibonacci(a,b,n-2);
}
}
