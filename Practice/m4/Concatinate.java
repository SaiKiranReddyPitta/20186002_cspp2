/**
 *@author Sai Kiran Reddy Pitta.
 **/
import java.util.Scanner;
/**
 *used to take inputs.
 **/
public final class Concatinate {
    /**
     *This is an empty constructor.
     **/
    private Concatinate() {
    //I am not using this function
    }
    /**
     *This is main function.
     *@param args is parameter for this function.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        /* Declaring array of n elements, the value
         * of n is provided by the user
         */
        System.out.println("Hello " + name + "!");
    }
}


