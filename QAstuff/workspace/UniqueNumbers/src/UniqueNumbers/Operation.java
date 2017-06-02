package UniqueNumbers;

public class Operation {
	public int process(int a, int b, int c){
		if (a == b && b == c){
			return 0;
		}
		else if (a == b && a != c){
			return c;
		}
		else if (a != b && a == c){
			return b;
		}
		else if (a != c && b == c){
			return a;
		}
		else{
			return a+b+c;
		}
	}
}
