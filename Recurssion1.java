public class Recurssion{
  public static void printPermutation(String str, String permutation){
    if(str.length()==0){
      System.out.println(permutation);
      return;
    }
    for(int i=0;i<str.length();i++){
      char currentChar=str.charAt(i);
      String newString=str.substring(0,i)+str.substring(i+1);
      printPermutation(newString, permutation+currentChar);
    }
  }
  public static void main(String[]args){
    String str="abc";
    printPermutation(str,"");
  }
}
