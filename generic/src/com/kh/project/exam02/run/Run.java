package com.kh.project.exam02.run;

import com.kh.project.exam02.Controller.AnimalController;
import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

public class Run {

	public static void main(String[] args) {
//		// �������� �̿��ؼ� ���� ��ü ���
//		AnimalController ac1 = new AnimalController(new Tiger());
//		AnimalController ac2 = new AnimalController(new Cat());
//		ac1.ani.move(); // �θ� Ŭ������ �ִ� ���� �� ������
//		ac2.ani.move();	// �θ� Ŭ������ �ִ� ���� �� ������
//		//ac1.ani.speak();	//speak() �޼���� �ڽĿ��� ������� �޼����̱� ������ ���� �Ұ�
//		if(ac1.ani instanceof Tiger)
//			((Tiger)(ac1.ani)).speak(); // �ٿ�ĳ������ �̿��ؼ� �����ؾ���
//		else if(ac1.ani instanceof Cat) 
//			((Cat)(ac1.ani)).speak();
		
		// ���׸��� �̿��ؼ� ���� ��ü ���
		// ������ Ÿ�Կ� ������� 
		// new Tiger() -> �ּҰ� �Ѱ��ִ� ��
//		AnimalController<Tiger> ac1 = new AnimalController(new Tiger());
//		ac1.ani.move();	// �θ� Ŭ������ �ִ� ���� �� �����
//		ac1.ani.speak();// �ڽ� Ŭ������ �޼ҵ嵵 �� �����
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
		// Tiger�� �̿��ؼ� ��ü�� ������ ���� T,A ���ٰ� �����ϱ� ���׸� �ΰ� �Ѱ���� �Ѵ�
		
		
	
	}

}
