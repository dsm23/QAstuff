package stuff;

import java.util.*;

public class Garage {	
	
	static ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
	
	public void addVehicle(){	
		//arr.add();
	}
	//public void remove(){}
	static public void fix(int value){
		System.out.println("Bill for repairs is �" + value);
	}	
	
	static public void empty(){
		arr.clear();
	}
		
	public static void main(String[] args) {
		Bus B = new Bus();
		Motorcycle M = new Motorcycle();
		Car C = new Car();
		B.Change(9,3,"Bus");
		C.Change(6,2,"Car");
		M.Change(3,1,"Motorcycle");
		arr.add(B);
		arr.add(C);
		arr.add(M);
		System.out.println(arr);
		fix(M.fixrate);
		for (Vehicle i : arr) {
			System.out.println("The Daily Bill for storing the "+ i.name +" is �"+i.store);
		}
	}
}
