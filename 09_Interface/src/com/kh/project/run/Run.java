package com.kh.project.run;

import com.kh.project.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] tmpArr = pc.method();
		for(int i=0; i<tmpArr.length ; i++) {
			System.out.println(tmpArr[i]);
			System.out.println();
		}

	}

}
