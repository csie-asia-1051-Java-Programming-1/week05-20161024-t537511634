package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;
import java.util.Random;
public class ex05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 Random randnum = new Random();
	        int k[][] = new int[10][10];
	        for (int i = 0; i < k.length; i++) {
	            for (int j = 0; j < k.length; j++) {
	                k[i][j]= randnum.nextInt(10);
	                System.out.print(k[i][j]+"\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        for (int i = 0; i < k.length; i++) {
	            for (int j = 0; j < k[i].length; j++) {
	                System.out.print(k[j][i]+"\t");
	                 
	            }System.out.println();

	}

}}
