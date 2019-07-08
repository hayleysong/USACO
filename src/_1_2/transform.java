/*
ID: hayleys1
LANG: JAVA
TASK: transform
 */
package _1_2;

import java.util.*;
import java.io.*;

public class transform {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static char[][] og;
	static char[][] change;
	static int N;
	static String input;
	static String input1;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("transform.in"));
			out = new PrintWriter(new File("transform.out"));

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
		og = new char[N][N];
		change = new char[N][N];

		for (int i = 0; i < N; i++) {
			input = in.nextLine();
			for (int j = 0; j < N; j++) {
				og[i][j] = input.charAt(j);
			}
		}
		for (int i = 0; i < N; i++) {
			input1 = in.nextLine();
			for (int j = 0; j < N; j++) {
				change[i][j] = input1.charAt(j);
			}
		}

		// checking input

		/*
		 * for(int i = 0; i < og.length; i++) { for(int j = 0; j < og.length; j++) {
		 * System.out.print(og[i][j]); } } System.out.println(""); for(int i = 0; i <
		 * change.length; i++) { for(int j = 0; j < change.length; j++) {
		 * System.out.print(change[i][j]); } }
		 */
	}

	private static String solve() {
		// Process and Output
		String result = "";
		
		if(isSame(ninety(og))) {
			result+=1;
		}else if(isSame(oneEighty(og))) {
			result+=2;
		}else if(isSame(twoSeventy(og))) {
			result+=3;
		}else if(isSame(reflected(og))) {
			result+=4;
		}else if(isSame(reflected(og)) || isSame(reflected(oneEighty(og))) || isSame(reflected(twoSeventy(og))) || isSame(reflected(ninety(og)))) {
			result+=5;
		}else if(isSame(og)) {
			result+=6;
		}else {
			result+=7;
		}
		return result + "\n";
	}

	// Algorithms methods
	public static char[][] ninety(char[][] in) {
		char[][] res = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				res[i][j] = in[N - j - 1][i];
			}
		}
		return res;
	}
	
	public static char[][] oneEighty(char[][]in){
		return ninety(ninety(in));
	}
	
	public static char[][] twoSeventy(char[][]in){
		return oneEighty(ninety(in));
	}

	public static char[][] reflected(char[][] in) {
		char[][] reflect = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
					reflect[i][j] = in[i][N-j-1];
			}
		}
		return reflect;
	}
	public static boolean isSame(char[][] in) {
		for(int i = 0; i < in.length; i++) {
			for(int j = 0; j < in.length; j++) {
				if(in[i][j] != change[i][j])
					return false;
			}
		}
		return true;
	}
}
