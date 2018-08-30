/**Solution.java.
 * @author Sai Kiran.
*/
/**.
 * Class for solution.
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 * Do not modify this main function.
 */
public final class Solution {
/**
 * . { function_description }
 *
 */
    private Solution() {
        //Constructor.
    }
/**.
 * Fill the main function to print the number of 7's between 1 to n.
 * @param args  The arguments.
 */
    public static void main(final String[] args) {
    	int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int [] a = new int [n];
        for (int i=0; i<= n-1; i++) {
        	a[i] = s.nextInt();
        }

        for (int i=0; i< n-1; i++) {
        	System.out.println(a[i]+ ", ");
        }
        System.out.println(a[n-1]);

        System.out.println("---------------");

        /*System.out.println(Arrays.toString(a));*/
        System.out.print("[");
        for (int i=0; i<a.length - 1; i++) {
        	System.out.print(a[i]+ ", ");
        }
        System.out.println(a[a.length-1]+"]");
    }
}    