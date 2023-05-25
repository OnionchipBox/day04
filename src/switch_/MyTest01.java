package switch_;

import java.util.Scanner;

public class MyTest01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num,age;
		int mon = 0;
		boolean fir = true;
		String name = "";
		
		while(fir) {
		System.out.println("========================================");
		System.out.println("1.계좌 개설 2.계좌 조회 3.입출금 오픈 4.종료");
		System.out.println("========================================");
		System.out.print(">>> ");
		age = input.nextInt();
		switch(age) {
		case 1:
			System.out.print("계좌주 입력 : ");
			name = input.next();
			System.out.println("");
			break;
		case 2:
			System.out.println("\n현재 등록된 계좌 : "+name+" 님의 계좌\n");
			break;
		case 3:
			while(true) {
				System.out.println("=========================");
				System.out.println("1.입금 2.출금 3.잔액조회 4.돌아가기");
				System.out.println("=========================");
				System.out.print(">>> ");
				num = input.nextInt();
			 
				if(num == 1) {
					System.out.print("입금하실 금액 입력 : ");
					int plu = input.nextInt();
					mon += plu;
					System.out.println("잔액 : "+mon);
					
				}
				else if(num == 2) {
					System.out.print("출금하실 금액 입력 : ");
					int dor = input.nextInt();
					mon -= dor;
					System.out.println("잔액 : "+mon);
					
				}
				else if(num == 3) {
					System.out.println("현재 잔액 : "+mon+"원");
					
				}
				else if(num == 4) {
					System.out.println("이전으로 돌아갑니다");
					break;
				}
			 }
			continue;
		case 4:
			System.out.println("시스템을 종료합니다");
			fir = false;								
	}
	}
	}
}