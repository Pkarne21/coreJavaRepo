package Day3.scannerExample;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		System.out.println("Username:" +username);
		System.out.println("Enter Age:");
		int age =sc.nextInt();
		System.out.println("Age"+ age);
		
	}

}
