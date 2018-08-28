import java.util.Scanner;
/**Solution.java.
 * @author Sai Kiran Reddy Pitta.
 */
public final class Area_of_Circle {
    /**
    * Pi value was initialized.
    */
    private static final double PI = 3.14;
   /**
    * empty constructor.
    */

    private Area_of_Circle() {
        // not using this constructor
    }

    /**
    * main method as a driver method.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        System.out.println(area(radius));

    }
   /**
    *calculate area of circle.
    *@param radius  is the parameter for this method
    *@return  double for area
    */
   public static double area(final int radius) {
        return (pi() * radius * radius);
   }
   /**
   * pi method to return pi value.
   *@return double value
   */
   public static double pi() {
        return PI;
   }
}
