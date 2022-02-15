package ncs.test8;

public class AmountNotEnough extends Exception {

	/* 기본 생성자 */
	public AmountNotEnough() {}
	
	/* 메시지 받아 부모생성자로 전달하는 매개변수 있는 생성자 */
	public AmountNotEnough(String message) {
		super(message);
	}
	
}
