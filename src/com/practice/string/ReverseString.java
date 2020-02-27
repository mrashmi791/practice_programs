package com.practice.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
//		String str2="";
//		for(int i = str.length()-1; i >=0; i--) {
//			str2= str2+str.charAt(i);
//		}
//		System.out.println(str2);
		
		char[] arr = str.toCharArray();

		char temp;
		for (int i = 0; i <= n / 2; i++) {
			temp = arr[(n - 1) - i];
			arr[(n - 1) - i] = arr[i];
			arr[i] = temp;
		}
		for (Character ch : arr) {
			System.out.print(ch);
		}
	}

}
