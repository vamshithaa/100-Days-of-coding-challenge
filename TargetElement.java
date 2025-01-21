import java.util.*;

public class TargetElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D array:");
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        
     
        System.out.println("Enter the elements:");
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
       
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        
      
        boolean found = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (array[i][j] == x) {
                    System.out.println("Target element found at index: " + i + "," + j);
                    found = true;
                }
            }
        }
        
       
        if (!found) {
            System.out.println("Target element not found.");
        }
    }
}
