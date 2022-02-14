package ncs.test7;

public class Fruit {

	private String name;
	private int price;
	private int quantity;
	
	/* 기본 생성자 */
	public Fruit() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public Fruit(String name, int price, int quantity) {
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

	/* 모든 필드값 문자열 합치기 하여 리턴 */
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
