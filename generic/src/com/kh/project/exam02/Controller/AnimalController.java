package com.kh.project.exam02.Controller;

import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

// 다형성
//public class AnimalController {
//	// 동물을 컨트롤 하고 싶을 때 여러 객체를 부를 수 있음 
//	// 호랑이가 맥주를 마신다, 고양이가 맥주를 마신다 할 때 호랑이도 객체 만들고 고양이도 객체 만들어야함
//	// 어떨 땐 호랑이가 되고 어떨 땐 고양이가 되게
//	
//	public Animal ani;
//	public Beer bg = new Beer();
//	public AnimalController() {}
//	public AnimalController(Animal ani) {
//		this.ani = ani;
//	}

// 제네릭
//	public class AnimalController<T>{
//		public T ani;
//		public Beer bg = new Beer();
//		public AnimalController() {}
//		public AnimalController(T ani) { 
//			this.ani = ani;
//		}
// 제네릭 - 와일드카드
//	public class AnimalController<T extends Animal>{
//		public Animal ani; 	// Tiger와  Cat 객체를 담기 위한 부모클래스 참조변수(다형성 구현)
//		public Beer bg = new Beer();
//		public AnimalController() {}
//		public AnimalController(Animal<? super Number > ani) { // ?=> 사용자에게 넘기고 싶을때
//			this.ani = ani;
//			}

// 제네릭 - 와일드 카드
	public class AnimalController{
//		// Tiger와 Cat 객체를 쓰기 위해서는 원래 각 클래스의 참조변수를 만들어서 주소를 저장하고 사용해야 함
//		public Tiger tg;
//		public Cat ca;
//		// 생성자 오버로딩
//		public AnimalController() {}
//		public AnimalController(Tiger ani) {
//			this.tg = ani;
//				}
//		public AnimalController(Cat ani) {
//			this.ca = ani;
//		}
		
		//---------------------------------------
		// Tiger와 Cat 객체를 쓰기위해 부모클래스인 Animal 클래스의 참조변수를 만들고 주소를 저장해서 사용
		public Animal ani; 	// Tiger와  Cat 객체를 담기 위한 부모클래스 참조변수(다형성 구현)
		// 생성자
		public AnimalController(Animal<?> ani) {
			this.ani = ani;
		}
		public Beer bg = new Beer();

		}
	

