package com.kh.project.model;

// Exam01 자식클래스 2
public class InterfaceClassExam03 
			extends InterfaceClassExam01  
				implements Interface01,Interface02{
	public void exam03Mehtod01() {
		System.out.println("Exam01 자식 2");
		System.out.println(PI); // PI는 Interface01의 상수필드기 때문에 사용 가능
		method0101(); // method0101은 Interface01의 디폴트메소드이기 때문에 사용 가능
 }

	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method0101() {
		// TODO Auto-generated method stub
		Interface01.super.method0101();
	}
	public void method0201() { //Interface02에 있는 method0101도 쓰고 싶다면 이름을 바꿔줘야 한다.
		// TODO Auto-generated method stub
		Interface02.super.method0101();
	}
	
}
