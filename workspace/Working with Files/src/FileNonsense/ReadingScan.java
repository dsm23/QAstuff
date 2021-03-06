package FileNonsense;

import java.io.*;
import java.util.*;

public class ReadingScan {

	public static void main(String[] args) {
		ArrayList<Person> readarr = new ArrayList<Person>();
		String[][] temp = new String[5][3];
		
		Person David = new Person();
		Person James = new Person();
		Person Emily = new Person();
		Person John = new Person();
		Person Grace = new Person();
		
		readarr.add(David);
		readarr.add(James);
		readarr.add(Emily);
		readarr.add(John);
		readarr.add(Grace);
		
		try {
			int y=0;
			File x = new File("test.txt");
			Scanner sc = new Scanner(x);

			while(sc.hasNext()) {
			    String line = sc.nextLine();			    
			    temp[y] = line.split(" ");
			    y++;
			}
			  
			y=0;
			for (Person i  : readarr){
				int agetemp = Integer.parseInt(temp[y][2]);
				i.process(temp[y][0], temp[y][1], agetemp);
				y++;
			}
			sc.close();
			for (Person j : readarr){
				  System.out.println(j.name + ", "+j.occupation+ ", "+ j.age);
				}
		  	} 
		  
		 catch (FileNotFoundException e) {
			 System.out.println("Error");
		}
	}
}