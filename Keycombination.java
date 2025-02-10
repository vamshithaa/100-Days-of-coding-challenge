import java.util.*;
public class Keycombination{
public static String[] keypad={".","abc","def","ghi","jkl","mno","pqqrs","tu","vwx","yz"};
public static void printcomb(String str, int indx ,String combination){
//base case
if(indx==str.length()){
System.out.println(combination);
return;
}
char currChar= str.charAt(indx);
String mapping=keypad[currChar-'0'];
for(int i=0; i<mapping.length();i++){
printcomb(str,indx+1 ,combination+mapping.charAt(i));
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
String str=sc.nextLine();
printcomb(str, 0 ,"");
}
}


