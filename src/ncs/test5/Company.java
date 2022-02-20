package ncs.test5;

public class Company {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[2];
		
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다.
		Secretary secretary = new Secretary("Hilery", 1, "secretary", 800);
		Sales sales = new Sales("Clinton", 2, "sales", 1200);
		employees[0] = secretary;
		employees[1] = sales;
		
		// 모든 객체의 기본 정보를 출력한다. (for문을 이용하여 출력한다.)
		System.out.println("name      department   salary");
		System.out.println("-------------------------------");
		for(int i = 0; i < employees.length; i++) {
			if(i == 0) {
				System.out.println(employees[i].getName() + "    " + employees[i].getDepartment() + 
									"     " + employees[i].getSalary());
			} else if(i == 1) {
				System.out.println(employees[i].getName() + "   " + employees[i].getDepartment() + 
									"         " + employees[i].getSalary());
			}
		}
		
		// 출력 결과가 가독성이 좋진 않지만 더 깔끔한 코드
		System.out.println();
		for(Employee e : employees) {
			System.out.println(e.getName() + "    " + e.getDepartment() + "     " + e.getSalary());
		}
		
		// 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고, 다시 객체의 salary에 넣는다.
		/* 800 + (100 * 0.8) = 880 / 1200 + (1200 * 1.2) = 1320 */
		employees[0].setSalary(880);
		employees[1].setSalary(1320);
		
		System.out.println("\n인센티브 100 지급");
		// 모든 객체의 정보와 세금을 출력한다. (for문을 이용하여 출력한다.)
		System.out.println("name      department   salary     tax");
		System.out.println("----------------------------------------");
		for(int i = 0; i < employees.length; i++) {
			if(i == 0) {
				System.out.println(employees[i].getName() + "    " + employees[i].getDepartment() + 
									"     " + employees[i].getSalary() + "      " + secretary.tax());
			} else if(i == 1) {
				System.out.println(employees[i].getName() + "   " + employees[i].getDepartment() + 
									"         " + employees[i].getSalary() + "     " + sales.tax());
			}
		}
		
		// 출력 결과가 가독성이 좋진 않지만 더 깔끔한 코드
		System.out.println();
		for(Employee e : employees) {
			System.out.print(e.getName() + "    " + e.getDepartment() + "     " + e.getSalary() + "      ");
			if( e instanceof Secretary) {
				System.out.println(((Secretary)e).tax());
			} else {
				System.out.println(((Sales)e).tax());
			}
		}

	}

}
