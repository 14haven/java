package com.kh.project.model.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateExam01 {
	// Date Ŭ����
	public void method01() {
		Date dt = new Date();
		System.out.println(dt.toString()); // ���ڿ� ����
		System.out.println(dt); // ��ü ���� 
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(dt));
		// String dt1 = dt.toString(); // ���ڿ� ���·� ������ �Ͷ�
	}
	// Calender Ŭ����
	public void method02() {
		Calendar today = Calendar.getInstance(); // Calendar�� static �޼ҵ带 ���� ��Ų ��
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH));
		
		LocalDateTime ldt = LocalDateTime.now(); // �״�� ���鼭 now -> static �޼ҵ�� ��������ִ�.
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// ���� ���ϴ� ��¥ ���·� ������ְ� ���� ��
		ld = LocalDate.of(1992, 4, 11);
		System.out.println(ld);
		
		Formatter f = new Formatter(System.out);
		f.format("%d %f %s �� ����� ���� ����", 10, 3.5, "Hello");
		
		
	}
}
