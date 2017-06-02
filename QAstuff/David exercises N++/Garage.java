class Vehicle{
	int store;
	int fixrate;
}
class Bus extends Vehicle{
	int store = 9;
	int fixrate = 3;
}
class Motorcycle extends Vehicle{
	int store = 3;
	int fixrate = 1;
}
class Car extends Vehicle{
	int store = 6;
	int fixrate = 2;
}

class Garage{
	public static void main(String x[]){
		Vehicle[] arr = new Vehicle[3];
		Bus B = new Vehicle();
		Motorcycle M = new Vehicle();
		Car C = new Vehicle();
		ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
		
	}
	public void add(){}
	public void remove(){}
	public void fix(){}
	public void empty(){}
}