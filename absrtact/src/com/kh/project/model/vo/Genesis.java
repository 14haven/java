package com.kh.project.model.vo;

public class Genesis extends Car {
	// �����ں�
	public Genesis() {} // �⺻������
	public Genesis(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// �޼����
	public void startUp() {
		System.out.println("�������� �̿��ؼ� �õ��� �̴ϴ�. �ο����~~");
	}
	public void gearChange() {
		System.out.println("��ư�� ���� �� �����մϴ�.");
	}
	public void windowControl() {
		System.out.println("�������� ��ġ�� â���� ���� �մϴ�.");
	}
}
