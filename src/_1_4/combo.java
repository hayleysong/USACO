/*
ID: hayleys1
LANG: JAVA
TASK: combo
 */
package _1_4;

import java.util.*;
import java.io.*;

public class combo {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static int[] delta = {-2, -1, 0, 1, 2};
	static HashSet<String> combos;
	static int[] f;
	static int[] m;
	static int N;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("combo.in"));
			out = new PrintWriter(new File("combo.out"));

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
		f = new int[3];
		m = new int[3];
	}

	private static String solve() {
		// Process and Output
		String result = "";

		for(int i = 0; i < 5; i++) {
			
		}
		
		return result;
	}

	// Algorithms methods
	 private static int convert (int y){
		 
		 int change = 0;
		 
		 for(int i = 0; i < delta.length; i++) {
			 
			 change = y + delta[i];
			 
			 if(change < 1)
				 change = N + change;
			 else if(change > N)
				 change = change - N;
			 else
				 change = change;
		 }
		 
		return change;
	 }

}
