package ncs.test8;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// Generics 적용된 맵 객체를 선언 할당한다.
		Map<String, Inventory> hmap = new HashMap<String, Inventory>();
		
		// 상품명을 키로 사용하여 저장 처리 한다.
		hmap.put("삼성 갤럭시 S7", new Inventory("삼성 갤럭시 S7", new GregorianCalendar(2016, 3-1, 15).getTime(), 30));
		hmap.put("LG G5", new Inventory("LG G5", new GregorianCalendar(2016, 2-1, 25).getTime(), 20));
		hmap.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new GregorianCalendar(2016, 1-1, 23).getTime(), 15));
		
		// 맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		Set<Map.Entry<String, Inventory>> set = hmap.entrySet();
		
		Iterator<Map.Entry<String, Inventory>> entryIter = set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Inventory> entry = entryIter.next();
			System.out.println(entry.getValue());
		}
		System.out.println();
		
		// 맵에 기록된 정보를 Inventory[]로 변환한 다음
		// 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다. 예외처리함
		// 변경된 Inventory[]의 정보를 모두 출력한다.
		Inventory[] arr = new Inventory[hmap.size()];
		
		int cnt = 0;
		for(Entry<String, Inventory> e : hmap.entrySet()) {
			System.out.println(e.getValue());
			arr[cnt++] = e.getValue();
		}
		
		// 1. 향상된 for문 사용
		System.out.println("----------------------- 출고 수량 10 적용 시 -----------------------");
		for(Inventory iv : arr) {
			
			try {
		
				iv.setGetDate(new Date());
				iv.setGetAmount(10);
				System.out.println(iv);
		
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("------------------------ 출고 수량 부족 시 ------------------------");
		for(Inventory iv : arr) {
			
			try {
		
				iv.setGetDate(new Date());
				iv.setGetAmount(25);
				System.out.println(iv);
		
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
		}
		
		// 2. for문 사용
		System.out.println("----------------------- 출고 수량 10 적용 시 -----------------------");
		for(int i = 0; i < arr.length; i++) {
			try {
				
				arr[i].setGetDate(new Date());
				arr[i].setGetAmount(10);
				System.out.println(arr[i]);
				
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("------------------------ 출고 수량 부족 시 ------------------------");
		for(int i = 0; i < arr.length; i++) {
			
			try {
				
				arr[i].setGetDate(new Date());
				arr[i].setGetAmount(25);
				System.out.println(arr[i]);
				
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
