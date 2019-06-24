/*
ID: hayleys1
LANG: JAVA
TASK: ride
 */
import java.util.*;
import java.io.*;

public class template {
	
	static Scanner in;
	static PrintWriter out;
	
	//Input Variables
	static String [] list;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File("xxx.in"));
			out = new PrintWriter(new File("xxx.out"));
			
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
	}
	
	private static String solve() {
		//Process and Output
		String result = "";
		
		return result;
	}
	
	//Algorithms methods
	//private static int change (String s){
	
		//}

}
