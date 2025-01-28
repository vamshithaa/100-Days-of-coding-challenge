import java.util.*;
public class FindOccurance{
public static int first=-1;
public static int last=-1;
public static void Find(String str, int indx, char element){
  if(indx==str.length()){
    System.out.println("The first occurance of element "+element+" is at index:"+first);
    System.out.println("The last occurance of element "+element+" is at index:"+last);
    return;
  }
  char currentelement=str.charAt(indx);
  if(currentelement==element){
    if(first==-1){
      first=indx;
    }
    else{
      last=indx;
    }
}
  Find(str,indx+1, element);
}
  public static void  main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("****Finding the first and last occurance of an element in the given string****"); 
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    System.out.println("Enter the element to find its 1st and last occurance from the given string:");
    char element=sc.next().charAt(0);
    Find(str,0,element);
  }
}
    

  
