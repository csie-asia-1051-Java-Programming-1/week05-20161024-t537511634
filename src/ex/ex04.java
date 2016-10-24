package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("請輸入一正整數n:");
		 int v1 =scn.nextInt();
	        for(int i=0; i <v1; i++){
	            for(int j=0; j <v1; j++){
	                System.out.print('*'+"　");
	            }
	            System.out.println();
		// TODO Auto-generated method stub

	}

}}
