package com.kh.project.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	// 필드부
	private String maker;	// 제조사 정보
	// 생성자부
	public SmartPhone() {
		// 기본 생성자
	}
	// 메소드부
	public abstract String printInformation();
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return this.maker;
	}
}
