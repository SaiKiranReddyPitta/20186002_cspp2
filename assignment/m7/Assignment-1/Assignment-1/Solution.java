/**
 *@author Sai Kiran Reddy Pitta.
*/
import java.util.Scanner;
class InputValidator
{
    /*
     * Write the atrributes and methods for InputValidator
     */
    private String name;
    InputValidator(String name) {
        this.name = name;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    boolean validateData() {
        if(name.length()>6) {
            return true;
        }return false;
    }
}
/**
 * Class for solution.
 */
public class Solution
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);     
        System.out.println(i.validateData());

    }

}
