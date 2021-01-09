package Day7.file_handling;

import java.io.File;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {

		 try {
		File file = new File("H:\\courses.txt");
		boolean result = file.createNewFile();
		if(result) {
		System.out.println("File successfully got created:"+file.getName());
		}else {
		System.out.println("File Already Exists");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	
}