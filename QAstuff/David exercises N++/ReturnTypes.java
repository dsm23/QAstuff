class Operation{
	String a;
	public String process(){		
		a = "Hello World!";
		return a;
	}
}

class ReturnTypes{
	public static void main(String x[]){
		Operation F = new Operation();
		System.out.println(F.process());
	}
}