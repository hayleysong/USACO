package _2018_2019;
import java.util.*;
import java.io.*;

public class shell {
	static Scanner in;
	static PrintWriter out;
	static int N, a, b, g;
	static int[] arr, points;
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
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		N = in.nextInt();
		arr = new int[] {0, 1, 2, 3};
		points = new int[3];
	}
	private static void solve() throws IOException{
		for(int i = 0; i < N; i++) {
			a = in.nextInt();
			b = in.nextInt();
			g = in.nextInt();
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			//out.print(Arrays.toString(arr));
			if(g == 1) {
					points[arr[g]-1]++;
			}
			else if(g == 2) {
					points[arr[g]-1]++;
				}else {
					points[arr[g]-1]++;
			}
			//out.print(Arrays.toString(points));
		}
		Arrays.sort(points);
		out.print(points[2]);
	}

}
