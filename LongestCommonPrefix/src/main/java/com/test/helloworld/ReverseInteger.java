package com.test.helloworld;

public class ReverseInteger {

	public static void main(String[] args) {

		reverse(321);
	}
	
	public static void reverse(int x) {

		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
			}

			rev = rev * 10 + pop;
		}
		System.out.println(rev);

	}

	public static boolean isPalindrome(int x) {
		boolean flag = false;
		if (x > 0) {
			String str = String.valueOf(x);
			int end = str.length() - 1;
			int start = 0;
			while (start < end) {
				if (str.charAt(start++) != str.charAt(end--)) {
					flag = false;
					break;
				}
				flag = true;
			}
		}
		return flag;
	}

	public String toLowerCase(String str) {

		char[] mixedCases = str.toCharArray();
		for (int i = 0; i < mixedCases.length; i++) {
			if (mixedCases[i] <= 90 && mixedCases[i] >= 65) {
				mixedCases[i] = (char) ((int) mixedCases[i] + 32);
			}
		}

		return String.valueOf(mixedCases);
	}

}
