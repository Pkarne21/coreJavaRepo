package Day7.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		try {
		FileWriter fileWriter = new FileWriter("H://courses.txt");
		fileWriter.write("Core Java");
		fileWriter.close();
		System.out.println("Successfully wrote to the file.");
		}catch(IOException e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	

}
