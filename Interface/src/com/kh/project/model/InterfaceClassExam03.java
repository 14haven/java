package com.kh.project.model;

// Exam01 �ڽ�Ŭ���� 2
public class InterfaceClassExam03 
			extends InterfaceClassExam01  
				implements Interface01,Interface02{
	public void exam03Mehtod01() {
		System.out.println("Exam01 �ڽ� 2");
		System.out.println(PI); // PI�� Interface01�� ����ʵ�� ������ ��� ����
		method0101(); // method0101�� Interface01�� ����Ʈ�޼ҵ��̱� ������ ��� ����
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
	public void method0201() { //Interface02�� �ִ� method0101�� ���� �ʹٸ� �̸��� �ٲ���� �Ѵ�.
		// TODO Auto-generated method stub
		Interface02.super.method0101();
	}
	
}
