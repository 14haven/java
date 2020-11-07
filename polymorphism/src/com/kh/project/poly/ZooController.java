package com.kh.project.poly;

public class ZooController {
	// 필드부
	private Animal ani;
	
	// 생성자부
	// 메서드부
	private Cat c;
	private Dog d;
	private Rabbit r;
	

	
	public void catBehaivor(Animal a){ //고양이가 하는 행동에 대해서는 따로 만들어 놓고
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}
	public void dogBehavior(Animal a){ //강아지가 하는 행동에 대해서는 따로 또 만들어 놓고
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}
	public void rabbitBehavior(Animal a){ // 토끼가 하는 행도에 대해서 또 따로 만들어 놓는다.
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}


	// 메소드의 매개변수 부분에서 객체의 주소를 받아서 사용하는 경우
	// 여러 자식 객체의 주소를 받아야 할 경우, 부모 클래스의 참조변수를 만들어서 받아줄 수 있음
	public void behavior(Animal ani) {
		this.ani = ani;
		ani.walk();
		ani.eat();
		ani.speak();
				
	}
}
