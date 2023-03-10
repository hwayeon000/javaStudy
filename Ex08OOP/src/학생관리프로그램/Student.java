package 학생관리프로그램;

public class Student {
	// 1. 필드(Field) : 데이터, 속성, 변수
	// 이름(name-String), 학번(number-String), age(int)
	// scoreJava(int)
	// scoreWeb(int)
	// ScoreAndroid(int)
	// 이 필드에 함부로 접근 할 수 없도록 만들기!
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	// getter/setter/constructor 자동완성
	// alt + shift + s
	
	// public : 클래스 내/외부에서 마음대로 접근이 가능하도록 만들어주는 접근제한자 
	// private : 클래스 내부에 있는 메서드를 통해서만 접근이 가능하도록 만들어주는 접근제한자
	// 접근하고 싶으면 클래스 내부에 메서드가 설계되어 있어야 한다!!!
	// getter : 데이터를 가져온다
	// setter : 데이터를 수정한다
	

	// 생성자(constructor)
	// 필드이름 = 매개변수이름
	// : 객체 생성과 동시에 필드를 초기화 시켜주는 메서드
	// 1. 리턴타입이 없다 (void도 없다)
	// 2. 생성자 이름은 클래스명과 동일해야 한다.
	// 3. 생성자도 메서드이다!

	// 기본 생성자
	public Student() {
		// 4. 클래스 생성시 기본생성자는 생략되어 있다.
		// 5. 내가 새로운 생성자를 만들면 기본생성자는 덮어씌워진다 (사용 불가능)
		// + 만약에 기본생성자도 사용하고 싶으면 --> 오버로딩
		// 오버로딩 : 이름은 같으나 사용하는 매개변수의 형태가 다르면 오버로딩이 가능함
	}

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		// name = name; <-- 가장 가까운 변수를 찾아옴, 매개변수의 name을 찾아옴
		// 현재 클래스 : this
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	// 2. 메서드(Method) : 객체의 행위, 기능
	// + 생성자, getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	// show() ---> 조자연, 20014206, 23, 80, 90, 100
	// 조자연님 안녕하세요.
	// [ 20014206, 23살]
	// 조자연님의 자바 점수는 80점 입니다.
	// 조자연님의 웹 점수는 90점 입니다.
	// 조자연님의 안드로이드 점수는 100점 입니다.
	// ==========================================
	// 조자연님의 평균 성적은 90점 입니다.
	public void show() {
		int avg = (this.scoreJava + this.scoreWeb + this.scoreAndroid)/3;
		System.out.println(this.name + "님 안녕하세요.");
		System.out.println("[ " + this.number + ", " + this.age + " ]");
		System.out.println(this.name + "님의 자바 점수는 "
		+ this.scoreJava + "점 입니다");
		System.out.println(this.name + "님의 웹 점수는 "
		+ this.scoreWeb + "점 입니다");
		System.out.println(this.name + "님의 안드로이드 점수는 "
		+ this.scoreAndroid + "점 입니다");
		System.out.println("=================================");
		System.out.println(this.name + "님의 평균 점수는 "
		+ avg + "점 입니다");
	}

}
