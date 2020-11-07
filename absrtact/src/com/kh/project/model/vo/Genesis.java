package com.kh.project.model.vo;

public class Genesis extends Car {
	// 생성자부
	public Genesis() {} // 기본생성자
	public Genesis(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// 메서드부
	public void startUp() {
		System.out.println("리모콘을 이용해서 시동을 겁니다. 부우우우웅~~");
	}
	public void gearChange() {
		System.out.println("버튼을 눌러 기어를 변경합니다.");
	}
	public void windowControl() {
		System.out.println("제어판을 터치해 창문을 제어 합니다.");
	}
}
