package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ex10lotto {
	public static void main(String[] args) {
		

		Random rd = new Random();

		System.out.println("=====로또타임=====");
		System.out.println("이번주출력 번호는요....!!!");
		
		int[] res = new int[5];

		for (int i = 0; i < res.length; i++) {
			res[i] = rd.nextInt(1, 11);	
				
			for (int j = 0; j < i; j++) {
				if (res[j] == res[i]) {
					i--;
					break;
				}
			}
	
		}
		
		
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i] + " ");
//		}
		
		
		// Arrays.toString(배열명) : 배열 안에 들어있는 요소들을 가지고 옴
		// 한번에 가지고 있음 -> 출력문으로 감싸줘야 한다
		// ---> 정렬, 탐색
		
		System.out.println(Arrays.toString(res));
		
		
		
//		
//		System.out.println();
//		System.out.println("==============================");
//				
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		int rn;
//
//		for (int i = 0; i < 45; i++) {
//			nums.add(i + 1);
//		}
//
//		for (int i = 0; i < 6; i++) {
//			rn = rd.nextInt(nums.size());
//			System.out.println("행운의 숫자 :" + nums.get(rn));
//			nums.remove(rn);
//		}

	}

}
