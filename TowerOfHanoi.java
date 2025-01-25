// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class TowerOfHanoi{
  public static void TOH(int n, String source, String helper, String Dest){
    //base case
    if(n==1){
       System.out.println("Disk shifted from "+source+ " to "+Dest);
       return;
    }
    TOH(n-1,source,Dest,helper);
    System.out.println("Disk shifted from "+source+ " to "+Dest);
    TOH(n-1,helper,source,Dest);
    
  }
  public static void main(String[]args){
      System.out.println("*************TOWER OF HANOI*************");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of disks:");
     int n=sc.nextInt();
     TOH(n,"Source","Helper","Destination");
  }
}
