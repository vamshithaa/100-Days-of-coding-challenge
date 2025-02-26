import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, rem, sum, limit;
        System.out.println("ARMSTRONG NUMBER");
        System.out.print("Enter the limit upto which you want to print the armstrong number: ");
        limit = scanner.nextInt();
        System.out.println("Armstrong numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            num = i;
            sum = 0;
            int temp = num, digits = 0;
            while (temp > 0) { 
                temp /= 10;
                digits++;
            }
            temp = num;
            while (temp > 0) {
                rem = temp % 10;
                sum += Math.pow(rem, digits); 
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        scanner.close();
    }
}
