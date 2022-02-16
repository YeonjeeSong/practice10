package ncs.test9;

public class Goods {

	private String name;
	private int price;
	private int quantity;
	
	/* 기본 생성자 */
	public Goods() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/* setters/getters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/* 모든 필드값들을 문장으로 만들어 리턴 */
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
