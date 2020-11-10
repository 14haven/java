package com.kh.project.run;

public class Run {
	public static void main(String[] args) {
		String s1 = "Hello"; // 문자열은 객체처럼 다른 영역에 저장된다.
		System.out.println(System.identityHashCode(s1)); // 실제 그 공간의 주소를 알려달라
		s1 = "hihi";
		System.out.println(System.identityHashCode(s1));
		String ss1 = new String("안녕"); // 객체공간 만들겠다
		System.out.println(System.identityHashCode(ss1));
		ss1 = "bye"; 
		System.out.println(System.identityHashCode(ss1));

		
		
	}

}
