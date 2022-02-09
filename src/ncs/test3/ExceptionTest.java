package ncs.test3;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		/* 문제3. 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
		 * 
		 * 2부터 5까지의 정수형 데이터 만을 키보드로 입력 받아 1부터 입력 받은 수까지의 합을 출력 한다.
		 * 단, 입력 받은 수가 2부터 5까지의 범위를 벋어나면 “입력 값에 오류가 있습니다.”라고 출력하고
		 * 프로그램을 종료한다. */
		
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하세요 : ");
		int data = sc.nextInt();
		
		try {
			
			double sum = cal.getSum(data);
			System.out.println(sum);
			
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}

	}

}
