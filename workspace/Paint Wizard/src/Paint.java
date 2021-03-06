import java.io.*;
import java.util.*;

public class Paint {

	public static void main(String[] args) {
		
		Cheapo C = new Cheapo();
		Average A = new Average();
		Dulux D = new Dulux();
		
		C.Order(19.99f,20,10,"CheapoMax");
		A.Order(17.99f,15,11,"AverageJoes");
		D.Order(25,10,20,"DuluxourousPaints");
		
		ArrayList<Holding> arr = new ArrayList<Holding>();
		
		arr.add(C);
		arr.add(A);
		arr.add(D);
		
		System.out.print("What is the area of the room (m^2): ");
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    
		for (Holding i : arr) {
			i.count = (int)Math.ceil((double)input/i.area);
			System.out.println(i.count);
			if (i.count > i.litres){
				float temp = i.price*((i.count/i.litres)+1);
				int waste = ((i.count/i.litres)+1) * i.litres - i.count; 
				System.out.println(i.name + " cost: �" + String.format( "%.2f", temp));
				System.out.println("Remaining: " + waste + " litres");
			}
			else{				
				System.out.println(i.name + " cost: �" + String.format( "%.2f", i.price));
				int onewaste = i.litres - i.count;
				System.out.println("Remaining: " + onewaste + " litres");
			}
			System.out.println();
		}
	}
}