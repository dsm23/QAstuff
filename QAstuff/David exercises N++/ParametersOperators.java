class Operation{
	public int process(int a,int b){
		return a+b;
	}
}

class ParametersOperators{
	public static void main(String x[]){
		Operation F = new Operation();
		System.out.println(F.process(3,4));
	}
}