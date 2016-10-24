package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("請輸入一正整數n:");
	        int a = scn.nextInt(),sum = 1;
	         
	        for(int i = 1; i<=a;i++){
	            sum = i*sum;   
	        }
	        System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
