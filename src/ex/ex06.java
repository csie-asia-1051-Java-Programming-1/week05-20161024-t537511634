package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] n = { 3, 1, 4,5 };
		int a;
		for (int i = 0; i<4; i++) {
			for (int i1 = i+1; i1 < n.length; i1++) {
				if (n[i] < n[i1]) {
					a = n[i1];
					n[i1] = n[i];
					n[i]= a;
				}
			}
		}

			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i] + "\t");
			}

		// TODO Auto-generated method stub

	}

}
