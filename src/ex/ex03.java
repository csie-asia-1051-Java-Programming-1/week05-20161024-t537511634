package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("請輸入一正整數n:");
		int a = scn.nextInt(),sum=0;
		  for(int i = 1; i<=a;i++){
	            sum += (int) Math.pow(a,i);   
	        }
	        System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
