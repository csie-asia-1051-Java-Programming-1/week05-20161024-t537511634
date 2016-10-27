package hw;

import java.util.*;

import sun.nio.cs.UTF_32BE;

public class hw05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n:");
		int n = scn.nextInt(), a = 0, b = 0, c = 1, c2 = 0, t = 0;
		int k[][] = new int[n][n];
		while (t <= (n - 1) * 2) {
			if (t < n) {
				for (int i = t; i >= 0; i--) {
					int j = t - i;
					k[i][j] = c;
					c++;
				}
			}
			if (t >= n) {
				int q = n - 1;
				for (int i = t - n + 1; i < n; i++) {

					k[q][i] = c;
					q--;
					c++;
				}
			}
			t++;
		}

		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.print(k[i][j] + "\t");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
