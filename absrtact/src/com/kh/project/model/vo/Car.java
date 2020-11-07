package com.kh.project.model.vo;

public abstract class Car {
	// �ʵ��
	private String wheel;	// ����
	private String engine;	// ����
	private String exhaust;	// �����
	private String chair;	// ����
	// �����ں�
	public Car() {}
	public Car(String wheel,String engine,String exhaust,String chair) {
		this.wheel = wheel;
		this.engine = engine;
		this.exhaust = exhaust;
		this.chair = chair;
	}
	// �޼����
	// �õ��ɱ� - �߻� �޼ҵ�
	public abstract void startUp();
	// â������ - �߻� �޼ҵ�
	
	public abstract void windowControl() ;
	// ���� - �߻�޼ҵ�
	public abstract void gearChange();
		

	public String toString() {
		return "���� : "+wheel+", ���� : "+engine+", ����� : "+exhaust+", ���� : "+chair;
	}
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getExhaust() {
		return exhaust;
	}
	public void setExhaust(String exhaust) {
		this.exhaust = exhaust;
	}
	public String getChair() {
		return chair;
	}
	public void setChair(String chair) {
		this.chair = chair;
	}
}

