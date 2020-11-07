package com.kh.project.poly;

// 부모 클래스
public abstract class Animal {
	// 필드부
	private String eye;
	private String nose;
	private String mouth;
	
	// 생성자부
	public Animal () {
		System.out.println("Animal 객체 생성");
	}
	// 메서드부
	public void eat() {
		System.out.println("먹다");	
	}
	
	// 추상 메서드(몸체가 없는 미완성 메서드) - 자식 클래스에서 재 정의 후 사용
	public abstract void speak() ;
	
	public void walk() {
		System.out.println("걷다");
	}
	
}
