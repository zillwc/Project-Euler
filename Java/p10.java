public class p102 {
	public static void main(String[] args) {
		int LIMIT=2000000;
		long sum=0;
		boolean array[] = new boolean[LIMIT+1];

		for (int i=2;i<=LIMIT;i++)
			array[i]=true;

		for (int i=2;i*i<=LIMIT;i++) 
			if (array[(int)i])
				for (int j=i;i*j<=LIMIT;j++)
					array[i*j]=false;

		for (int i=2;i<=LIMIT;i++)
			if (array[i])
				sum+=i;

		System.out.println(sum);
	}
}