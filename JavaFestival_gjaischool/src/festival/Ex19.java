package festival;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
//		행 개수를 입력 받아 다음과 같이 삼각형을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}