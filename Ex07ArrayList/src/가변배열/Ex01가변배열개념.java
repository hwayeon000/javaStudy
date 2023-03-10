package 가변배열;

import java.util.ArrayList;

public class Ex01가변배열개념 {
	public static void main(String[] args) {
		
		// 1. ArrayList 만들기
		ArrayList<String> arrList = new ArrayList<>();
		
		// String : 래퍼런스형 데이터 타입
		// ArrayList에는 레퍼런스형 데이터 타입만 올 수 있다.
		// int (기본타입) -> Integer (레퍼런스형) 
		// double -> Double
		// float -> Float
		
		// collection : book 아마 290 ~ 309?
		// 가변 배열 ---> 내가 데이터를 넣는 만큼 늘어나는 배열
		
		// 2. 데이터 삽입하기
		// .add(데이터값)
		arrList.add("조자연");
		arrList.add("김한송");
		arrList.add("김예함");
		arrList.add("신석우");
		// 인덱스, 데이터---> 원하는 위치에 데이터 넣을 수 있음!
		arrList.add(2, "최영화");
		
		System.out.println(arrList.size());
		
		// 3. 데이터 삭제하기
		arrList.remove(2);
		
		// 4. 데이터 확인하기 (가져오기)
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		// 5. arrList 값 한번에 삭제하기 (초기화)
		arrList.clear();
		System.out.println(arrList.size()); // 0, 값 없음..
		
		
		
		// 플레이리스트 만들기...
		
		
		
	}

}
