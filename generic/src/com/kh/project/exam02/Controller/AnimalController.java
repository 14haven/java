package com.kh.project.exam02.Controller;

import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

// ������
//public class AnimalController {
//	// ������ ��Ʈ�� �ϰ� ���� �� ���� ��ü�� �θ� �� ���� 
//	// ȣ���̰� ���ָ� ���Ŵ�, ����̰� ���ָ� ���Ŵ� �� �� ȣ���̵� ��ü ����� ����̵� ��ü ��������
//	// � �� ȣ���̰� �ǰ� � �� ����̰� �ǰ�
//	
//	public Animal ani;
//	public Beer bg = new Beer();
//	public AnimalController() {}
//	public AnimalController(Animal ani) {
//		this.ani = ani;
//	}

// ���׸�
//	public class AnimalController<T>{
//		public T ani;
//		public Beer bg = new Beer();
//		public AnimalController() {}
//		public AnimalController(T ani) { 
//			this.ani = ani;
//		}
// ���׸� - ���ϵ�ī��
//	public class AnimalController<T extends Animal>{
//		public Animal ani; 	// Tiger��  Cat ��ü�� ��� ���� �θ�Ŭ���� ��������(������ ����)
//		public Beer bg = new Beer();
//		public AnimalController() {}
//		public AnimalController(Animal<? super Number > ani) { // ?=> ����ڿ��� �ѱ�� ������
//			this.ani = ani;
//			}

// ���׸� - ���ϵ� ī��
	public class AnimalController{
//		// Tiger�� Cat ��ü�� ���� ���ؼ��� ���� �� Ŭ������ ���������� ���� �ּҸ� �����ϰ� ����ؾ� ��
//		public Tiger tg;
//		public Cat ca;
//		// ������ �����ε�
//		public AnimalController() {}
//		public AnimalController(Tiger ani) {
//			this.tg = ani;
//				}
//		public AnimalController(Cat ani) {
//			this.ca = ani;
//		}
		
		//---------------------------------------
		// Tiger�� Cat ��ü�� �������� �θ�Ŭ������ Animal Ŭ������ ���������� ����� �ּҸ� �����ؼ� ���
		public Animal ani; 	// Tiger��  Cat ��ü�� ��� ���� �θ�Ŭ���� ��������(������ ����)
		// ������
		public AnimalController(Animal<?> ani) {
			this.ani = ani;
		}
		public Beer bg = new Beer();

		}
	

