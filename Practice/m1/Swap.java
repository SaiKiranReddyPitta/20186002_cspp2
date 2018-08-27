/** HelloWorld.java.
 * @author Sai Kiran.
 */
public final class Swap {
    /**
     * empty constructor.
     */
    private Swap() {
        // I'm not using this constructor

    }
        /**
         * @main function to print Hello World.
         * @param args is a parameter for this function
         */
    public static void main(final String[] args) {
        int a = 9;
        int b = 9999;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

}
