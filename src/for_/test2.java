package for_;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("반복할 횟수 입력 : ");
		int t = input.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < t; i++) {
			System.out.print("a값 입력 : ");
			a = input.nextInt();
			System.out.print("b값 입력 : ");
			b = input.nextInt();
			System.out.println("a + b : "+(a+b));
			
		}
		input.close();
		
	}

}
