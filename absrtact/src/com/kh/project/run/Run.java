package com.kh.project.run;

import com.kh.project.model.vo.*;
import com.kh.project.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		//Avante c = new Avante();
//		Avante c = new Avante("³×¹ÙÄû","2000cc","»çÁ¦","°¡Á×ÀÇÀÚ");
//		System.out.println(c.toString());
//		c.startUp();
//		c.gearChange();
//		c.windowControl();
//		Grandure cc = new Grandure();
//		cc.startUp();
//		cc.gearChange();
//		cc.windowControl();
		
		Car[] c = new Car[5]; 
		c[0] = new Avante();
		c[1] = new Grandure();
		c[2] = new Genesis();
		c[3] = new Grandure();
		c[4] = new Avante();
		
		for(int i=0; i<c.length ; i++) {
			c[i].startUp();
			c[i].gearChange();
			c[i].windowControl();
		}
	}

}
