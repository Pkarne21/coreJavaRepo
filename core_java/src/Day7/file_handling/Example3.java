package Day7.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example3 {

	 public static void main(String[] args) {
	File file = new File("courses.txt");
	try {
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
	String x = sc.nextLine();
	System.out.println(x);
	}
	sc.close();
	} catch (FileNotFoundException e) {
	System.out.println("Exception Occured:"+e);
}
	 }
}
	


