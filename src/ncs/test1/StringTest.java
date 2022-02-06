package ncs.test1;

public class StringTest {

	public static void main(String[] args) {
		
		/* 문제1. 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
		 * 
		 * 주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 
		 * 단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다. */
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		// str에서 데이터를 분리한다.
		String[] st;
		st = str.split(",");
		
		// for ~ each 문 사용한다. (향상된 for문)
		for(int i = 0; i < st.length; i++) {
			
			// 배열에 실수 데이터를 넣는다.
			data[i] = Double.parseDouble(st[i]);
			
			// 배열 데이터의 합을 구한다.
			sum += data[i];
			
		}
		
		double avg = sum / data.length;
		
		// 결과 값을 출력한다.
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
