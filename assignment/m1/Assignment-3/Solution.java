/**Solution.java.
 * @author Sai Kiran.
*/
import java.util.Scanner;
    /**
     * importing scanner.
     */
public final class Solution {
    /*
     *Do not modify this main function.
     */
    /**
     *we are not using this constructor.
     */
    private Solution() {
      // i'm not using this constructor
    }
    /**
     * @main function to print Name and Roll Number.
     * @param args is a parameter for this function
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int height = scan.nextInt();
        areaOfTriangle(base, height);
        //System.out.println(0.5 * base * height);
    }
    /**
     *This is a method.
     *@param base variable base
     *@param height variable height
     */
    static void areaOfTriangle(final int base, final int height) {
        final float a = 0.5f;
        double area = a * base * height;
        System.out.println(area);
    }
}

