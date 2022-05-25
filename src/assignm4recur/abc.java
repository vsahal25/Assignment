package assignm4recur;

public class abc {
	
	public static void main(String[] args) {
		print(1);
	}
	
	static void print(int n) {
		if (n==10) {
			System.out.println(10);
		}
		System.out.println(n);
		print(n+1);
	}

}
