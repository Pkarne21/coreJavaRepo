package Day3.classAttriutes;
import Day3.bean.*;
public class testVehicles {
	public static void main(String[] args) {
		Vehicles car=new Vehicles(1001,"Audi","Black");
		Vehicles Bike=new Vehicles(2001,"KTM","Red");
		Vehicles Auto=new Vehicles(3001,"Autom","Yellow");
		Vehicles RaceCar=new Vehicles(4001,"SportsCar","Blue");
		Vehicles[] arrayOfVehicles= {car,Bike,Auto,RaceCar};
		testVehicles testVehicle= new testVehicles();
		testVehicle.displayInfo(arrayOfVehicles);
		
		}
	public void displayInfo(Vehicles[] arrayOfVehicles)
	{
		for(Vehicles vehicle:arrayOfVehicles)
		{
			System.out.println(vehicle);
		}
		
		
	}

}
