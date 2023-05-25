package for_;

/*
for문을 활용하여 1 부터 100까지의 정수 중 
3의 배수의 총합을 구하는 코드를 작성하세요
*/

public class test3 {
	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				num += i;
			}
			System.out.println("3의 배수의 총합 : "+num);
		}
	}

}
