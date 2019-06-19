/*
ID: hayleys1
LANG: JAVA
TASK: gift1
 */
package _1_2;

import java.util.*;
import java.io.*;

public class gift1 {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "gift1.in";
	static String outFile = "gift1.out";

	// static StringBuilder result;
	static String result = "";

	// Input Variables
	static LinkedHashMap<String, Integer> list;
	static int NP;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));

			init();
			result = solve();

			// Write out file
			out.println(result);

			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void init() {
		// Get data from input file
		// Initialize Input Variables
		NP = Integer.parseInt(in.nextLine());
		list = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < NP; i++) {
			list.put(in.nextLine(), 0);
		}
	}

	private static String solve() {
		// Process and Output
		for (int i = 0; i < NP; i++) {
			
			String giver = in.nextLine();
			String[] temp = in.nextLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int r = Integer.parseInt(temp[1]);
			int money = 0;
			int left = 0;
			
			if(r == 0)
				left = 0;
			else
				left = (a % r);
			
			list.replace(giver, (list.get(giver)-a) + left);
			
			if(r == 0)
				money = 0;
			else
				money = a/r;

			for (int j = 0; j < r; j++) {
				String receiver = in.nextLine();
				list.replace(receiver, list.get(receiver)+money);
			}
		}

		Iterator it = list.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next().toString();
            int value = list.get(key);

            result += key + " " + value;

            if(it.hasNext())
                result += "\n";
		}
		return result;
	}

	// Algorithms methods
	// private static int change (String s){

	// }
}
