package ncs.test10;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 4973296860562099534L;
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	/* 기본 생성자 */
	public Book() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	/* setters/getters */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/* 모든 필드값들을 문장으로 만들어 리턴 */
	@Override
	public String toString() {
		return title + ", " + author + ", " + publisher + ", " + price +"원, " 
				+ (int) (discountRate * 100) +"% 할인";
	}
	
}
