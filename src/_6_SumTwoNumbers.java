import java.util.Scanner;

public class _6_SumTwoNumbers {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first integer n->");
		int n = input.nextInt();
		System.out.print("Enter your second integer m->");
		int m = input.nextInt();
		System.out.printf("n+m=%d",(n+m));
	}
}
