package ncs.test10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {
		
		BookListTest test10 = new BookListTest();
		List<Book> list = new ArrayList<Book>();
		
		// Book 객체를 3개 생성하여 리스트에 넣는다.
		test10.storeList(list);
		
		// books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다.
		test10.saveFile(list);
		
		// books.dat 파일에 기록된 객체들을 읽어서 Book 객체에 기록하고,
		// Book 객체를 리스트에 담아 리턴
		List<Book> booksList = test10.loadFile();
		
		// 리스트에 저장된 객체 정보를 출력 (for each 문 사용)
		test10.printList(booksList); 

	}
	
	// Book 객체를 3개 생성하여 리스트에 넣는다.
	public void storeList(List<Book> list) {
		
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	// books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다.
	public void saveFile(List<Book> list) {
		
		/* 객체 단위로 입출력을 하기 위한 Stream : ObjectInputStream / ObjectOutputStream */
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("books.dat")));
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	// books.dat 파일에 기록된 객체들을 읽어서 Book 객체에 기록하고,
	// Book 객체를 리스트에 담아 리턴
	public List<Book> loadFile(){
		
		List<Book> booksList = null;
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("books.dat")));
			
			booksList = (List<Book>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return booksList;
	}
	
	// 리스트에 저장된 객체 정보를 출력 (for each 문 사용)
	// 할인된 가격은 booksList에 기록된 객체 정보를 사용하여 getter로 계산 출력한다.
	public void printList(List<Book> list) {
		for(Book b : list) {
			System.out.println(b);
			System.out.println("할인된 가격 : " + (int) (b.getPrice() * (1 - b.getDiscountRate())) + "원");
		}
	}

}
