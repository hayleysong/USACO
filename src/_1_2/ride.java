/*
 * ID: hayleys1
 * LANG: java
 * TASK: ride
 */
package _1_2;

import java.util.*;
import java.io.*;

public class ride {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	
	//static StringBuilder result;
	static String result = "";
	
	//Input Variables
	static String [] list;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//Write out file
			out.println(result);
			
			out.close();
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		//Get data from input file
		//Initialize Input Variables
		
		list = new String[2];
		
		list[0] = in.nextLine();
		list[1] = in.nextLine();
	}
	
	private static String solve() {
		//Process and Output
		
		if(convert(list[0]) == convert(list[1])) 
			result = "GO";
		else
			result = "STAY";
		
		return result;
	}
	
	//Algorithms methods
	private static int convert (String s){
		int product = 1;
		for(int i = 0; i < s.length(); i++) {
			
			product *= s.charAt(i) - 'A' + 1;
		}
		product %= 47;
		
		return product;
	}
}
