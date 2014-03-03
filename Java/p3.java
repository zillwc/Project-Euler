public class p3 {
	public static void main(String[] args) {
		long num = 600851475143L, factor=2;
		while (true) {
			factor = getSmallestFactor(num);
			if (factor<num) num/=factor;
			else break;
		}
		System.out.println(num);
	}

	public static long getSmallestFactor(long n) {
		long limit=java.lang.Math.round(java.lang.Math.sqrt(n));
		for (long i=2;i<=limit;i++)
			if (n%i==0) return i;
		return n;
	}
}