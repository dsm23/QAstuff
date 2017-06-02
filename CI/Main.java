class Main{
	public static void main(String[] args){
		int[] arr = new int[10];
		for (int i = 1; i < arr.length+1; i++){
			arr[i-1] = i*10;
			System.out.println(arr[i-1]);
		}
	}
}