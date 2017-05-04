package input;

import java.io.*;
import java.util.*;

public class ScannerArr {

	public static void main(String[] args) {
		Operation F = new Operation();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();		
		System.out.println();
		int[] arr = new int[q];
		F.forLoop(arr);
	}

}
