public class p5 {
	public static void main(String[] args) {
		int counter=20*2;
		while (true) {
			if (isEvenlyDivisible(counter)) {
				System.out.println(counter);
				break;
			}
			counter++;
		}
	}
	public static boolean isEvenlyDivisible(int num) {
		for (int i=1;i<=20;i++)
			if (num%i != 0)
				return false;
		return true;
	}
}