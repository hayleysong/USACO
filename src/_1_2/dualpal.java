/*
ID: hayleys1
LANG: JAVA
TASK: dualpal
*/
package _1_2;

import java.util.*;
import java.io.*;

public class dualpal {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static String[] list;
	static int N;
	static int S;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("dualpal.in"));
			out = new PrintWriter(new File("dualpal.out"));

			init();

			// Write out file
			out.print(solve());

			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void init() {
		// Get data from input file
		// Initialize Input Variables
		N = in.nextInt();
		S = in.nextInt();

	}

	private static String solve() {
		// Process and Output
		String result = "";
		int count = 0;
		int i = S + 1;
		boolean flag = true;
		while (flag) {
			String number = "" + i;
			
			int c = 0;
			for (int j = 2; j <= 10; j++) {

				if (isPanlindrome(baseConversion(number, 10, j))) {
					c++;
				}
				if (c > 1) {
					result += number + "\n";
					count++;
					break;
				}

				if (count == N) {
					return result;
				}

			}
			i++;
			
		}

		return result;

	}

	public static String baseConversion(String number, int sBase, int dBase) {

		return Integer.toString(Integer.parseInt(number, sBase), dBase);
	}

	private static boolean isPanlindrome(String s) {

		int idx = s.length() - 1;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(idx))
				return false;
			idx--;

		}
		return true;

	}
}
