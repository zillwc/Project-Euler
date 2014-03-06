public class p4 {
	public static void main(String[] args) {
		int START=100, LIMIT=999, prod=0, largest=0;

		for (int i=START;i<LIMIT;i++) {
			for (int j=START;j<LIMIT;j++) {
				prod=i*j;
				if (isPalindromic(""+prod) && prod>largest)
						largest=prod;
			}
		}

		System.out.println(largest);
	}

	public static boolean isPalindromic(String str) {
		for (int i=0;i<str.length()/2;i++) {
			if (!((str.substring(i, i+1)).compareTo(str.substring(str.length()-i-1, str.length()-i)) == 0))
				return false;
		}
		return true;
	}
}