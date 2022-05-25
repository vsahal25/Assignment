package assignm1;

public class MyStringUtil {

	public int size(String str) {
		return str.length();
	}

	public String toUpperCase(String str) {
		return str.toUpperCase();
	}

	public static StringBuilder printOneByOne(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			if (i != str.length() - 1) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
		return sb;
	}

	public String reverse(String str) {
		String s = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			s = ch + s;
		}
		return s;
	}

	public Boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String revserveString = reverse(str);
		if (str.equals(revserveString)) {
			return true;
		} else {
			return false;
		}
	}

	public char getMaxChar(String str) {
		int greatestVal = 0;
		for (int i = greatestVal; i < str.length(); i++) {
			int curVal = (int) str.charAt(i);
			if (curVal > greatestVal)
				greatestVal = curVal;
		}
		char c = (char) greatestVal;
		return c;
	}

	public String wordReverse(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

	public String sub(String str, int startIndex, int endIndex) {

		String temp = str.substring(startIndex, endIndex);

		return temp;
	}

	public int[] countEachWordLength(String str) {
		str = str.trim();
		String arr[] = str.split(" ");
		int num[] = new int[arr.length];
		String word;
		for (int i = 0; i < arr.length; i++) {
			word = arr[i];

			System.out.println(word.length());

			num[i] = word.length();
		}
		return num;
	}

	public String prefix(String str, String prefix) {
		str = prefix + " " + str;
		return str;
	}

	public String suffix(String str, String suffix) {
		str = str + " " + suffix;
		return str;
	}

	public String reverseCase(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				chars[i] = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				chars[i] = Character.toUpperCase(c);
			}
		}
		return new String(chars);

	}

	public String findLargestPalindrome(String str) {
		String maxPalindrome = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <= str.length(); j++) {
				String ab = str.substring(i, j);
				if (isPalindrome(ab)) {

					if (ab.length() >= maxPalindrome.length()) {
						maxPalindrome = ab;
					}

				}
			}
		}
		System.out.println(maxPalindrome);
		return maxPalindrome;
	}

	public String subS(String str) {
		String ab;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <= str.length(); j++) {
				ab = str.substring(i, j);
				System.out.println(ab);
			}
		}
		return str;
	}
}
