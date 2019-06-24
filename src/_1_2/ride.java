/*
ID: hayleys1
LANG: JAVA
TASK: ride
 */
package _1_2;

import java.util.*;
import java.io.*;

public class ride {

	static Scanner in;
	static PrintWriter out;
	
	//static StringBuilder result;
	
	//Input Variables
	static String [] list;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File("ride.in"));
			out = new PrintWriter(new File("ride.out"));
			
			init();
			
			//Write out file
			out.println(solve());
			
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
		String result = "";
		
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
