package person;

public class Person {
	// 사람 설계도 (Class)
	// 1. Field(필드) : 데이터, 속성, 변수
	// 이름, 나이, 키	
	private String name;
	private int age;
	private int height;
	
	// 접근 제한자
	// public : 클래스 내/이에서 접근 할 수 있음
	// private : 클래스 내부에 있는 메서드를 통해서만 접근가능
	
	
//	public Person() {
//		// 기본생성자, 생략되어 잇음
//	}

	// 객체 생성과 동시에 필드를 초기화 시켜줄 수 있는 생성자 만들기
	// 리턴 타입 없음(void)
	// 클래스명과 생성자 이름 동일해야 한다!!
	// 생성자도 메서드다!
	// 생성자를 새로 만들면 원래 있던 기본 생성자 사용이 불가능
	// 기본 생성자도 사용하고 싶으면 만들어줘야 함
	public Person(String name, int age, int height) {
		this.name= name;
		this.age = age;
		this.height = height;
		// this ---> 현재 클래스를 지칭하는 키워드
	}
//	public Person() {
//		// 기본생성자 강제 생성
//	}
	// 오버로딩 : 중복정의
	
	
	// 2. Method(메서드) : 객체의 행위/기능
	// 밥먹기, 걷기, 잠자기
	public void eat() {
		// 함수를 호출해 가져다 쓸 것이므로 static이라는 공간에 저장 할 필요 없음
		System.out.println("밥을 옴뇸뇸 먹눈다.");
	}
	
	public void walk() {
		System.out.println("뚜벅뚜벅 걷는다~!");
	}
	
	public void sleep() {
		System.out.println("쿨쿨 잔다..");
	}
	
	// private으로 감싸진 데이터를 가져오고/수정할 수 있는 메서드 만들기!
	// name을 확인 할 수 있는 (main에서 가져가서 출력 해 볼수 있도록) 메서드
	public String getName() {
		return name;
		// maingetName()을 통해서 필드 name을 가져다 사용 가능!
	}
	
	public void setName(String name) {
		// main으로 받아온 name값을 필드name에 대입 할 수 있다.
		this.name = name;
	}
	
	// getter : 데이터를 가져갈 수 있도록
	// setter : 데이터를 세팅(슈정/초기화) 할 수 있도록
	
	// get을 통해 main에서 확인 할 수있도록 만들어보자
	// 최영화, 20, 160
	
	// set을 통해 age와 키를 17, 170으로수정해 출력해보기
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		// int age : 매개변수
		// main에서 보내준 수정해야 할 값
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
