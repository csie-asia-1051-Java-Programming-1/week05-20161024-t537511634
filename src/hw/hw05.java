package hw;

import java.util.*;

public class hw05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n:");
		int n = scn.nextInt(), a = 0, b = 0, c = 1, t = 0;
		int k[][] = new int[n][n];
		while (a + b <= n) {
			for (int i = 0; i < a; i++) {

				for (int j = 0; j < b; j++) {
					k[a][b] = c;
				}
			}t++;
			if (a + b < t) {
				a++;
				b++;
			}
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
