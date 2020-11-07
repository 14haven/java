package com.kh.project.model;

// Exam01 자식 클래스 1
public class InterfaceClassExam02 	
			extends InterfaceClassExam01 
					implements Interface01 {
	public void exam02Mehtod01() {
		System.out.println("Exam01 자식 1");
		Interface01.method0102();
	}



	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}
	// 인터페이스의 디폴트 메소드를 재정의(오버라이딩)
	@Override
	public void method0101() {
		System.out.println("Exam02 method0101");
	}
}
