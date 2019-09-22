package _2018_2019;
import java.util.*;
import java.io.*;
public class guess {
	
	static Scanner in;
	static PrintWriter out;
	static int N, K;
	static ArrayList<String> a[];
	
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
	public static void init() throws IOException{
		in = new Scanner(new File("guess.in"));
		out = new PrintWriter(new File("guess.out"));
		N = in.nextInt();
		a = new ArrayList [N];
		
		for(int i = 0; i < N; i++) {
			a[i] = new ArrayList<String>();
			in.next();
			K = in.nextInt();
			for(int j = 0; j < K; j++) {
				a[i].add(in.next());
			}
		}
		//out.println(Arrays.toString(a));
	}
	public static void solve() throws IOException{
		int same = 0;
		int max = 0;
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				for(String c : a[i]) {
					if(a[j].contains(c)) {
						same++;
					}
				}
				max = Math.max(same, max);
				same = 0;
			}
		}
		out.println(max+1);
	}

}
