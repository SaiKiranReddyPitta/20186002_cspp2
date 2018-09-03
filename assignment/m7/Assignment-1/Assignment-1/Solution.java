/**
 *@author Sai Kiran Reddy Pitta.
 */
import java.util.Scanner;
class InputValidator {
    /*
     * Write the atrributes and methods for InputValidator.
     */
    private String name;
    /**
     * Constructs the object.
     *
     * @param      name  The name.
     */
    InputValidator(final String name) {
        /**
         * { item_description }
         */
        this.name = name;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    final int SIX = 6;
    boolean validateData() {
        return (name.length() >= SIX);
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * { function_description }
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
