/*
 * ID: hayleys1
 * LANG: java
 * TASK: ride
 */
import java.util.*;
import java.io.*;

public class template {
	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "xxx.in";
	static String outFile = "xxx.out";
	
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
	}
	
	private static String solve() {
		//Process and Output
		
		return result;
	}
	
	//Algorithms methods
	//private static int change (String s){
	
		//}

}
