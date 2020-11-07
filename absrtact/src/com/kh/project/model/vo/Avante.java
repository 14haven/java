package com.kh.project.model.vo;

public class Avante extends Car {
	// 생성자부
	public Avante() {} // 기본생성자
	public Avante(String wheel,String engine,String exhaust,String chair) {
		super(wheel, engine, exhaust, chair);
	}
	// 메서드부
	// 오버라이딩
	public void startUp() {
		System.out.println("키를 돌려서 시동을 겁니다. 부르릉~~");
	}
	public void gearChange() {
		System.out.println("막대를 잡고 위아래로 움직입니다.");
	}
	public void windowControl() {
		System.out.println("손잡이를 잡고 돌립니다.");
	
	}

	}


