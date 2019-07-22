/*
ID: hayleys1
LANG: JAVA
TASK: milk2
 */
package _1_3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class milk2 {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static int N;
	static milking[] list;

	// class method
	static class milking implements Comparable<milking> {

		int in;
		int out;

		public milking(int in, int out) {
			this.in = in;
			this.out = out;
		}

		@Override
		public int compareTo(milking that) {

			return this.in - that.in;
		}

	}

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("milk2.in"));
			out = new PrintWriter(new File("milk2.out"));

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
		list = new milking[N];

		for (int i = 0; i < N; i++) {
			String[] temp = in.nextLine().split(" ");

			list[i] = new milking(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));

		}
		 Arrays.sort(list);

	}

	private static String solve() {
		// Process and Output

		int maxCont = 0;
		int maxBreak = 0;

		int start = list[0].in;
		int end = list[0].out;

		for (int i = 0; i < N; i++) {

			int currIn = list[i].in;
			int currOut = list[i].out;

			if (currOut <= end) {
				continue;
			} else if (currIn <= end) {
				end = currOut;
			} else {
				int Break = currIn - end;

				if (Break > maxBreak) {
					maxBreak = Break;
				}
				int Cont = end - start;

				if (Cont > maxCont)
					maxCont = Cont;

				start = currIn;
				end = currOut;
			}


		}
		int Cont = end - start;
		if (Cont > maxCont)
			maxCont = Cont;
		String result = maxCont + " " + maxBreak + "\n";
		System.out.println(result);
		return result;
	}

}
