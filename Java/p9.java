public class p9 {
	public static void main(String[] args) {
		int product = 0;
		
		for (int a=1;a<1000;a++)
			for (int b=a+1;b<1000;b++)
				if ((a*a + b*b) == ((1000-a-b)*(1000-a-b)))
					product=a*b*(1000-a-b);

		System.out.println(product);
	}
}