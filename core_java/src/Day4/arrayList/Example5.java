package Day4.arrayList;


import java.util.*;

public class Example5 {

 // ArrayList of salaries (int)
public static void main(String[] args) {
ArrayList<Integer> salariesList = new ArrayList<Integer>();


salariesList.add(25000);
salariesList.add(26000);
salariesList.add(20000);
salariesList.add(30000);
for(int x:salariesList) {
System.out.println(x);
}
}
}