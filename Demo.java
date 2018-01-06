package number;
import java.util.Scanner;

public class Driver {

	public static void main(String args[]){
		
		//for(int i=0; i <= 100; i++)
			//System.out.println(NumberName.read(i));
	
		Scanner input = new Scanner(System.in);
		System.out.println("**** Welcome to Number Name ******");
		System.out.print("Insert a number: ");
		Integer num = input.nextInt();

		System.out.print("The number reads to: "+NumberName.read(num)+"\n");

	}
	
}
