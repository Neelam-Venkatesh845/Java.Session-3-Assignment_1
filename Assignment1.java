import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:");
		int num = sc.nextInt();
		System.out.println("Math.sqrt(" + num + ")=" + Math.sqrt(num));
		System.out.println("Math.cbrt(" + num + ")=" + Math.cbrt(num));
		
	}

}
