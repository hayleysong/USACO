package _2017_2018;

import java.util.*;
import java.io.*;

public class billboard {

	static Scanner in;
	static PrintWriter out;
	static int x, y, x1, y1, count;
	static int[][] a;

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
		in = new Scanner(new File("billboard.in"));
		out = new PrintWriter(new File("billboard.out"));
		a = new int[2001][20001];
		count = 0;
	}

	private static void solve() throws IOException {
		for (int k = 0; k < 2; k++) {
			x = in.nextInt() + 1000; 
			y = in.nextInt() + 1000;
			x1 = in.nextInt() + 1000;
			y1 = in.nextInt() + 1000;
			
			for (int i = x; i < x1; i++) {
				for (int j = y; j < y1; j++) {
					a[i][j] = 1;
					count++;
				}
			}
		}
		
		x = in.nextInt() + 1000; 
		y = in.nextInt() + 1000;
		x1 = in.nextInt() + 1000;
		y1 = in.nextInt() + 1000;
		
		for (int i = x; i < x1; i++) {
			for (int j = y; j < y1; j++) {
				if(a[i][j] == 1) {
					count--;
					a[i][j] = 0;
				}else {
					a[i][j] = 0;
				}
			}
		}
		out.println(count);
	}
}
