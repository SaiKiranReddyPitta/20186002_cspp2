import java.util.Scanner;
/**
 *@author Sai Kiran Reddy.
 */
public final class factorial {
    /*
    Do not modify this Main function.
    */
    /**
     * this is an Empty Constructor.
     */
    private factorial() {
        //Iam not using this constructor.
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int fact = factorial(number);
        System.out.println(fact);
    }
    /**
     * { function_description }.
     *
     * @param n parameter_description.
     *
     * @return int factorial.
     */
    public static int factorial(final int n) {

        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


