package com.kh.project.model;

public interface Interface02 {
	void method02();
	
	default void method0101() {
		System.out.println("인터페이스02의 디폴트 메소드"); // 인터페이스 안에 실제로 구현이 돼있는 것
	}
}
