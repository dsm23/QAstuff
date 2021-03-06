package FileNonsense;

import java.util.*;

public class WorkingwithFiles {

	public static void main(String[ ] args) {
		Person David = new Person();
		Person James = new Person();
		Person Emily = new Person();
		Person John = new Person();
		Person Grace = new Person();
		
		David.process("David","programmer",24);
		James.process("James","accountant",25);
		Emily.process("Emily","engineer",24);
		John.process("John","dancer",22);
		Grace.process("Grace","scientist",23);
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		arr.add(David);
		arr.add(James);
		arr.add(Emily);
		arr.add(John);
		arr.add(Grace);
		
		try {
			
			Formatter f = new Formatter("test.txt");
			for (Person i : arr){
				f.format("%s %s %s \r\n", i.name,i.occupation, i.age);
				System.out.println(i.name + ", "+i.occupation+ ", "+ i.age);
			}			
    		f.close();    
		} catch (Exception e) {
		   System.out.println("Error");
		}
	}
}