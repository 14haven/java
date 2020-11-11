package com.kh.project.exam01.model.vo;

// 제네릭 적용 전 클래스
//public class GenericExam01 {
//	// 필드부
//	public int var1;
//	public int var2;
//	// 생성자부
//	public GenericExam01() {}
//	public GenericExam01(int var1, int var2) {
//		this.var1 = var1;
//		this.var2 = var2;
//		
//	}
//}

// 제네릭 전용
public class GenericExam01<T,M> { //나 제네릭 쓸게, 제네릭 쓰는 부분은 T라고 적을게
	// 필드부
	public T var1;
	public M var2;
	
	// 생성자부
	public GenericExam01() {}
	public GenericExam01(T var1, M var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	// 메소드부
	public <A> A method01(A num) { //이 메소드를 사용할 때 A라는 타입을 사용할거임 리턴타입도 A고 매개변수도 A
		return num;
	}
	

	
}