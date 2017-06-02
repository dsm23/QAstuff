package project;

public class Users {
	String name;
	int pin;
	public void process(String n, int p){
		name = n;
		pin = p;
	}
	public boolean CheckPin(int i) {
		
		
		if (i == pin)
		{
			return true;
		}
		else
		return false;

	}
}
