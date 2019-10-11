//package _2017_2018;

import java.util.*;
import java.io.*;

public class notlast {

	static Scanner in;
	static PrintWriter out;
	static int N, amt;
	static Map<String, Integer> cow;
	static String name;

	public static void main(String[] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void init() throws IOException {
		in = new Scanner(new File("notlast.in"));
		out = new PrintWriter(new File("notlast.out"));
		N = in.nextInt();
		cow = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			name = in.next();
			amt = in.nextInt();
			if (cow.containsKey(name))
				cow.put(name, cow.get(name) + amt);
			else
				cow.put(name, amt);
		}
		System.out.println(cow);
	}

	private static void solve() throws IOException {
		TreeMap<Integer, String> cow2 = new TreeMap<Integer, String>();
		for (String key : cow.keySet()) {
			int value = cow.get(key);
			if (cow2.containsKey(value)) {
				cow2.put(value, cow2.get(value) + " " + key);
			} else {
				cow2.put(value, key);
			}
		}
		int cnt = 0;
		String ans = "";
		for (int key : cow2.keySet()) {
			ans = cow2.get(key);
			cnt++;
			if (cnt > 1) {
				ans = cow2.get(key);
				break;
			}
		}
		if (ans.indexOf(' ') >= 0) {
			out.println("Tie");
		} else {
			out.println(ans);
		}
	}
}
