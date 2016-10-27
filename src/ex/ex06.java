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
			for (int j = 0; j < 4-i-1; j++) {
				if (n[j] < n[j+1]) {
					a = n[j+1];
					n[j+1] = n[j];
					n[j]= a;
				}
			}
		}

			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i] + "\t");
			}

		// TODO Auto-generated method stub

	}

}
