package ncs.test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		// 명시한 사용 데이터를 prop에 기록한다.
		p.setProperty("1", "apple,1200,3");
		p.setProperty("2", "banana,2500,2");
		p.setProperty("3", "grape,4500,5");
		p.setProperty("4", "orange,800,10");
		p.setProperty("5", "melon,5000,2");
		
		// fileSave() 메소드를 호출한다.
		PropTest pt = new PropTest();
		pt.fileSave(p);
		
		// fileOpen() 메소드를 호출한다.
		pt.fileOpen(p);

	}
	
	// fileSave() 메소드를 구현한다.
	public void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "fileSave");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// fileOpen() 메소드를 구현한다.
	public void fileOpen(Properties p) {
		
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// “data.xml” 파일의 내용을 읽어들여, Fruit[]에 기록하고, 배열을 출력되게 처리한다.
		// 단, 출력시 키(key)에 대해 오름차순 정렬 처리해서 출력한다.
		
		/* 1. 오름 차순 정렬을 위한 ascList 선언 & Iterator로 요소 읽어 오기 */
		List<String> ascList = new ArrayList<>();
		
		Iterator<Object> iter = p.keySet().iterator();
		
		while(iter.hasNext()) {
			ascList.add((String) iter.next());
		}
		
		/* 2. Collections.sort() 이용해 오름차순 정렬 */
		Collections.sort(ascList);
		
		/* 3. Fruit[]에 기록 */
		Fruit[] arr = new Fruit[p.size()];
		
		// ascList를 for문으로 split하는 것은 복잡, 향상된 for문 이용하는 것이 더 간단
		int cnt = 0;
		for(String key : ascList) {
			
			// 데이터 분리하기
			String[] st = p.getProperty(key).split(",");
			
			// 데이터 배열에 저장
			arr[cnt] = new Fruit(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]));
			
			// 출력
			System.out.println(key + " = " + arr[cnt].getName() + ", " 
			+ arr[cnt].getPrice() + "원, " + arr[cnt].getQuantity() + "개");
			
			cnt++;
		}
		
	}

}
