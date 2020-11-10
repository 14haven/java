package com.kh.project.controller;

import com.kh.project.model.vo.GalaxyNote9;
import com.kh.project.model.vo.Phone;
import com.kh.project.model.vo.SmartPhone;
import com.kh.project.model.vo.V40;

public class PhoneController {
	// 필드부
	private String[] result = new String[2];
	// 메소드부
	public String[] method() {
		Phone[] ph = new Phone[2];	// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		ph[0] = new GalaxyNote9();	// 인덱스에 다형성을 적용하여 GalaxyNote9  객체 저장
		ph[1] = new V40();			// 인덱스에 다형성을 적용하여 V40 객체 저장
		
		/* 부모 참주변수에 자식 객체를 담은 경우
		 *  - 부모 참조변수만을 이요해서는 자식 객체에서 생성된 멤버에 접근 불가능
		 *	- 다운캐스팅을 통해서 접근 가능 
		 */
		// 실체화된 객체로 다운캐스팅
//		((GalaxyNote9)ph[0]).printInformation();
//		((V40)ph[1]).printInformation();
//		// 해당 멤버가 선언된 부모 클래스로 다운캐스팅
//		((SmartPhone)ph[0]).printInformation();
//		((SmartPhone)ph[1]).printInformation();
		for(int i=0; i< ph.length; i++) {
			// 방법 1
			//	result[i] = ((SmartPhone)ph[i]).printInformation();
			// 방법2
			if(ph[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)ph[i]).printInformation();
			}else if(ph[i] instanceof V40) {
				result[i] = ((V40)ph[i]).printInformation();
			}
		}
		return result;	//임시
	}

}
