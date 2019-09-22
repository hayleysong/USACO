package _2018_2019;
import java.util.*;
import java.io.*;

public class mixmilk {

	static Scanner in;
	static PrintWriter out;
	static int c1, c2, c3, m1, m2, m3;

	public static void main(String[] args) {

		try {
			init();
			solve();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void init() throws IOException {

		in = new Scanner(new File("mixmilk.in"));
		c1 = in.nextInt();
		m1 = in.nextInt();
		c2 = in.nextInt();
		m2 = in.nextInt();
		c3 = in.nextInt();
		m3 = in.nextInt();

		in.close();

		//System.out.printf("%d %d %d %d %d %d", c1, m1, c2, m2, c3, m3);

	}

	private static void solve() throws IOException {

		for (int j = 0; j < 33; j++) {

			if (m1 <= c2 - m2) {
				m2 = m2 + m1;
				m1 = 0;
			} else {
				m1 = m1 - (c2 - m2);
				m2 = c2;
			}

			if (m2 <= c3 - m3) {
				m3 = m3 + m2;
				m2 = 0;
			} else {
				m2 = m2 - (c3 - m3);
				m3 = c3;
			}

			if (m3 <= c1 - m1) {
				m1 = m1 + m3;
				m3 = 0;
			} else {
				m3 = m3 - (c1 - m1);
				m1 = c1;
			}
		}
		if (m1 <= c2 - m2) {
			m2 = m2 + m1;
			m1 = 0;
		} else {
			m1 = m1 - (c2 - m2);
			m2 = c2;
		}
		
		out = new PrintWriter(new File("mixmilk.out"));
		out.printf("%d\n%d\n%d\n", m1, m2, m3);
		out.close();
	}

}
