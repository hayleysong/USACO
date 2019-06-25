/*
ID: hayleys1
LANG: JAVA
TASK: beads
 */
package _1_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class beads {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static int N;
	static String necklace;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("beads.in"));
			out = new PrintWriter(new File("beads.out"));

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

		N = Integer.parseInt(in.nextLine());
		necklace = in.nextLine();
	}

	private static String solve() {
		// Process and Output
		String result = "";
		necklace += necklace;
		int max = 0;

		for (int i = 0; i < N; i++) {
			int c = 1;
			char start = necklace.charAt(i);

			if (start == 'w') {
				c = Math.max(recur(i, 'r'), recur(i, 'b'));
			} else
				c = recur(i, start);

			if (max < c)
				max = c;

		}

		result = "" + max + "\n";
		return result;
	}

	// Algorithms methods
	private static int recur(int i, char c) {
		boolean flag = false;
		int idx = i + 1;
		int count = 2;
		System.out.print(idx + " : ");

		while (count < N) {

			char curr = necklace.charAt(idx);
			System.out.print(curr);

			if (!flag) {
				if (curr == c || curr == 'w')
					count++;
				else
					flag = true;
			} else {
				if (curr != c || curr == 'w')
					count++;
				else
					break;
			}
			idx++;

		}
		System.out.print("[" + count + "]\n");
		return count;
	}

}
