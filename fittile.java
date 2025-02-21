public class fittile{
  public static int placetile(int n,int m){
    //base case
    if(n==m){
      return 2;
    }
    if(n<m){
      return 1;
    }
  int vertical=placetile(n-m,m);
  int horizontal=placetile(n-1,m);
  return vertical+horizontal;
  }
  public static void main(String[]args){
    int n=4,m=2;
    System.out.println(placetile(n,m));
  }
}
