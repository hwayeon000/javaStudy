package life;

public class Main {

	public static void main(String[] args) {
		// 상속이 없이 각각의 개체에 기능이 있다면
		// 		수정이 필요한 경우 연결되어 있는 모든 클래스의 수정이 필요함
		
		// 고래 객체 생성
		Whale whale = new Whale();
		whale.eating();
		// 치타 객체 생성
		Cheetah ct = new Cheetah();
		ct.eating();
		// 타조 객체 생성
		Ostrich ost = new Ostrich();
		ost.eating();
		
	}

}
