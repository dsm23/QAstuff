package Blackjack;

public class Operation {
	public int calc(int a, int b){
		int c = 21 - a;
		int d = 21 - b;
		if (c < 0 && d >= 0){
			return b;
		}
		else if (c >= 0 && d < 0){
			return a;
		}
		else if (c < 0 && d < 0){
			return 0;
		}
		else if (c > d){
			return b;
		}
		else if (c < d){
			return a;
		}
	return 2;
	}
}