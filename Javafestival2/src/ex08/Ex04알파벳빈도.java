package ex08;

import java.util.Scanner;

public class Ex04알파벳빈도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 >> ");
		String str = sc.nextLine();
//		String str = "smart Media";
		str = str.replace(" ", "");
		str = str.toLowerCase();
		char[] chr = str.toCharArray();
		int[] res = new int[26];
		
		System.out.println(str);
		
		int f = 97;
		
		for (int i = 0; i < chr.length; i++) {
			res[(int)chr[i] - f] += 1;
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println((char)f + " : " + res[i]);
			f++;
		}
		
		
		
		
//		System.err.print("입력 : ");
//		String name = sc.nextLine();
//		name = name.replace(" ", "");
//		name = name.toLowerCase();
//		char[] arr_name = name.toCharArray();
//		int[] res = new int[26];
//
//		int f = 97;
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < arr_name.length; j++) {
//				if (arr_name[j] == (char) f + i) {
//					res[i] += 1;
//				}
//			}
//		}
//		for (int j = 0; j < res.length; j++) {
//			System.out.println((char)f + ":" + res[j]);
//			f++;
//		}
		
		

	}

}
