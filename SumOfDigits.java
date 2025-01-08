import java.util.*;
public class SumOfDigits{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Digit:");
    int n=sc.nextInt();
    int rem=0,sum=0,temp=n;
    while(n>0){
      rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println("The sum of the digit" +temp+ "is:" +sum);
  }
}

      
