package switch_;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		boolean test = true;
		
		while(test) {
			System.out.print("날짜 입력 : ");
			num = input.nextInt();
			switch(num%7) {
			case 1:
				System.out.println(num+": 월요일");
				break;
			case 2:
				System.out.println(num+": 화요일");
				break;
			case 3:
				System.out.println(num+": 수요일");
				break;
			case 4:
				System.out.println(num+": 목요일");
				break;
			case 5:
				System.out.println(num+": 금요일");
				break;
			case 6:
				System.out.println(num+": 토요일");
				break;
			case 0:
				System.out.println(num+": 일요일");
				break;
			default:
				if(num > 32) {
					System.out.println("31이하의 숫자를 입력하시오");
				test = false;
				}	
			}
		}
		
		
		
//		switch(num) {
//		case 1: case 8: case 15: case 22: case 29:
//			System.out.println(num+": 월요일");
//			break;
//		case 2: case 9: case 16: case 23: case 30:
//			System.out.println(num+": 화요일");
//			break;
//		case 3: case 10: case 17: case 24: case 31:
//			System.out.println(num+": 수요일");
//			break;
//		case 4: case 11: case 18: case 25:
//			System.out.println(num+": 목요일");
//			break;
//		case 5: case 12: case 19: case 26:
//			System.out.println(num+": 금요일");
//			break;
//		case 6: case 13: case 20: case 27:
//			System.out.println(num+": 토요일");
//			break;
//		case 7: case 14: case 21: case 28:
//			System.out.println(num+": 일요일");
//			break;
//		}
		
	
		
	}

}
