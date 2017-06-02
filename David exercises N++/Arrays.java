class Operation{
	int[] arr = new int[10];
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
	public void forLoop(){
		for (int i = 0; i < 10;i++){
			arr[i] = (int)(Math.random() * 9 + 1);
			System.out.println(process(arr[i],2,false));
		}		
	}
}

class Arrays{
	public static void main(String x[]){
		Operation F = new Operation();
		F.forLoop();
	}
}