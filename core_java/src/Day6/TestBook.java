package Day6;
import java.util.*;

public class TestBook {
	public static void main(String[] args) {
		BookBean book1=new BookBean(101,"DaVinci Code","XYZ","Rs.850");
		BookBean book2=new BookBean(102,"Zee","PQR","Rs.630");
		BookBean book3=new BookBean(103,"Lee","YHU","Rs.740");
		BookBean book4=new BookBean(104,"Yee","KLP","Rs.963");
		BookBean book5=new BookBean(105,"Kee","POT","Rs.2000");
		BookBean book6=new BookBean(106,"Jee","YOI","Rs.500");
		
		ArrayList<BookBean> bookList = new ArrayList<BookBean>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		for(BookBean x:bookList)
		{
			System.out.println(x);
		}
	}
}

	
		


