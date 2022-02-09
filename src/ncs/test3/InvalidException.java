package ncs.test3;

public class InvalidException extends Exception {

	/* 기본 생성자 */
	public InvalidException() {}
	
	/* 메시지 받아 부모생성자로 전달하는 매개변수 있는 생성자 */
	public InvalidException(String message) {
		super(message);
	}
	
}
