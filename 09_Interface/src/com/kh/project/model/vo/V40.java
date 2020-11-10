package com.kh.project.model.vo;

public class V40 extends SmartPhone implements NotePen{
	// 생성자부
	public V40(){
		setMaker("LG");
	}
	//메서드부

	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}

	@Override
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public boolean bluethootPen() {
		return false;
	}

	@Override
	public String printInformation() {
		String tmp ="V40는 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "블루투스 펜 탑재 여부 : "+bluethootPen();
		return tmp;
	}
	
	
}
