package com.kh.project.poly;

// �θ� Ŭ����
public abstract class Animal {
	// �ʵ��
	private String eye;
	private String nose;
	private String mouth;
	
	// �����ں�
	public Animal () {
		System.out.println("Animal ��ü ����");
	}
	// �޼����
	public void eat() {
		System.out.println("�Դ�");	
	}
	
	// �߻� �޼���(��ü�� ���� �̿ϼ� �޼���) - �ڽ� Ŭ�������� �� ���� �� ���
	public abstract void speak() ;
	
	public void walk() {
		System.out.println("�ȴ�");
	}
	
}
