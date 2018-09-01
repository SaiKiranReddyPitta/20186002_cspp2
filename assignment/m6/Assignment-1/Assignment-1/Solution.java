import java.util.Scanner;
/**
 * program to find the odd composite numbers.
 * between 2 and n where n is given as an input.
 *
 * @author : Sai Kiran Reddy Pitta. 
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    public static boolean ifodd(final int i) {
        
            if(i % 2 == 0) {
                return false;
            }
        return true;
    }
    

    public static boolean ifprime(final int i) {
        for (int j = 2; j < i; j ++) {
            if (i % j == 0) {
                return true;
            }
        }
        return false; 
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
        for (int i = 1; i <= n; i++) {
            if(ifodd(i) && ifprime(i)) {
                System.out.println(i);
            }

        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

