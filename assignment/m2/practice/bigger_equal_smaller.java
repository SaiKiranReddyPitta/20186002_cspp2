import java.util.*;
public class bigger_equal_small{
	public static void check(int a,int b) {
		if(a>b){
			System.out.println("Bigger");
		}
		else if(a<b){
			System.out.println("Smaller");
		}
		else{
			System.out.println("Equal");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b= s.nextInt();
		check(a,b);
	}
}