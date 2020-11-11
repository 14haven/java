package com.kh.project.exam02.run;

import com.kh.project.exam02.Controller.AnimalController;
import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

public class Run {

	public static void main(String[] args) {
//		// 다형성을 이용해서 여러 객체 사용
//		AnimalController ac1 = new AnimalController(new Tiger());
//		AnimalController ac2 = new AnimalController(new Cat());
//		ac1.ani.move(); // 부모 클래스에 있는 내용 잘 실행함
//		ac2.ani.move();	// 부모 클래스에 있는 내용 잘 실행함
//		//ac1.ani.speak();	//speak() 메서드는 자식에서 만들어진 메서드이기 때문에 접근 불가
//		if(ac1.ani instanceof Tiger)
//			((Tiger)(ac1.ani)).speak(); // 다운캐스팅을 이용해서 접근해야함
//		else if(ac1.ani instanceof Cat) 
//			((Cat)(ac1.ani)).speak();
		
		// 제네릭을 이용해서 여러 객체 사용
		// 데이터 타입에 상관없이 
		// new Tiger() -> 주소값 넘겨주는 것
//		AnimalController<Tiger> ac1 = new AnimalController(new Tiger());
//		ac1.ani.move();	// 부모 클래스에 있는 내용 잘 실행됨
//		ac1.ani.speak();// 자식 클래스의 메소드도 잘 실행됨
//		
//		AnimalController<Cat> ac2 = new AnimalController(new Cat());
//		ac2.ani.move();
//		ac2.ani.speak();
		
		//AnimalController<Beer> ac3 = new AnimalController(new Beer());
		
		Animal<Integer> ani1 = new Animal<Integer>(10);
		Animal<Double> ani2 = new Animal<Double>(1.5);
		
		//AnimalController ac1 = new AnimalController(new Animal<Integer>(10));
		AnimalController ac2 = new AnimalController(new Animal<Number>(1.5));
		//AnimalController ac3 = new AnimalController(new Animal<String>("Hello"));
		AnimalController ac4 = new AnimalController(new Tiger<Integer,Integer>());
		// Tiger를 이용해서 객체를 생성할 때는 T,A 쓴다고 했으니까 제네릭 두개 넘겨줘야 한다
		
		
	
	}

}
