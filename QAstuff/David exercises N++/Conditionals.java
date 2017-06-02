class Operation{
	public int process(int a,int b, boolean c){
		if (c == true){
			return a+b;
		} else {
			return a*b;
		}
	}
}

class Conditionals{
	public static void main(String x[]){
		Operation F = new Operation();
		System.out.println(F.process(3,4,false));
	}
}