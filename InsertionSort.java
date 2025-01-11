import java.util.*;
public class InsertionSort{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" elements:");
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
    System.out.print("Array before sorting:");
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.print("Array after sorting:");
    for(int i=1;i<n;i++){
      int current=a[i];
      int j=i-1;
      while(j>=0 && a[j]> current){
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=current;
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
  }
}

      

      
