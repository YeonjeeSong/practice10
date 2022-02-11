package ncs.test5;

public abstract class Employee {

	protected String name;
	protected int number;
	protected String department;	// 부서
	protected int salary;			// 월급
	
	/* 기본 생성자 */
	public Employee() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	/* setters/getters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/* 모든 필드값들을 문장으로 만들어 리턴 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", department=" + 
				department + ", salary=" + salary + "]";
	}
	
	/* 세금을 계산해서 리턴 */
	public abstract double tax();

}
