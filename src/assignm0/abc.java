package assignm0;
import java.util.Scanner;
public class abc {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number for Rhombus:  ");
		int size = in.nextInt();
		int i,j,k,d=1;
		for(i=1;i<=size;i++){
			for(j=0;j<size-i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++){
				if(d>=9 ){

					System.out.print(d);
					d++;
					k++;
				}else{

					System.out.print(d);
					d++;
				}

			}
			System.out.println();
		}


		for( i=size;i>=1;i--){
			for(j=size;j>i;j--){
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++){
				if(d>9){
					System.out.print(d);
					d--;
					k++;

				}else{
					d--;
					System.out.print(d);

				}
			}
			System.out.println();
		}
	}


}