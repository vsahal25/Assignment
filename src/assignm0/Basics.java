package assignm0;

public class Basics {


	// Read System.out.println()
	public void printHelloWorld() {
		System.out.println("Hello World");

	}

	public int getSum(int first, int second) {
		int a = first + second;
		System.out.println(+a);
		return a;
	}

	// Read if-else construct
	public int getLargerNumber(int first, int second) {
		int result = 0;
		if (first > second) {
			result = first;
		} else if (second > first) {
			result = second;
		} else {
			System.out.println("They are equal");
		}
		System.out.println(+result);
		return result;

	}

	// Read nested if-else construct
	public int largestNumber(int first, int second, int third) {
		int result = third;
		if (first >= second && first >= third) {
			result = first;
		} else if (second >= third) {
			result = second;
		} else {
			result = third;
		}
		System.out.println(+result);
		return result;
	}

	// Go through arrays in java and simple for loop and enhanced for loop
	public void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public int getSumOfArrayElements(int array[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + array[i];
		}
		System.out.println(+sum);
		return sum;
	}

	public boolean isPrime(int number) {
		int count = 0;
		boolean isPrime = false;
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0)
					count++;
			}
			if (count == 2) {
				isPrime = true;
				return isPrime;
			}
		}
		return isPrime;
	}

	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
		int arr[] = {};
		int index = 0;
		if (first < second) {
			arr = new int[second - first + 1];
			// for( int i=0;i<arr.length;i++) { //**
			for (int i = first; i <= second; i++) { // **
				arr[index++] = i;
				// for(int num:arr) {
				// arr[i] = first+i;i++;
			}
			System.out.println(arr);
		}

		return arr;
	}

	public int getFactorial(int n) {
		int f = 1;
		while (n != 0) {
			f = f * n;
			n--;
		}
		System.out.println(+f);
		return f;
	}

	public int getFactorialWithoutLoop(int n) {
		int f = 1;
		if (n < 0) {
			f = 0;
		} else if (n > 1) {
			f = n * getFactorialWithoutLoop(n - 1);
		}
		System.out.println(+f);
		return f;
	}

	// 1234 should give 4321
	public long reverseDigits(long n) {
		long rev = 0;
		while (n != 0) {
			long rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		System.out.println(+rev);

		return rev;

	}

	// In between 1 to 10, the prime numbers are 1, 2, 3, 5, 7
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		int arr[] = null;
		if (lowerLimit < upperLimit) {
			arr = new int[(upperLimit - lowerLimit) / 2];
			int index = 0;
			for (int i = lowerLimit; i <= upperLimit; i++) {
				if (isPrime(index)) {
					arr[index] = i;
					index++;
				}
			}
			int res[] = new int[index];
			for (int i = 0; i < index; i++) {
				res[i] = arr[i];
			}
			arr = res;
		}
		System.out.println(arr);
		return arr;

	}

	public int findNumberOfOccurences(int[] array, int n) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				count++;
			}
		}
		System.out.println(+count);
		return count;
	}

	public int findFirstOccurence(int[] array, int number) {
		int result = -1;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void printRhombus(int n) {
		String c = "*";
		;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void printRhombus1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		// printRhombus1(5);
		// printRhombus(5);
		// printTrianglePointingRight(5);
		// actualRhombus(10);
		rhombusThreeLoop1(55);
	}

	static String units[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };
	static String tens[] = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };

	public String getNumberLessThanTenInWords(int number) {
		String words = "";
		if (number < 0) {
			words = "Minus " + getNumberInWords(-number);
		} else if (number < 20) {
			words = units[number];
		} else if (number < 100) {
			words = tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
		}
		return words;
	}

	public String getNumberInWords(int num) {
		String words = "";
		if (num < 0) {
			words = "Minus " + getNumberInWords(-num);
		} else if (num < 20) {
			words = units[num];
		} else if (num < 100) {
			words = tens[num / 10] + ((num % 10 != 0) ? " " : "") + units[num % 10];
		} else if (num < 1000) {
			words = units[num / 100] + " Hundred" + ((num % 100 != 0) ? " and " + getNumberInWords(num % 100) : "");
		} else if (num < 100000) {
			words = getNumberInWords(num / 1000) + " Thousand"
					+ ((num % 1000 != 0) ? " " + getNumberInWords(num % 1000) : "");
		} else if (num < 10000000) {
			words = getNumberInWords(num / 100000) + " Lakh"
					+ ((num % 100000 != 0) ? " " + getNumberInWords(num % 100000) : "");
		} else if (num < 1000000000) {
			words = getNumberInWords(num / 10000000) + " Crore"
					+ ((num % 10000000 != 0) ? " " + getNumberInWords(num % 10000000) : "");
		}
		return words;
	}

	public static void printTrianglePointingRight(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void actualRhombus(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = size - 1; i > 0; i--) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void rhombusThreeLoop(int size) {
		String s = "";
		for (int i = size - 1; i >= -size + 1; i--) {
			for (int j = 1; j <= i || j <= -i; j++) {
				System.out.print(" ");
			}
			for (int j = (size * 2) - 1; j > i * 2 && j > -i * 2; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print(s);
	}

	public static int abc(int size) {
		return 0;
	}

	public static void rhombusThreeLoop1(int size) {
		for (int i = size - 1; i >= -size + 1; i--) {
			for (int j = 1; j <= i || j <= -i; j++) {
				System.out.print(" ");
			}
			for (int j = (size * 2) - 1; j > i * 2 && j > -i * 2; j--) {
				System.out.print(i);

			}

			System.out.println();
		}
	}

}