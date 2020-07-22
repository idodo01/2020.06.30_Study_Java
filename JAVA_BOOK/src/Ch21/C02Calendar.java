package Ch21;

import java.util.Calendar;

public class C02Calendar {
	public static void main(String[] args) {
		// getInstance()�� Ŭ���� �̸����� ������ ������ static�޼����̴�
		Calendar now = Calendar.getInstance();
		
		// ��, ��, ��
		int year = now.get(Calendar.YEAR);
		// MONTH�� 0���� �����ؼ� +1���ֱ�
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+","+month+","+day);
		
		
		// ����
		// DAY_OF_WEEK�� �Ͽ��Ϻ��� 1
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String strWeek = "";
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek="��";
				break;
			case Calendar.TUESDAY:
				strWeek="ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek="��";
				break;
			case Calendar.THURSDAY:
				strWeek="��";
				break;
			case Calendar.FRIDAY:
				strWeek="��";
				break;
			case Calendar.SATURDAY:
				strWeek="��";
				break;
			case Calendar.SUNDAY:
				strWeek="��";
				break;
		}
		System.out.println(strWeek);
		
		
		// ���� ���� ���
		int ampm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		System.out.println(strAmPm);
		
		
		// ��, ��, ��
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		
		// ��� ���
		System.out.printf(year+"�� ");
		System.out.printf(month+"�� ");
		System.out.printf(day+"�� ");
		System.out.printf(strAmPm+" ");
		System.out.printf(hour+"�� ");
		System.out.printf(minute+"�� ");
		System.out.printf(second+"�� ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}