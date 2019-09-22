package _2018_2019;
import java.util.*;
import java.io.*;

public class backforth {

	static Scanner in;
	static PrintWriter out;
	static int[] a1, b1;
	static int milk = 1000;
	static HashSet<Integer> amt;

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
		in = new Scanner(new File("backforth.in"));
		out = new PrintWriter(new File("backforth.out"));
		a1 = new int[10];
		b1 = new int[10];
		amt = new HashSet<Integer>();
		
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = in.nextInt();
		}
		for (int i = 0; i < b1.length; i++) {
			b1[i] = in.nextInt();
		}
	}

	private static void solve() throws IOException {
		int result = 0;
		int temp = 0;
		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a = a1.clone();
				b = b1.clone();
				milk = 1000 - a[i] + b[j];
				temp = b[j];
				b[j] = a[i];
				a[i] = temp;
				for (int k = 0; k < 10; k++) {
					for (int m = 0; m < 10; m++) {
						result = milk - a[k] + b[m];
						amt.add(result);
					}
				}
			}
		}
		out.print(amt.size());
	}

}
