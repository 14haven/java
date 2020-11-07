package com.kh.project.model;

public interface Interface01 {
	// 상수 필드
	// 사용법 : [public static final] 자료형 필드명 = 값;
	// - [public static final] 생략 가능으로 써도 되고 안써도 됨 (동일한 결과)
	// - 인터페이스는 초기화 블록, 생성자를 사용할 수 없기 때문에 반드시 선언과 동시에 초기값을 지정해야 함
	double PI = 3.1415;
	// 추상 메소드
	// 사용법 : [public abstract] 반환자료형 메소드명(매개변수);
	// - [public abstract] 생략 가능으로 써도 되고 안 써도 됨 (동일한 결과)
	void method01(); // 인터페이스 상속하는애들 무조건 method01이 있어야 한다.
	
	
	// 디폴트 메소드
	// - 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서 허용됨
	// - 인터페이스에 선언되지만 실제로는 객체가 가지고 있는 인스턴스 메소드가 됨
	// 		- 실제로는 해당 인터페이스를 포함한 클래스의 멤버 메소드가 됨
	// 사용법 : default 반환자료형 메소드명(매개변수);
	default void method0101() {
		System.out.println("인터페이스01의 디폴트 메소드"); // 인터페이스 안에 실제로 구현이 돼있는 것
	}
	
	// 정적 메소드
	// - 디폴트 메소드와 달리 객체가 없어도 인터페이스만으로 호출이 가능
	// 사용법 : [public] static 반환자료형 메소드명(매개변수);
	// - [public]을 생략해도 컴파일 시 자동으로 붙여 줌
	static void method0102() {
		System.out.println("인터페이스01의 정적 메소드");
	}

}
