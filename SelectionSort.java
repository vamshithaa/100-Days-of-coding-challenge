import java.util.*;
public class SelectionSort{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+ " elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.print("Array before sorting:");
    for(int i=0; i<n;i++){
      System.out.print(a[i]);
    }
     System.out.println();
    System.out.print("Array after sorting:");
    for(int i=0;i<n;i++){
      int smallest=i;
      for(int j=0; j<n;j++){
        if(a[smallest]>a[j]){
          smallest=j;
        }
        int temp=a[smallest];
        a[smallest]=a[j];
        a[j]=temp;
      }
    }
  }
}
      
