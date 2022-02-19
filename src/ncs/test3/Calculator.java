package ncs.test3;

public class Calculator {

	public double getSum(int data) throws InvalidException {
		
		/* 1부터 data까지의 합을 계산
		 * data가 2부터 5까지의 범위를 벗어나면 InvalidException 발생 시킨다. */
		
		double sum = 0;
		
		if(2 <= data && data <= 5) {
			for(int i = 1; i <= data; i++) {
				sum += i;
			}
		} else {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		return sum;
		
	}
	
}
