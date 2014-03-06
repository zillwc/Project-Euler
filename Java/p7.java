public class p7 {
	public static void main(String[] args) {
		int index=1, counter=1;
		while (counter!=10001) {
			index+=2;
			if (isPrime(index))
				counter++;
		}
		System.out.println(index);
	}

	public static boolean isPrime(int num) {
		for (int i=2;i<num/2;i++)
			if (num%i==0)
				return false;
		return true;
	}
}