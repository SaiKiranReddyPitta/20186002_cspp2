/**Solution.java.
 * @author Sai Kiran.
*/
/**.
 * Class for solution.
 */
import java.util.Scanner;
/**.
 Do not modify this main function.
 */
public final class Solution {
/**.
 * Constructs the object.
 */
private static final int a = 7;
/**.
 * Empty Constructor.
 */
private static final int b = 10;
/**.
 * Empty Constructor.
 */
    private Solution() {
          //Constructor
    }
/**.
 * Fill the main function to print the number of 7's between 1 to n.
 * @param      args  The arguments.
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int i = 0;
        int j;
        for (i = 0; i <= n; i++) {
            j = i;
            while (j != 0) {
                if (j % b == a)
                    count ++ ;
                j /= b;
            }
        }
        System.out.println(count);
    }
}