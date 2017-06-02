package Blackjack;

public class Blackjack {

	public static void main(String[] args) {
		Operation O = new Operation();
		System.out.println(O.calc(18,20));
		System.out.println(O.calc(21,18));
		System.out.println(O.calc(22,20));
		System.out.println(O.calc(22,22));
	}
}
