package stuff;

public class Operation {
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
