package com.kh.project.model.vo;

public interface CellPhone extends Phone,Camera { // 인터페이스는 다중 상속이 가능하다.
	public abstract String charge();	// 충전 방식
	
}
