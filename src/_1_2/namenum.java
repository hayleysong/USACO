/*
ID: hayleys1
LANG: JAVA
TASK: namenum
 */
package _1_2;

import java.util.*;
import java.io.*;

public class namenum {

	static Scanner dict;
	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static ArrayList<String> list;
	static String num;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			// Scanner in = new Scanner(new File("dict.txt"));
			in = new Scanner(new File("namenum.in"));
			out = new PrintWriter(new File("namenum.out"));
			dict = new Scanner(new File("dict.txt"));

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
		num = in.nextLine();
		list = new ArrayList<String>();
	}

	private static String solve() {
		// Process and Output
		String result = "";
		while (dict.hasNextLine()) {
			String name = dict.nextLine();
			list.add(name);
		}
		boolean chk = false;
		for(int i = 0; i < list.size(); i++) {
			if(num.equals(convert(list.get(i)))) {
				result += list.get(i) + "\n";
				chk = true;
			}
		}
		if(!chk)
			result += "NONE" + "\n";
		return result;
	}

	// Algorithms methods
	public static String convert(String n) {
		String result = ""; 
		
				for(int i = 0; i < n.length(); i++) {
					if(n.charAt(i) == 'A' || n.charAt(i) == 'B' || n.charAt(i) == 'C') {
						result+="2";
					}else if(n.charAt(i) == 'D' || n.charAt(i) == 'E' || n.charAt(i) == 'F') {
						result+="3";
					}else if(n.charAt(i) == 'G' || n.charAt(i) == 'H' || n.charAt(i) == 'I') {
						result+="4";
					}else if(n.charAt(i) == 'J' || n.charAt(i) == 'K' || n.charAt(i) == 'L') {
						result+="5";
					}else if(n.charAt(i) == 'M' || n.charAt(i) == 'N' || n.charAt(i) == 'O') {
						result+="6";
					}else if(n.charAt(i) == 'P' || n.charAt(i) == 'R' || n.charAt(i) == 'S') {
						result+="7";
					}else if(n.charAt(i) == 'T' || n.charAt(i) == 'U' || n.charAt(i) == 'V') {
						result+="8";
					}else if(n.charAt(i) == 'W' || n.charAt(i) == 'X' || n.charAt(i) == 'Y') {
						result+="9";
					}
				}
			return result;
	}

}
