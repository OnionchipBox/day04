package switch_;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		
	/*
	 	switch(값){
	 	case 1: 종속문장. break;
	 	case 2: 종속문장. break;
	 	default : 종속문장.
	 	}
	 */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("입력할 달 : ");
		
		num = input.nextInt();
		
		switch(num) {
			case 12: case 1: case 2: System.out.println("겨울");
				break;
			case 3: case 4: case 5: System.out.println("봄");
				break;
			case 6: case 7: case 8: System.out.println("여름");
				break;
			case 9: case 10: case 11: System.out.println("가을");
				break;
			default: System.out.println("해당 월은 없습니다");
		}
		
		System.out.println("계절 입력 완료");
		
		
		
		
		
		
	}
}
