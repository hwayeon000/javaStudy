package 학생관리프로그램;

public class Main {

	public static void main(String[] args) {
		// 설계도 = Class
		// Class - 필드, 메서드
		
		// Class(설계도)를 사용해서 객체가 만들어지는 공간
		// 설계도이름 레퍼런스명 = new 설계도이름 ;
		Student stu = new Student();
		
		Student sd1 = new Student("조자연", "20014206", 23, 75, 100, 80);
		sd1.setName("형");
		sd1.setAge(45);
		sd1.show();
		
		
	}

}
