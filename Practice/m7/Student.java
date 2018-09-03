/**.
 * @author Sai Kiran Reddy Pitta.
 */
import java.util.*;
/**.
 * Class for Student.
 */
public class Student {
	/**. { item_description }
	 */
	String name, rollno;
	float[] avg;
    float avg1;
	Student(String name, String rollno, float[] avg) {
		/**.
		 * { item_description }
		 */
		this.name = name;
		this.rollno = rollno;
		this.avg = avg;
	}
	/**.
	 * . { function_description }
	 */
	void display() {
	/**.
 	 * { item_description }
 	 */
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(avg1);
    }
    float avrg() {
    	/**.
    	 * { var_description }
    	 */
 		float sum = 0;
 		for (float  i : avg) {
 			sum = sum +i;
 		}
 		avg1 = sum/avg.length;
 		return avg1;	
    }

	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**.
		 * { var_description }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter rollno");
		String rollno = sc.nextLine();
		System.out.println("Total No of Subjects");
		int n = sc.nextInt();
		System.out.println("Enter Marks Obtained:");
		float a[]= new float[n];
		for(int i = 0;i<n;i++)
			/**.
			 * { item_description }
			 */
		{
			a[i]=sc.nextFloat();
		}
		Student s1 = new Student(name,rollno,a);
		s1.avrg();
		s1.display();
	}
}