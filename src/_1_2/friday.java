/*
ID: hayleys1
LANG: JAVA
TASK: friday
 */

package _1_2;

import java.util.*;
import java.io.*;

public class friday {
	
	static Scanner in;
	static PrintWriter out;
	
	//Input Variables
	static int [] list;
	static int [] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int day;
	static int N;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File("friday.in"));
			out = new PrintWriter(new File("friday.out"));
			
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
		N = Integer.parseInt(in.nextLine()) + 1900;
		day = 0;
		list = new int[7]; //mon - sun
	}
	
	private static String solve() {
		
		String result = "";
		
		//Process and Output
		for(int i = 1900; i < N; i++) {
			
			for(int j = 1; j <= dates.length-1; j++) {
				
				list[(day + 13) % 7]++;
				
				if(j == 2) {
					if(check(i))
						day += 29;
					else
						day += 28;
				}else {
					day += dates[j];
				}
			}
		}
			result += list[6] + " ";
			for(int i = 0; i < 6; i++) {
				if(i == 5)
					result += list[i] + "\n";
				else
					result += list[i] + " ";
		}
		return result;
	}
	//Algorithms methods
	
	private static boolean isLeap(int y) {
		return y % 4 == 0;
	}
	
	private static boolean isCentury(int y) {
		if(y % 100 == 0) {
			if(y % 400 == 0)
				return false;
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean check (int y){
	
		return y % 4 == 0 && (y % 400 == 0 || y % 100 != 0);
		
		}

}