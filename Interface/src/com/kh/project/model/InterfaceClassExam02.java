package com.kh.project.model;

// Exam01 �ڽ� Ŭ���� 1
public class InterfaceClassExam02 	
			extends InterfaceClassExam01 
					implements Interface01 {
	public void exam02Mehtod01() {
		System.out.println("Exam01 �ڽ� 1");
		Interface01.method0102();
	}



	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}
	// �������̽��� ����Ʈ �޼ҵ带 ������(�������̵�)
	@Override
	public void method0101() {
		System.out.println("Exam02 method0101");
	}
}
