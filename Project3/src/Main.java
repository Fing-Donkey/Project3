public class Main {
	public static void main(String[] args) {
		int[] array=new int[1000000];
		for(int i =0; i < 1000000; i++) {
			array[i] = i;
		}
		sieve(array);
		goldbach(array);
	}
	public static void sieve(int[] array) {
		for(int i = 1; i < 1000000; i++) {
			boolean isPrime = true;
			for(int j =2; i < array[i]; j++) {
				if(array[i] % j == 0) {
					isPrime = false;
					array[i] = 0;
					break;
				}
			}
			if(isPrime) {
				System.out.print(array[i] + " ");
			}
			System.out.println("Prime numbers are: ");
			for(int k = 0; i < 1000000; i++) {
				if(array[i] != 0) {
					System.out.println(array[i]);
				}
			}
		}
	}
	public static void goldbach(int[] array) {
		System.out.println("Even numbers are: ");
		for(int i =4; i < 1000000; i++) {
			if((array[i] % 2)==0) {
				System.out.println(array[i]);
			}
		}
	}
}