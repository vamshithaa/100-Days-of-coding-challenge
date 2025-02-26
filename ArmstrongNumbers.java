public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, rem, limit = 1000, sum;

        System.out.println("Armstrong numbers from 1 to 1000:");

        for (int i = 1; i <= limit; i++) {
            num = i;
            sum = 0; // Reset sum for each number

            while (num > 0) {
                rem = num % 10;
                sum += (rem * rem * rem);
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
