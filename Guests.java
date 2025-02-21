public class Guests{
  public static int Callguests(int n){
    //base case
    if(n<=1){
      return 1;
    }
    int v=Callguests(n-1);
    int s=(n-1)*Callguests(n-2);
    return v+s;
  }
  public static void main(String[]args){
    int n=4;
    System.out.println(Callguests(n));
  }
}

