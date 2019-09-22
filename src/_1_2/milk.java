/*
 * ID: hayleys1
 * LANG: JAVA
 * TASK: milk
 */
package _1_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class milk {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static String[] list;
	static int N;
	static int M;
	static milks[] farmers;
	
	static class milks implements Comparable<milks>{

		int price;
		int unit;
		
		public milks(int price, int unit) {
			
			this.price = price;
			this.unit = unit;
		}
		public int compareTo(milks that) {
			
			return 0;
		}
		
	}

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("xxx.in"));
			out = new PrintWriter(new File("xxx.out"));

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
		list = in.nextLine().split(" ");
		N = Integer.parseInt(list[0]);
		M = Integer.parseInt(list[1]);
		farmers = new milks[M];
		
		for(int i = 0; i < M; i++) {
			String [] temp = in.nextLine().split(" ");
			farmers[i] = new milks(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
		}
		Arrays.sort(farmers);
	}

	private static String solve() {
		// Process and Output
		String result = "";
		
		
		
		return result;
	}

	// Algorithms methods
	// private static int change (String s){

	// }

}
