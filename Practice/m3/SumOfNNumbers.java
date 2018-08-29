import java.util.Scanner;
/**
 * @author SaiKiranReddyPitta.
 */
public final class SumOfNNumbers {
    /**.
     * Didn't used this Constructor object.
     */
    private SumOfNNumbers() {
    }
    /**
    * Main function to print required output.
    * @param args is the parameter for this function.
    */

   public static void main(final String[] args) {
        int n, i = 1;
        int sum = 0;
        System.out.println("Enter the Number :");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " numbers is :" + sum);
}
}

