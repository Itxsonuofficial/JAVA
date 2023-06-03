package condional_statement;

import java.util.*;

public class If {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// this is else if condition
		if (a == b) {
			System.out.println("Equal");
		} else if (a > b) {
			System.out.println("Greater");
		} else {
			System.out.println("Lesser");
		}
		// this is if else condition
		int oddoreven = sc.nextInt();
		if (oddoreven % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}

	}
}
