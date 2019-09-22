package _2018_2019;
import java.util.*;
import java.io.*;
public class sleepy {

	static Scanner in;
	static PrintWriter out;
	static int N, k, count;
	static int[] cows;
	
	public static void main(String [] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void init() throws IOException{
		
		in = new Scanner(new File("sleepy.in"));
		out = new PrintWriter(new File("sleepy.out"));
		N = in.nextInt();
		cows = new int[N];
		count = 0;
		
		for(int i = 0; i < N; i++) {
			cows[i] = in.nextInt();
		}
		//out.print(Arrays.toString(cows));
	}
	private static void solve() throws IOException{
		for(int i = N-1; i > 0; i--) {
			if(cows[i-1] > cows[i]) {
				count = i;
				break;
			}
		}
		out.print(count);
	}
}
