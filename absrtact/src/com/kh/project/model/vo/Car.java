package com.kh.project.model.vo;

public abstract class Car {
	// 필드부
	private String wheel;	// 바퀴
	private String engine;	// 엔진
	private String exhaust;	// 배기통
	private String chair;	// 의자
	// 생성자부
	public Car() {}
	public Car(String wheel,String engine,String exhaust,String chair) {
		this.wheel = wheel;
		this.engine = engine;
		this.exhaust = exhaust;
		this.chair = chair;
	}
	// 메서드부
	// 시동걸기 - 추상 메소드
	public abstract void startUp();
	// 창문제어 - 추상 메소드
	
	public abstract void windowControl() ;
	// 기어변경 - 추상메소드
	public abstract void gearChange();
		

	public String toString() {
		return "바퀴 : "+wheel+", 엔진 : "+engine+", 배기통 : "+exhaust+", 의자 : "+chair;
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

