package assignm4recur;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Recursion {


	public static void printNum1to5(int i) {
		if(i==6) {
			return;
		}
		System.out.println(i);
		printNum1to5(i+1);
	}

	public static void printNum5to1(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNum5to1(n-1);
	}

	public static void printSumOfNaturatNum(int i,int n,int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printSumOfNaturatNum(i+1,n,sum);
		System.out.println(i);

	}

	public static int fact(int n) {
		if(n==1|| n==0) {
			return 1;
		}
		int fact_nm1=fact(n-1);
		int fact_n=n*fact_nm1;
		return fact_n;

	}

	public static void fibonacci(int a,int b,int n) {
		if(n==0) {
			return;
		}
		int c= a+b;
		System.out.println(c);
		fibonacci(b,c,n-1);
	}

	public static void main (String args[]) {
		int a=0, b=1,n=7,i=1;
		System.out.println(a);
		System.out.println(b);
		fibonacci(a,b,n-2);
		printNum1to5(i);
		System.out.println();
		printNum5to1(n);
		printSumOfNaturatNum(1,5,0);
		int ans=fact(n);
		System.out.println(ans);
	}

}
