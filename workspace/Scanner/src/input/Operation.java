package input;

public class Operation {
	public void forLoop(int[] arr){
		for (int i = 0; i < 10;i++){
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.println(arr[i]);
		}
		System.out.println();
		for (int j = 0; j < 10; j++){
			System.out.println(arr[j]*10);
		}
	}
}
