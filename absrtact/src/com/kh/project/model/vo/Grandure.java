package com.kh.project.model.vo;

public class Grandure extends Car{
	// 생성자부
	public Grandure() {} // 기본생성자
	public Grandure(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// 메서드부
	public void startUp() {
		System.out.println("시동버튼을 눌러 시동을 겁니다. 부우웅~~");
	}
	public void gearChange() {
		System.out.println("버튼을 눌러 기어를 변경합니다.");
	}
	public void windowControl() {
		System.out.println("버튼을 눌러 창문을 제어합니다.");
	}
}
