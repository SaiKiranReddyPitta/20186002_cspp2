import java.util.Scanner;
/**Solution.java.
 *do not modify this main function.
 * @author Sai Kiran Reddy Pitta.
 */
public final class Solution {
    /**
    Do not modify this main function.
    */
    private Solution() {
    /**
     *we are not using this constructor.
     */
    }
    /**
     *@param args variable
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        System.out.println((long)power(base, exponent));
    }
    /**
     *Need to write the power func and prints output.
     *@param base variable base
     *@param exponent variable exponent
     */
    static double power(final int base, 
                        final int exponent) {
        return Math.pow(base, exponent);
    }
}
