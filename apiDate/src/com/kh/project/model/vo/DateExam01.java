package com.kh.project.model.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateExam01 {
	// Date 클래스
	public void method01() {
		Date dt = new Date();
		System.out.println(dt.toString()); // 문자열 형태
		System.out.println(dt); // 객체 형태 
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(dt));
		// String dt1 = dt.toString(); // 문자열 형태로 가지고 와라
	}
	// Calender 클래스
	public void method02() {
		Calendar today = Calendar.getInstance(); // Calendar의 static 메소드를 실행 시킨 것
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH));
		
		LocalDateTime ldt = LocalDateTime.now(); // 그대로 쓰면서 now -> static 메소드로 만들어져있다.
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// 내가 원하는 날짜 형태로 만들어주고 싶을 때
		ld = LocalDate.of(1992, 4, 11);
		System.out.println(ld);
		
		Formatter f = new Formatter(System.out);
		f.format("%d %f %s 로 출력할 서식 지정", 10, 3.5, "Hello");
		
		
	}
}
