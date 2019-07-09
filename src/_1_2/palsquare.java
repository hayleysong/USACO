/*
ID: hayleys1
LANG: JAVA
TASK: palsquare
 */
package _1_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class palsquare {

	static Scanner in;
	static PrintWriter out;
	
	//Input Variables
	static String [] list;
	static int N;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File("palsquare.in"));
			out = new PrintWriter(new File("palsquare.out"));
			
			init();
			
			//Write out file
			out.print(solve());
			
			out.close();
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		//Get data from input file
		//Initialize Input Variables
		N = Integer.parseInt(in.nextLine());
	}
	
	private static String solve() {
		//Process and Output
		String result = "";
		
		for(int i = 1; i <= 300; i++) {
			 String q = "" + i;
			 String n = baseConversion(q, 10, N).toUpperCase();
			 String s = "" + (i * i);
			 
			 String square = baseConversion(s, 10, N).toUpperCase();
			 
			 if(isPalindrome(square))
				 result += n + " " + square + "\n";
		}
		
		return result;
	}
	
	//Algorithms methods
	public static boolean isPalindrome(String s) {
		 int idx = s.length() - 1;
		 
		 for(int i = 0; i < s.length()/2; i++) {
			 if(s.charAt(i) != s.charAt(idx))
				 return false;
			 idx--;
		 }
		 return true;
	}
	
	public static String baseConversion(String number, int sBase, int dBase) {

        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

}
