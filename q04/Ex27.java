package com.test.question.q04;

import java.util.Calendar;
import java.util.Date;

public class Ex27 {
	
	public static void main(String[] args) {
		
		//Ex27_DateTime.java
		
		//자바 자료형
		// - 숫자형, 논리형, 문자형
		// - 문자열, 날짜시간형
		
		//날짜 시간형
		//1. Date 클래스(구경만.. legacy)
		//2. Calendar 클래스(*****)
		//3. 다음 세대 클래스
		
		/*
		
		
		1. 시간
			- 양
		2. 시각
			- 포인트
		
		ex) 2020-10-20 10:43:15 -> 시간 or 시각(O)
		ex) 8시간 -> 시간(O)
		
		
		
		날짜/시간 연산
		
		틱(Tick), 에포크(Epoch), 타임 스탬프 : 특정 시각으로부터 흐른 누적 시간
		
		시각 + 시각 : X
		시각 - 시각 = 시간 : O
		시각 * 시각 : X
		시각 / 시각 : X
		
		시간 + 시간 = 시간 : O
		시간 - 시간 = 시간 : O
		시간 * 시간 : X
		시간 / 시간 : X
		
		시각 + 시간 = 시각 : O
		시각 - 시간 = 시각 : O
		시각 * 시간 : X
		시각 / 시간 : X
				
		*/
				
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		
	}//main
	

	private static void m6() {
		
		//시간 + 시간 = 시간
		//2:10 + 1:30 = 3:40
		
		//시간 계산 -> Calendar 사용 금지 -> int 변수 사용O
		
		//8시간입니다.
//		Calendar c1 = Calendar.getInstance();
//		c1.set(Calendar.HOUR_OF_DAY, 8);
//		
//		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
//		System.out.printf("%tF %tT\n", c1, c1);
//				
//		System.out.println(c1.get(Calendar.DATE));
		
		
		
		//2:10 + 30 = 2:40
		//2:30 + 50 = 2:80 -> 3:20
		
		int hour = 2;
		int min = 30;
		
		min = min + 50;
		
		//단위 재정비(자리 올림)
		hour = hour + (min / 60);
		min = min % 60;
		
		System.out.printf("%d:%d\n", hour, min);
		
	}


	private static void m5() {
		
		//시각 - 시각 = 시간
		
		//내가 태어난지 며칠이 지났는지?
		
		//현재
		Calendar now = Calendar.getInstance();
		
		//생일
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 9, 20, 12, 0, 0);
		
		//System.out.println(now - birthday);
		
		//tick
		long nowTick = now.getTimeInMillis();
		//System.out.println(nowTick);
		
		long birthdayTick = birthday.getTimeInMillis();
		
		
		long gap = nowTick - birthdayTick;
		System.out.println(gap); // 789,020,360,981ms
		
		System.out.println(gap / 1000 / 60 / 60 / 24);
		
		
		
		//올해 크리스마스가 며칠 남았는지?
		Calendar christmas = Calendar.getInstance();
		christmas.set(2020, 11, 25, 0, 0, 0);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("올해 크리스마스는 %d일 남았습니다.\n"
						, (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		
	}


	private static void m4() { //***
		
		//날짜시간 연산
		// - void add(int, int)
		
		//시각 + 시간
		System.out.println("-----------m4-------------------------");
		Calendar now = Calendar.getInstance();
		
		now.add(Calendar.DATE, 100); //덮어쓰기(수정)
		
		System.out.printf("%tF\n", now);
		
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MINUTE, 45);
		
		System.out.printf("%tT\n", now);
		
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.HOUR, 3);
		
		System.out.printf("%tT\n", now);
		
		
		
		
		//시각 - 시간
		
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -7); //빼기
		System.out.printf("%tF\n", now);
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MONTH, -3);
		System.out.printf("%tF\n", now);
		
		System.out.println("--------------------------------------");
		
	}


	private static void m3() {
		
		//1. 현재 시각 만들기
		//2. 특정 시각 만들기
		
		//현재 시각
		Calendar now = Calendar.getInstance();
		
		//2020-10-20
		System.out.printf("%d-%d-%d\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		
		
		//15:08:10
		//15:8:5
		System.out.printf("%d:%d:%d\n"
							, now.get(Calendar.HOUR_OF_DAY)
							, now.get(Calendar.MINUTE)
							, now.get(Calendar.SECOND));
		
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.printf("%s:%s:%s\n"
						, hour < 10 ? "0" + hour : hour + ""
						, min < 10 ? "0" + min : min + ""
						, sec < 10 ? "0" + sec : sec + "");
		
		
		System.out.printf("%02d:%02d:%02d\n"
							, hour
							, min
							, sec);
		
		
		//2020-10-20
		//15:08:10
		
		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);
		
		
		
		
		//내 생일
		Calendar birthday = Calendar.getInstance();
		
		//수정
		// - void set(int, int)
		// - void set(int, int, int)
		// - void set(int, int, int, int, int, int)
		
		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 5);
		birthday.set(Calendar.DATE, 10);
		
		System.out.printf("%tF\n", birthday);
		
		
		birthday.set(1998, 10, 25);
		
		System.out.printf("%tF\n", birthday);
		
		
		birthday.set(1995, 2, 10, 12, 30, 45);
		
		System.out.printf("%tF %tT\n", birthday, birthday);
		
		
	}


	private static void m2() {
		
		//현재 시각 얻어오기
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1);
		//java.util.GregorianCalendar[time=1603163211789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=6,SECOND=51,MILLISECOND=789,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		
		//Calendar 값에 들어있는 여러 데이터 중 원하는 항목만 가져오는 방법
		// - int get(int)
		
		System.out.println(c1.get(1)); //년(2020)
		System.out.println(c1.get(2)); //월
		System.out.println(c1.get(3)); //몇주차
		
		int year = 1;
		System.out.println(c1.get(year)); //가독성
		
		//캘린더 변수(상수)
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); 
		
		//결론
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println();
		
		//자주 쓰는 요소 출력
		System.out.println(c1.get(Calendar.YEAR)); //2020
		System.out.println(c1.get(Calendar.MONTH)); //0~11
		System.out.println(c1.get(Calendar.DATE)); //20
		System.out.println(c1.get(Calendar.HOUR)); //0(12시)
		System.out.println(c1.get(Calendar.MINUTE)); //19
		System.out.println(c1.get(Calendar.SECOND)); //44
		System.out.println(c1.get(Calendar.MILLISECOND)); //419(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); //오전(0), 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //20, 일
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //294, 올해 며칠
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //3, 이번주 며칠 -> 요일
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //12 -> 12시(24시)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //43 -> 올해 몇주차
		
		
		//요구사항] 오늘은 '2020년 10월 20일입니다.' 출력
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
							, c1.get(Calendar.YEAR)
							, c1.get(Calendar.MONTH) + 1
							, c1.get(Calendar.DATE));
		
		
		
		
		
	}


	//가독성 + 코드 관리
	public static void m1() {
		
		//Date or Calendar
		
		
		//현재 컴퓨터의 시각을 가져오시오.
		Date d1 = new Date();
		
		System.out.println(d1);
		
	}

}
