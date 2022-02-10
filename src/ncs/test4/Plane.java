package ncs.test4;

public abstract class Plane {

	protected String planeName;
	protected int fuelSize;
	
	/* 기본 생성자 */
	public Plane() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	/* 일정 양의 연료 주입 */
	public void refuel(int fuel) {
		//fuelSize = fuelSize + fuel;
		fuelSize += fuel;
	}

	/* setters/getters */
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	/* 모든 필드값들을 문장으로 만들어 리턴 */
	@Override
	public String toString() {
		return "Plane [planeName=" + planeName + ", fuelSize=" + fuelSize + "]";
	}
	
	/* 일정 거리 만큼 운항, 연료 감소됨
	 * 추상 메소드로 하위 객체에서 반드시 구현해야 함 */
	public abstract void flight(int distance);
	
}
