package com.kh.project.run;

public class Run {
	public static void main(String[] args) {
		String s1 = "Hello"; // ���ڿ��� ��üó�� �ٸ� ������ ����ȴ�.
		System.out.println(System.identityHashCode(s1)); // ���� �� ������ �ּҸ� �˷��޶�
		s1 = "hihi";
		System.out.println(System.identityHashCode(s1));
		String ss1 = new String("�ȳ�"); // ��ü���� ����ڴ�
		System.out.println(System.identityHashCode(ss1));
		ss1 = "bye"; 
		System.out.println(System.identityHashCode(ss1));

		
		
	}

}
