class Operation{
	public int calc(int a,int b, boolean c){
		if (c == true){
			return a+b;
		} 
		else {
			return a*b;
		}
	}
	public int process(int a,int b, boolean c){
		if (a == 0 || b == 0){
			if (a == 0 && b != 0){
				return b;
			}
			else if (a != 0 && b == 0){
				return a;
			}
			else if (a == 0 && b == 0){
				return calc(a,b,c);
			}
		}
		else {
			return calc(a,b,c);
		}
		return calc(a,b,c);
	}
}

class ConditionalsTwo{
	public static void main(String x[]){
		Operation F = new Operation();
		System.out.println(F.process(0,0,false));
	}
}