class Operation {
	public boolean process(int temperature, boolean isSummer){
		if (isSummer == true){
			if (temperature >= 60 && temperature <= 100){
				return true;
			}
			else{
				return false;
			}
		}
		else {
			if (temperature >= 60 && temperature <= 90){
				return true;
			}
			else {
				return false;
			}
		}
	}
}
class SummerTemp{
	public static void main(String x[]) {
		Operation O = new Operation();
		System.out.println(O.process(69,true));
		System.out.println(O.process(90,false));
		System.out.println(O.process(99,false));
	}
}