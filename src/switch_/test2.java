package switch_;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		boolean test = true;
		String home="";
		String name="";
		
		
		while(test) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			System.out.print("입력 : ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("집주소 입력 : ");
				home = input.next();
				break;
			case 2:
				System.out.print("2.회사 등록 : ");
				name = input.next();
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+name);
				test = false;
				
			}
		}
		
		
	}

}
