package ncs.test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		
		/* 문제2. 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
		 * 
		 * GregorianCalendar 클래스를 사용하여, 현재 년도와 비교한 나이를 계산하고 생일의 요일을 출력 한다.
		 * 출력시 SimpleDateFormat 을 사용하여 출력한다. */
		
		/* 생일 날짜 구하기 */
		/* Calendar 클래스 : abstract 클래스 => 다형성 이용 */
		int year = 1987;
		int month = 4;
		int dayOfMonth = 27;
		
		Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth);
		
		/* 특정 일자를 기준으로 한 Date 타입의 객체 필요한 경우
		 * => 1. GregorianCalendar 이용해 특정 날짜/시간 정보로 객체 생성
		 * 	  2. 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서 long형으로 반환하는 메소드  */
		//System.out.println(birthDay.getTimeInMillis());	// 549036000000
		
		/* 출력된 정수로 객체를 생성하면 해당 날짜/시간 정보를 가지는 Date 객체가 된다. */
		Date date = new Date(birthDay.getTimeInMillis());
		
		//System.out.println(date);	// Wed May 27 00:00:00 KDT 1987
		
		String day = "";
		switch(birthDay.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY : day = "일"; break;
		case Calendar.MONDAY : day = "월"; break;
		case Calendar.TUESDAY : day = "화"; break;
		case Calendar.WEDNESDAY : day = "수"; break;
		case Calendar.THURSDAY : day = "목"; break;
		case Calendar.FRIDAY : day = "금"; break;
		case Calendar.SATURDAY : day = "토"; break;
		}
		
		System.out.println("생일 : " + birthDay.get(Calendar.YEAR) + "년 " + birthDay.get(Calendar.MONTH) + "월 " 
							+ birthDay.get(Calendar.DATE) + "일 " + day + "요일");
		
		/* 현재 날짜 구하기 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		
		Date today = new Date();
		
		String todayTime = sdf1.format(today);
		
		System.out.println("현재 : " + todayTime);
		
		/* 나이 구하기 */
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		
		Date present = new Date();
		
		int presentTime = Integer.parseInt(sdf2.format(present));
		
		int birthTime = birthDay.get(Calendar.YEAR);
		
		System.out.println("나이 : 만 " + (presentTime - birthTime - 1) + " 세");

	}

}
