package _2018_2019;
import java.util.*;
import java.io.*;

public class blist {

	static PrintWriter out;
	static Scanner in;
	static int N, s, t, b;
	static int[] bucket;

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

		in = new Scanner(new File("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		bucket = new int[1001];
		N = in.nextInt();
	}

	private static void solve() throws IOException {
		
		for(int i = 0; i < N; i++) {
			s = in.nextInt();
			t = in.nextInt();
			b = in.nextInt();
			
			for (int j = s; j <= t; j++) {
				bucket[j] += b;
			}
		}
		Arrays.sort(bucket);
		out.print(bucket[1000]);
	}

}
