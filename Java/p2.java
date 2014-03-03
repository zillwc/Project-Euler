public class p2 {
	public static void main(String[] args) {
		int sum=0, fib=0, prev=0, next=1, limit=4000000;
		while (true) {
			fib=prev+next;
			prev=next;
			next=fib;
			if (fib>limit) break;
			if (fib%2==0) sum+=fib;
		}
		System.out.println(sum);
	}
}