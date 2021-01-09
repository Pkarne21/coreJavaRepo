package Day4.interfaces.combined;

public class Architect implements Human, MathGenius, Artist {

	@Override
	public void draw() {
		System.out.println("Architect can draw very well");
		
	}

	@Override
	public void calculate() {
		System.out.println("Architect is very good in calculations");
		
	}

}
