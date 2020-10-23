package com.test.question.q04;

import java.util.Calendar;
import java.util.Date;

public class Ex27 {
	
	public static void main(String[] args) {
		
		//Ex27_DateTime.java
		
		//�ڹ� �ڷ���
		// - ������, ����, ������
		// - ���ڿ�, ��¥�ð���
		
		//��¥ �ð���
		//1. Date Ŭ����(���游.. legacy)
		//2. Calendar Ŭ����(*****)
		//3. ���� ���� Ŭ����
		
		/*
		
		
		1. �ð�
			- ��
		2. �ð�
			- ����Ʈ
		
		ex) 2020-10-20 10:43:15 -> �ð� or �ð�(O)
		ex) 8�ð� -> �ð�(O)
		
		
		
		��¥/�ð� ����
		
		ƽ(Tick), ����ũ(Epoch), Ÿ�� ������ : Ư�� �ð����κ��� �帥 ���� �ð�
		
		�ð� + �ð� : X
		�ð� - �ð� = �ð� : O
		�ð� * �ð� : X
		�ð� / �ð� : X
		
		�ð� + �ð� = �ð� : O
		�ð� - �ð� = �ð� : O
		�ð� * �ð� : X
		�ð� / �ð� : X
		
		�ð� + �ð� = �ð� : O
		�ð� - �ð� = �ð� : O
		�ð� * �ð� : X
		�ð� / �ð� : X
				
		*/
				
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		
	}//main
	

	private static void m6() {
		
		//�ð� + �ð� = �ð�
		//2:10 + 1:30 = 3:40
		
		//�ð� ��� -> Calendar ��� ���� -> int ���� ���O
		
		//8�ð��Դϴ�.
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
		
		//���� ������(�ڸ� �ø�)
		hour = hour + (min / 60);
		min = min % 60;
		
		System.out.printf("%d:%d\n", hour, min);
		
	}


	private static void m5() {
		
		//�ð� - �ð� = �ð�
		
		//���� �¾�� ��ĥ�� ��������?
		
		//����
		Calendar now = Calendar.getInstance();
		
		//����
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
		
		
		
		//���� ũ���������� ��ĥ ���Ҵ���?
		Calendar christmas = Calendar.getInstance();
		christmas.set(2020, 11, 25, 0, 0, 0);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("���� ũ���������� %d�� ���ҽ��ϴ�.\n"
						, (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		
	}


	private static void m4() { //***
		
		//��¥�ð� ����
		// - void add(int, int)
		
		//�ð� + �ð�
		System.out.println("-----------m4-------------------------");
		Calendar now = Calendar.getInstance();
		
		now.add(Calendar.DATE, 100); //�����(����)
		
		System.out.printf("%tF\n", now);
		
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MINUTE, 45);
		
		System.out.printf("%tT\n", now);
		
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.HOUR, 3);
		
		System.out.printf("%tT\n", now);
		
		
		
		
		//�ð� - �ð�
		
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -7); //����
		System.out.printf("%tF\n", now);
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MONTH, -3);
		System.out.printf("%tF\n", now);
		
		System.out.println("--------------------------------------");
		
	}


	private static void m3() {
		
		//1. ���� �ð� �����
		//2. Ư�� �ð� �����
		
		//���� �ð�
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
		
		
		
		
		//�� ����
		Calendar birthday = Calendar.getInstance();
		
		//����
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
		
		//���� �ð� ������
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1);
		//java.util.GregorianCalendar[time=1603163211789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=6,SECOND=51,MILLISECOND=789,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		
		//Calendar ���� ����ִ� ���� ������ �� ���ϴ� �׸� �������� ���
		// - int get(int)
		
		System.out.println(c1.get(1)); //��(2020)
		System.out.println(c1.get(2)); //��
		System.out.println(c1.get(3)); //������
		
		int year = 1;
		System.out.println(c1.get(year)); //������
		
		//Ķ���� ����(���)
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); 
		
		//���
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println();
		
		//���� ���� ��� ���
		System.out.println(c1.get(Calendar.YEAR)); //2020
		System.out.println(c1.get(Calendar.MONTH)); //0~11
		System.out.println(c1.get(Calendar.DATE)); //20
		System.out.println(c1.get(Calendar.HOUR)); //0(12��)
		System.out.println(c1.get(Calendar.MINUTE)); //19
		System.out.println(c1.get(Calendar.SECOND)); //44
		System.out.println(c1.get(Calendar.MILLISECOND)); //419(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); //����(0), ����(1)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //20, ��
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //294, ���� ��ĥ
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //3, �̹��� ��ĥ -> ����
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //12 -> 12��(24��)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //43 -> ���� ������
		
		
		//�䱸����] ������ '2020�� 10�� 20���Դϴ�.' ���
		System.out.printf("������ %d�� %d�� %d���Դϴ�.\n"
							, c1.get(Calendar.YEAR)
							, c1.get(Calendar.MONTH) + 1
							, c1.get(Calendar.DATE));
		
		
		
		
		
	}


	//������ + �ڵ� ����
	public static void m1() {
		
		//Date or Calendar
		
		
		//���� ��ǻ���� �ð��� �������ÿ�.
		Date d1 = new Date();
		
		System.out.println(d1);
		
	}

}
