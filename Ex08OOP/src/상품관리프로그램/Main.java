package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Product를 관리할 배열 arrayPd 생성
		ArrayList<Product> arrayPd = new ArrayList<>();
		// 확인용 가 데이터
		Product pd1 = new Product("usb", 22000, 4);
		arrayPd.add(pd1);  // arrayPd[0]
		Product pd2 = new Product("커피", 3100, 7);
		arrayPd.add(pd2);  // arrayPd[1]
		
		// 사용자 선택 번호
		int choice = 0;
		while (choice != 3) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				// 사용자로부터 입력받은 물건 정보 객체 생성
				Product pd = new Product(name, unitPrice, amount);
				// 객체 배열에 추가
				arrayPd.add(pd);
								
			} else if (choice == 2) {
				System.out.println("====== 판매 예상 금액 ======");
				// 판매 예상액을 담을 변수 선언
				int total = totalPd(arrayPd);
				System.out.println("판매 시 매출 : " + total + "원");
				System.out.println("=========================");
			} else if (choice == 3) {
				System.out.println("프로그램 종료");
			} else {
				System.out.println("1~3번만 입력해 주세요.");
			}
		}
		
	}

	public static int totalPd(ArrayList<Product> arrayPd) {
		System.out.println("물건이름 \t 단가 \t 수량");
		System.out.println("=========================");
		int total = 0;
		for (int i = 0; i < arrayPd.size(); i++) {
			System.out.println(arrayPd.get(i).getName() + "\t" + 
					arrayPd.get(i).getUnitPrice() + "\t" + 
					arrayPd.get(i).getAmount());
			// 판매 예상액 합하기
			total += (arrayPd.get(i).getUnitPrice() * arrayPd.get(i).getAmount());
		}
		System.out.println("=========================");
		return total;
	}
}
