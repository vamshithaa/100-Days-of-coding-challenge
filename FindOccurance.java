public class FindOccurance{
public static int first=-1;
public static int last=-1;
public static void Find(String str, int indx, char element){
  if(indx==str.length()){
    System.out.println(first);
    System.out.println(last);
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
    String str="aa";
    Find(str,0,'a');
  }
}
    
