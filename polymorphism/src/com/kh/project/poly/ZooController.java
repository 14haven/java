package com.kh.project.poly;

public class ZooController {
	// �ʵ��
	private Animal ani;
	
	// �����ں�
	// �޼����
	private Cat c;
	private Dog d;
	private Rabbit r;
	

	
	public void catBehaivor(Animal a){ //����̰� �ϴ� �ൿ�� ���ؼ��� ���� ����� ����
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}
	public void dogBehavior(Animal a){ //�������� �ϴ� �ൿ�� ���ؼ��� ���� �� ����� ����
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}
	public void rabbitBehavior(Animal a){ // �䳢�� �ϴ� �൵�� ���ؼ� �� ���� ����� ���´�.
		ani = a;
		ani.walk();
		ani.eat();
		ani.speak();
	}


	// �޼ҵ��� �Ű����� �κп��� ��ü�� �ּҸ� �޾Ƽ� ����ϴ� ���
	// ���� �ڽ� ��ü�� �ּҸ� �޾ƾ� �� ���, �θ� Ŭ������ ���������� ���� �޾��� �� ����
	public void behavior(Animal ani) {
		this.ani = ani;
		ani.walk();
		ani.eat();
		ani.speak();
				
	}
}
