package ncs.test5;

public class Secretary extends Employee implements Bonus {

	/* 기본 생성자 */
	public Secretary() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	/* 인센티브 지급 - pay의 80%가 기존 salary에 더해진다. */
	@Override
	public void incentive(int pay) {
		System.out.println(super.getSalary() + (pay * 0.8));
	}

	/* 세금을 계산해서 리턴 - salary에 10% 적용 */
	@Override
	public double tax() {
		return super.getSalary() * 0.1;
	}
	
}
