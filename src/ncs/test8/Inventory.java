package ncs.test8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {

	private String productName;		// 상품명
	private Date putDate;			// 입고일
	private Date getDate;			// 출고일
	private int putAmount;			// 입고 수량
	private int getAmount;			// 출고 수량
	private int inventoryAmount;	// 재고 수량
	
	/* 기본 생성자 */
	public Inventory() {}

	/* 매개변수 있는 생성자 - 상품명, 입고일, 입고 수량 초기화
	 * 					  재고 수량은 입고 수량으로 지정한다. */
	public Inventory(String productName, Date putDate, int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	/* 출고 날짜 지정 */
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	/* 출고 수량 지정한 다음, 재고 수량 지정 (입고 수량 – 출고 수량) 
	 * 단, 출고 수량이 입고 수량보다 많을 경우 AmountNotEnough 예외 발생 시킨다. */
	public void setGetAmount(int getAmount) throws AmountNotEnough {
		this.getAmount = getAmount;
		
		// this.inventoryAmount = putAmount
		if(this.getAmount > this.inventoryAmount) {
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		}
		this.inventoryAmount -= this.getAmount;
	}
	
	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	/* 모든 필드값들을 문장으로 만들어 리턴 - 단, 날짜 데이터는 SimpleDateFormat을 적용*/
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		String putDate = this.putDate == null? null + ", " : sdf.format(this.putDate) + " 입고, ";
		String getDate = this.getDate == null? null + ", " : sdf.format(this.getDate) + "출고, ";
		
		return this.productName + ", " + putDate + this.putAmount + "개, " 
				+ getDate + this.getAmount + "개, 재고 " + this.inventoryAmount + "개";
	}
	
}
