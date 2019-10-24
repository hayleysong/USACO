package _2017_2018;

import java.util.*;
import java.io.*;

public class shuffle {

	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[] a, a1, temp;

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

	public static void init() throws IOException {
		in = new Scanner(new File("shuffle.in"));
		out = new PrintWriter(new File("shuffle.out"));
		N = in.nextInt();
		a = new int[N + 1];
		a1 = new int[N + 1];
		temp = new int[N + 1];
		for (int i = 1; i < a.length; i++) {
			a[in.nextInt()] = i;
		}
		for (int i = 1; i < a1.length; i++) {
			a1[i] = in.nextInt();
		}
		//out.println(Arrays.toString(a));
		//out.println(Arrays.toString(a1));
	}

	public static void solve() throws IOException {
		for (int j = 0; j < 2; j++) {
			for (int i = 1; i <= N; i++) {
				temp[a[i]] = a1[i];
			}
			for(int i = 1; i <= N; i++) {
				a1[a[i]] = temp[i];
			}
		}
		for (int i = 1; i <= N; i++) {
			out.println(temp[i]);
		}
	}
}
