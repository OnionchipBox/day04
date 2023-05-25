package for_;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		  반복문
		  - for( 초기값; 조건식; 증감식){
		  			종속문장;
		  		}
		  - 사용조건
		  	- 규칙적으로 연산이 이루어지는 경우
		  	- 동일코드가 반복 된다면
		 */
		int num=0, sum=0;
		
		for(num = 1; num <= 10; num++) { // for(num은 1이다; num은 10보다 작거나 같다; num은 1씩 증가한다)
			sum = sum + num;
		}
		System.out.println(sum+", num : "+num);
		
	}

}
