package com.kh.project.model.vo;

public class Grandure extends Car{
	// �����ں�
	public Grandure() {} // �⺻������
	public Grandure(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// �޼����
	public void startUp() {
		System.out.println("�õ���ư�� ���� �õ��� �̴ϴ�. �ο��~~");
	}
	public void gearChange() {
		System.out.println("��ư�� ���� �� �����մϴ�.");
	}
	public void windowControl() {
		System.out.println("��ư�� ���� â���� �����մϴ�.");
	}
}
