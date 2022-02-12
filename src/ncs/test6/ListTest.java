package ncs.test6;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// 명시한 사용 데이터를 list에 기록한다.
		while(list.size() < 10) {
			list.add((int) (Math.random() * 100) + 1);
		}
		
		// display() 메소드를 호출한다.
		ListTest lt = new ListTest();
		System.out.print("정렬 전 : ");
		lt.display(list);
		
		// list의 데이터를 내림차순 정렬한다.
		/* 원본을 유지하기 위해 새로운 ArrayList를 만들어서 인자로 넘겨 준다. */
		List<Integer> descList = new ArrayList<>(list);
		descList.sort(new Descending());
		
		// display() 메소드를 호출한다.
		System.out.println();
		System.out.print("정렬 후 : ");
		lt.display(descList);

	}
	
	// display() 메소드를 구현한다.
	public void display(List list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
