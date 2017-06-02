package project;

import java.io.*;
import java.util.*;

public class Address {
	
	static float balance;
	public String readFromFile(String name){
		try {
			File x = new File("account"+name+".txt");
			Scanner sc = new Scanner(x);
			String input = sc.next();
			sc.close();
			balance = Float.parseFloat(input);
			return(input);			  		  
		}		
		catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		return "";
	}
	
	public void writeToFile(float output,String name){
		try {
		    Formatter f = new Formatter("account"+name+".txt");
		    f.format("%s", output);		    
		    f.close();    
		} catch (Exception e) {
		    System.out.println("WriteError");
		}
	}
	
	public void withdraw(float amount, String name)
	{	
		balance -= amount;
		writeToFile(balance,name);
		
	}	
}
