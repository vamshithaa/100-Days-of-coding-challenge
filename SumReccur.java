import java.util.*;
public class SumReccur {
  public static void sum(int i,int n,int sum){
  //base case
  if(i==n){
    sum+=i;
    System.out.println(sum);
    return;
  }
  sum+=i;
  sum(i+1,n,sum);
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of termnation to get the sum of the natural numbers:");
    int n=sc.nextInt();
    System.out.print("Sum of ");
    for(int i=1;i<=n;i++){
 System.out.print(i+" ");
    }
    System.out.print("=");
  
    sum(1,n,0);
}
}
