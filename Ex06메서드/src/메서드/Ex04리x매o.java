package 메서드;

public class Ex04리x매o {
	public static void main(String[] args) {
		// 리턴타입 X
		// 매개변수 O
		
		sumPrint(5,6);
		// 5랑 6이랑 더한 결과값 출력해주는 기능
//		System.out.println(sumPrint(5,6));
		// : 출력하는 기능을 가진 메서드 출력하려 하면 오류 발생!!
		
		
	}
	
	// 출력하는 기능! 입력 하는 기능! 랜덤한 숫자 기능!
	// void
	// 매개변수 명은 본인 마음대로~
	public static void sumPrint(int a, int b) {
		// 리턴타입에 void가 오면 return이라는 키워드 필요없다!!
		System.out.println(a+b);
	}

}
