package rough;

public class pattern {

	public static void main(String[] args) {
		int n=5;
		String str=" ";

		for (int i=n*2;i>=0;i--) {
			if (n*2==i) {
				System.out.print("");
			}else 
				System.out.print("*");
			System.out.println();

			for(int j=i;j>0;j--) {
				System.out.print(str);
			}
		}


		for (int i=0;i<=n;i++) {
			System.out.print("*");
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
		}

		for (int i=0;i<=n;i++) {
			System.out.print("*");
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
		}
		for (int i=n;i>=0;i--) {
			System.out.print("*");
			System.out.println();
			for(int j=i;j>0;j--) {
				System.out.print(str);
			}
		}
	}

}
