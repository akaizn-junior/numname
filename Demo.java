import java.util.Scanner;

public class Demo {

	public static void main(String args[])
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("**** Numname ******");
		System.out.print("Insert a number: ");
		Integer num = input.nextInt();

		System.out.print("The number is: " + Numname.read(num) + "\n");
	}
}
