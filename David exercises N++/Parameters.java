class Operation{	
	public void process(String a){		
		System.out.println(a);
	}
}

class Parameters{
	public static void main(String x[]){
		Operation F = new Operation();
		F.process("Hello World!");
	}
}