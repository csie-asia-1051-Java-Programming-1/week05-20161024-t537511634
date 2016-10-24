package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("請輸入一正整數n:");
	        double x = scn.nextInt(),sum = 0;
	        for(double i = 1; i <=x; i++){
	            sum += 1/((2*i-1)*(2*i));
	        }
	        System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
