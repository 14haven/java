package com.kh.project.model.vo;

public class Avante extends Car {
	// �����ں�
	public Avante() {} // �⺻������
	public Avante(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// �޼����
	// �������̵�
	public void startUp() {
		System.out.println("Ű�� ������ �õ��� �̴ϴ�. �θ���~~");
	}
	public void gearChange() {
		System.out.println("���븦 ��� ���Ʒ��� �����Դϴ�.");
	}
	public void windowControl() {
		System.out.println("�����̸� ��� �����ϴ�.");
	
	}

	}


