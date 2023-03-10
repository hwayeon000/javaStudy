package ex01정렬;

import java.util.Arrays;

public class Ex01버블정렬 {
	public static void main(String[] args) {
		

		// 정렬을 하는 이유
		// : 간편하게 탐색하기 위해서

		// 오름차순, 내림차순

		// 버블정렬 (bubble sort)
		// : 인접한 원소들끼리 비교해서 정렬

		// 가장 쉽고 간단한 코드를 가지고 있으나
		// 가장 효율이 안 좋은 정렬

		// 시간이 오래걸림
		// 시간복잡도
		// n^2

		// 5개의 원소들을 오름차순으로 정리
		// 9 8 7 6 5 ---> 4번의 치환, 최대 치환 횟수는 원소의 개수 -1
		// 메모리에 저장 ---> 물리적 저장
		// 치환은 메모리 소모가 큰데
		// 원소의 개수 -1번의 최대 치환횟수를 갖는다
		// ---> 1 Cycle

		// 버블 정렬 ---> 선택 정렬
		// 첫번째 사이클에서 마지막 인덱스에 가장 큰 수가 온다.
		// 45, 7, 12, 82, 25

		int[] arr = { 45, 7, 12, 82, 25 };
		// 오름차순 ---> 버블정렬
		// [7, 12, 25, 48, 82] ---> Arrays.toString();

		// 1 Cycle
		// step 1 ) [0] [1]이 비교 ---> [1]에 더 큰 수
		int temp = 0;
		if (arr[0] > arr[1]) {
			// 만약 0에 있는 값이 1에 있는 값보다 크면
			// 서로 자리바꿈 == 치환
			temp = arr[1]; // 7
			arr[1] = arr[0]; // [45, 45, 12, 82, 25]
			arr[0] = temp; // [7, 45, 12,82, 25]
		}
		
		// step 2 ) [1] [2] 비교
		if (arr[1] > arr[2]) {
			temp = arr[2]; // 12
			arr[2] = arr[1]; // [7, 12, 45, 82, 25]
			arr[1] = temp;
		}
		// step 3 ) [2] [3] 비교
		if (arr[2] > arr[3]) {
			temp = arr[3];
			arr[3] = arr[2];
			arr[2] = temp;
		}

		// step 4 ) [3] [4] 비교
		if (arr[3] > arr[4]) {
			temp = arr[4];
			arr[4] = arr[3];
			arr[3] = temp;
		}

		
		for (int i = 0; i <= 3; i++) {
			// i : 0, 1, 2, 3 ---> 4번
			if (arr[i] > arr[i + 1]) {
				// 만약 0에 있는 값이 1에 있는 값보다 크면
				// 서로 자리 바꿈 == 치환
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}

		// Cycle2
		// 0 1 비교 -> 1 2 비교 -> 2 3 비교
		for (int i = 0; i <= 2; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}

		// Cycle3
		// 0 1 비교 -> 1 2 비교
		for (int i = 0; i <= 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}
		
		// Cycle4

		// 분명 반복되는 패턴 찾을 수 있다
		// 정렬 후 : [7 12 25 45 82]
		for (int j = 3; j >= 0; j--) {
			for (int i = 0; i <= j; i++) {
				// i : 0, 1, 2, 3 ---> 4번
				if (arr[i] > arr[i + 1]) {
					// 만약 0에 있는 값이 1에 있는 값보다 크면
					// 서로 자리 바꿈 == 치환
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}System.out.println(Arrays.toString(arr));
		}

		System.out.println(Arrays.toString(arr));
		
		
		// -------------------------쌤
		
		   // 정렬을 하는 이유
	      // : 간편하게 탐색하기 위해서

	      // 오름차순, 내림차순
	      
	      // 버블정렬 (bubble sort)
	      // : 인접한 원소들끼리 비교해서 정렬
	      
	      // 가장 쉽고 간단한 코드를 가지고 있으나
	      // 가장 효율이 안 좋은 정렬
	      
	      // 시간이 오래걸린다
	      // 시간복잡도
	      // n^2
	      
	      // 5개의 원소들을 오름차순으로 정리
	      // 9 8 7 6 5 ---> 4번의 치환
	      // 메모리에 저장 ---> 물리적 저장 
	      // 치환은 메모리 소모가 큰데
	      // 원소의 갯수 -1번의 최대 치환횟수를 갖는다
	      // ---> 1Cycle
	      
	      // 버블 정렬 ---> 선택 정렬
	      // 첫번째 사이클에서 마지막인덱스에 가장 큰 수가 온다
	      // 45,7,12,82,25
	      int[] arr1 = {45, 7, 12, 82, 25};
	      // 오름차순 ---> 버블정렬
	      // [ 7 12 25 45 82 ] ---> Arrays.toString();
	      
	      // 1Cycle
	      // step1) [0] [1]이 비교 ---> [1]에 더 큰 수가 와야함
	      int temp1 = 0; 
	      
	      for(int j = 3; j >= 0; j--) {
	         // j : 3 2 1 0
	         for(int i = 0; i <= j; i++) {
	            // i : 0 1 2 3 ---> 4번
	            if(arr1[i] > arr1[i+1]) {
	               // 만약에 0에있는 값이 1에있는 값보다크면
	               // 서로 자리바꿈 == 치환
	               temp1 = arr1[i+1]; // temp ==> 7
	               arr1[i+1] = arr1[i]; // [ 45, 45, 12, 82, 25]
	               arr1[i] = temp1;//[ 7, 45, 12, 82, 25]
	            }
	         }
	         System.out.println(Arrays.toString(arr1));
	      }
	      System.out.println(Arrays.toString(arr1));
	      

		
	}

}
