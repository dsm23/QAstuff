class Operation{
	String variable;
	public void process(){
		variable = "Hello World!";
		System.out.println(variable);
	}
}

class Assignment{
	public static void main(String x[]){
		Operation F = new Operation();
		F.process();
	}
}