package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		System.out.println("請輸入一正整數n:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), sum = 0, a = 1;
		while (sum <= n) {
			sum += a;
			if (sum <= n) {
				a++;
			}
		}
		System.out.println(a - 1);
		// TODO Auto-generated method stub

	}

}
