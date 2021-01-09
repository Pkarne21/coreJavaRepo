package Day3.Pooja;

public class TestShape extends  Shape{
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		/*
		rect.drawStart();
		rect.drawStop();
		Circle c=new Circle();
		c.drawStart();
		c.drawStop();
		*/
		rect.Area();
		rect.rectArea(5,8);
		Square s=new Square();
		s.sqArea(5);
		
	}

}
