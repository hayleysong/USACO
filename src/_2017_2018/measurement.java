package _2017_2018;

import java.util.*;
import java.io.*;

public class measurement {

	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[] change;
	static String[] name;

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
		in = new Scanner(new File("measurement.in"));
		out = new PrintWriter(new File("measurement.out"));
		name = new String[100];
		change = new int[100];
		N = in.nextInt();
		for (int i = 0; i < N; i++) {
			int day = in.nextInt();
			String n = in.next();
			int amt = in.nextInt();
			name[day] = n;
			change[day] += amt;
		}
		out.println(Arrays.toString(change));
		out.println(Arrays.toString(name));
	}

	private static void solve() throws IOException {
		int biggest;
		int num = 0;
		for(int i = 1; i < change.length; i++) {
			if(change[i] > change[i-1]) {
				num++;
				biggest = change[i];
			}
		}
		out.println(num);
	}
}
