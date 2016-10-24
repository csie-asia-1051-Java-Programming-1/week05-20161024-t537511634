package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("請輸入一正整數n:");
        int a = scn.nextInt(),i =1,sum=1;
        while(i <=a){
            sum *= i;
            i++;
        }
        System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
