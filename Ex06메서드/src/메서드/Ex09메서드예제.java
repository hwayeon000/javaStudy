package 메서드;

public class Ex09메서드예제 {
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 2;
//		boolean divisor = isDivisor(num1,num2);
//		System.out.println(divisor);
//		// + 메서드 이름에 is ---> 리턴타입 무조건 boolean
//		// JSP/Sevlet, Android
//		
//		getDivisior(10);
//		getDivisior(16);
//		getDivisior(24);
		
		int num = 200;
		int result = getSumOfdivisors(num);
		// int result = 결과값 (int)
		// 결과값이 int ---> 리턴타입(결과값)이 int
		
		// 전달인자 int --> num 
		System.out.println(num + "의 약수의 합 : " + result);
		getDivisior(num);
		
		
		// boolean result2 - 결과값;
		// 리턴타입(결과값)이 boolean
		// int num3 : 전달인자, 매개변수
		int num3 = 8256;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2);
		
		int stVal = 2;
		int endVal = 1000;
		getPerfectNumber(stVal, endVal) ;
		
		
	}
	
	// num1이 num2의 약수인지 확인하여 boolean타입을 반환하는 메소드
	public static boolean isDivisor(int num1, int num2) {
		return num1%num2==0 ;
	}
	
	// num의 약수를 출력하는 함수
	public static void getDivisior(int num) {
		System.out.print(num + "의 약수 : ");
//		for (int i = 1; i <= num; i++) {
//			// num을 i로 나누었을 때 나머지가 0
//			if (num%i==0) {
//				System.out.print(i + " ");
//			}
//		}System.out.println();

		for (int i = 1; i <= num; i++) {
			// num을 i로 나누었을 때 나머지가 0
			if (isDivisor(num, i)) {
				System.out.print(i + " ");
			}
		}System.out.println();
	}
	
	// 약수의 합을 구하여 반환하는 함수
	public static int getSumOfdivisors(int a) {
		// 약수들의 합이 누적되는 공간(변수)
		int res = 0;

		// main에서받아온 num이란 숫자의 약수들의 합
		// 약수 1 ~ 자기자신의 숫자들 중 자기자신을 나누어 떨어지게 하는 수
		// 가장 작은 약수 1, 모든 숫자들은 자기자신보다 큰 약수를 가지지 않음
		// 자기자신을 2로 나눈 값보다 큰 약수는 자기 자신밖에 없다!!
		// 예)  5000을 2로 나누면 2500, 2500보다 큰 약수는 자기 자신뿐..!
		// 	   10 -> 1, 2, 5, 10
		//     20 -> 1, 2, 4, 5, 10, 20
		for (int i = 1; i <= a/2; i++) {
			if (isDivisor(a, i)) {
				res += i;
			}
		}	
		return res + a;
	}
	
	// 완전수 구하는 함수
	public static boolean isPerfectNumber(int a) {
		// 완전수
		// 6: 1 2 3 ---> 6 (완전수)
		// 자기 자신을 제외한 약수들의 합이 가지가신과 같은 수
		return getSumOfdivisors(a) - a == a ;
	}
	
	public static void getPerfectNumber(int num1, int num2) {
		System.out.print(num1 + "~" + num2 + "까지의 완전수 : ");
		for (int i = num1; i < num2; i++) {
			if (isPerfectNumber(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
