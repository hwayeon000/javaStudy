package ex04;

import java.util.Scanner;

public class Ex06이차원배열 {
	public static void main(String[] args) {
//		정수 N을 입력받아 N * N 배열에 다음과 같이 숫자를 저장하고 출력
//		1	6	11	16	21	
//		2	7	12	17	22	
//		3	8	13	18	23	
//		4	9	14	19	24	
//		5	10	15	20	25
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		
//		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
//				System.out.print(arr[i][j] + "\t");
			}
//			System.out.println();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}System.out.println();
		}
		
		
		
		
	}


}
