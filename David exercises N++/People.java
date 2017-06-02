import java.io.*;
import java.util.*;

class Person{
	String name;
	int age;
	String job;
	public String process(){
		String c = name + " is " + age + " years old and their job title is: " + job;
		return c;
	}
}
class People{
	public static void main(String x[]){
		Person David = new Person();
		Person Charlotte = new Person();
		David.name = "David";
		David.age = 24;
		David.job = "QA Consultant";
		Charlotte.name = "Charlotte";
		Charlotte.age = 24;
		Charlotte.job = "RATP Bus Engineer";
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(David);
		arr.add(Charlotte);
		
		for (Person i : arr) {
			System.out.println(i.process());
		}
	}
}