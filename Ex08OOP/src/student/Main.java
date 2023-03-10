package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 정보를 담을 ArrayList
		ArrayList<Student> array_student = new ArrayList<>();
		// 확인용 가데이터
		Student stu1 = new Student("김갑돌", "0117", 80, 90, 70);
		array_student.add(stu1);
		Student stu2 = new Student("김갑순", "0118", 90, 100, 85);
		array_student.add(stu2);
		// 사용자가 선택할 번호
		int choice = 0;
		System.out.println("======== 학생 관리 프로그램 ========");
		// choice가 4면 종료
		while (choice != 4) {
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램종료 >> ");
			choice = sc.nextInt();
			
			if (choice == 1) {
				// 학생 정보 입력
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String number = sc.next();
				System.out.print("Java점수 : ");
				int scoreJava = sc.nextInt();
				System.out.print("Web점수 : ");
				int scoreWeb = sc.nextInt();
				System.out.print("Androiod점수 : ");
				int scoreAndroid = sc.nextInt();
				// 학생 객체 생성
				Student stu = new Student(name, number, scoreJava, scoreWeb, scoreAndroid);
				// 배열에 객체 추가
				array_student.add(stu);
				
			} else if (choice == 2) {
				// 전체 학생 출력
				allStudent(array_student);
				
			} else if (choice == 3) {
				System.out.print("검색 할 학생이름 >> ");
				String name = sc.next();
				System.out.println("==================학생검색==================");
				System.out.println("이름 \t 학번 \t Java \t Web \t Android");
				printLine();
				// name이 배열에 없는 경우 -> true 결과를 담을 변수
				boolean res = false;
				// 배열에서 name과 일치하는 인덱스 찾기
				for (int i = 0; i < array_student.size(); i++) {					
					if (array_student.get(i).getName().equals(name)) {
						// i번 인텍스 배열 출력
						printStudent(array_student, i);
						break;
					}
					res = true;
				}
				// 학생이 없는 경우 출력
				if (res) {						
					System.out.println("학생 정보가 없습니다.");
				}
				printLine();
			} else if (choice == 4) {
				// 종료
				printLine();
				System.out.println("학점 관리 프로그램을 종료합니다.");
				printLine();
			}else {
				System.out.println("번호를 확인하세요.");
			}
		}
	}
	
	// array_student 배열의 i번 학생 출력
	public static void printStudent(ArrayList<Student> array_student, int i) {
		System.out.println(array_student.get(i).getName() + 
				"\t" + array_student.get(i).getNumber() +
				"\t" + array_student.get(i).getScoreJava() + 
				"\t" + array_student.get(i).getScoreWeb() + 
				"\t" + array_student.get(i).getScoreAndroid());
	}
	
	// array_student 배열 전체 학생 조회
	public static void allStudent(ArrayList<Student> array_student) {
		System.out.println("==================전체조회==================");
		System.out.println("이름 \t 학번 \t Java \t Web \t Android");
		printLine();
		for (int i = 0; i < array_student.size(); i++) {
			printStudent(array_student, i);
		}
		printLine();
	}

	// 라인 출력
	public static void printLine() {
		System.out.println("==========================================");
	}
}
