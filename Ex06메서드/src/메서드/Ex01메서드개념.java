package 메서드;

public class Ex01메서드개념 {
	public static void main(String[] args) {
		
		// main 메서드
		// : 실행을 시키면 가장 먼저 컴파일이 되는 기능
//		System.out.println();
			
		
		// 메서드 사용은 main메서드 안에서 사용 할 수 있다! --> 호출
		// 1) 메서드 명
		sum(3, 4); // 결과값인 7을 받아오기만 한 상태(출력x)
		// 만들어진 메서드에 매개변수가 2개이면 전달인자도 2개
		// 매개변수가 int이면 전달인자도 int자료형을 가져야 한다!
		
		System.out.println(sum(3, 4));
		// 유지 보수 + 수정이 용이!!
		
		// 리턴타입이 있을 수 도 있고, 없을수도 있다
		// 매개변수 있을 수 도 있고, 없을수도 있다
			
	}

	// 내가 만드는 메서드는 main밖에다가 적어주자! ***
//	1) public (공공의) :  클래스 내/외부에서 마음대로 가져다 사용가능
//     ** 접근 제한자(접근지정자)
//	   private(숨기는) , protected (상속) , default
//	2) static (저장소) : 정적인 메모리 공간
//	3) 리턴타입 : 메서드가 돌려주는 결과값의 데이터 타입
//	   int, float, char, String, int[] ..
//	   : *** 리턴 타입의 자료형이 명시되어 있으면 return !!! 키워드 꼭 와야 한다!
//	   void ( 텅 빈 ) : 리턴하는 결과값이 없으면, 기능 자체를 돌려주고 있다면
//	   void라는 키워드를 사용( 단, return X )
//	4) 메서드 명 (호출명)
//	5) 매개변수 : 메서드 내애서 사용하는 변수 (parameter)
	
	public static int sum(int a, int b) {
		// a랑 b랑 더한 결과값을 돌려주도록 만들자
		return a + b;
	}
	
	
}
