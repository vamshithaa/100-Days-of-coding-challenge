import java.util.*;

public class Printnames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[n];
        
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        System.out.println("The names present in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
