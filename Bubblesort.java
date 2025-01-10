import java.util.*;
public class Bubblesort{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.print("Enter "+n+" elements:");
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
    System.out.print("Array before sorting:");
    for(int i=0;i<n;i++){
      System.out.print(a[i]);
    }
    for(int i=0; i<a.length-1;i++){
      for(int j=0; j<a.length-i-1;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    System.out.println();
    System.out.print("Array after sorting:");
     for(int i=0;i<a.length;i++){
           System.out.print(a[i]);
      }
  }
}

  
