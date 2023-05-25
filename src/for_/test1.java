package for_;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		int sum = 0;
		System.out.print("숫자 입력 : ");
		num = input.nextInt();
		if(num >= 1){
			for(sum = 1; sum <= 9;sum++) {
				System.out.println(num+"*"+sum+"="+(num*sum));
			}
		}
		else{
			System.out.println("반드시 1~9 사이의 숫자만 입력하세요");
			}
		}
	}

