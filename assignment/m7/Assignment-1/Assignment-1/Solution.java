/**.
 *@author Sai Kiran Reddy Pitta.
 */
import java.util.Scanner;
/**.
 * It is the class.
 */
class InputValidator {
    /**.
     * Attributes declaration.
     */
    private String data;
    /**.
     * Constructor object.
     *
     * @param      input  The input.
     */
    InputValidator(final String input) {
        /**.
         * It's counstructor.
         */
        this.data = input;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    Boolean validateData() {
        /**.
         * It's the conditional method.
         */
        final int six = 6;
        if (data.length() >= six) {
            return true;
        }
        return false;
    }
}
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructor object.
     */
    private  Solution() {
        /**.
         * It's counstructor.
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        /**.
         * It's the main class description.
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}


