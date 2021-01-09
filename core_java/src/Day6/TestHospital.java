package Day6;
import java.util.*;
public class TestHospital{
	
	public static void main(String[] args) {
		
		HospitalBean hospitalbean=new HospitalBean(01,"saa",999);
		HospitalBean hospitalbean2=new HospitalBean(02,"raa",888);
		HospitalBean hospitalbean3=new HospitalBean(03,"taa",777);
		HospitalBean hospitalbean4=new HospitalBean(04,"naa",222);
		
		ArrayList<HospitalBean> arraylist=new ArrayList<HospitalBean>();
		
		arraylist.add(hospitalbean);
		arraylist.add(hospitalbean2);
		arraylist.add(hospitalbean3);
		arraylist.add(hospitalbean4);
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		/*
 for(HospitalBean x:arraylist)
	 {
		 System.out.println(x);
	 }
		
 Iterator<HospitalBean> itr=arraylist.iterator();
		while(itr.hasNext())
		{
			HospitalBean res=itr.next();	
			System.out.println(res);
			}
			*/
				
		
	}

}
