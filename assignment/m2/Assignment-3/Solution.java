import java.util.Scanner;

public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result=(int)power(base,exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
