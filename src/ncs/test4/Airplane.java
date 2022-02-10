package ncs.test4;

public class Airplane extends Plane {

	/* 기본 생성자 */
	public Airplane() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	/* 일정 거리 만큼 운항, 연료 감소
	 * 10 운항 시, 연료 30 감소 */
	@Override
	public void flight(int distance) {
		
		super.setFuelSize(super.getFuelSize() - (3 * distance));
		
	}
	
}
