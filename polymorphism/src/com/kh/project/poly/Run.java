package com.kh.project.poly;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		// �⺻���� ��ü ��� ���
		// �ش� Ŭ������ �̿��ؼ� ���������� �����, ��ü�� �ּҸ� ��Ƽ� ���
		// �� ��ü�� ���������� �̿��ؼ� ����� ����
		Cat c = new Cat();
		Dog d = new Dog();
		Rabbit r = new Rabbit();
		
		c.walk();
		c.speak();
		c.eat();
		
		
		d.walk();
		d.eat();
		d.speak();
		
		r.walk();
		r.eat();
		r.speak();
		
		
		// �� ĳ����
		// ��Ӱ����� ���, �θ�Ŭ������ ���������� �����, �ڽ� ��ü�� �ּҸ� ��Ƽ� ���
		// �θ� ���������� �̿��ؼ� �� ��ü�� ����� ������ �����ϴ�.
		Animal ani;
		ani =  new Cat();
		ani.walk();
		ani.eat();
		ani.speak();
		
		ani = new Dog();
		ani.walk();
		ani.eat();
		ani.speak();
		
		ani = new Rabbit();
		ani.walk();
		ani.eat();
		ani.speak();
		
		// ��ü �迭�� ������
		Animal [] aniArr2 = new Animal[3];
		aniArr2[0] = new Cat();
		aniArr2[1] = new Dog();
		aniArr2[2] = new Rabbit();
		
		for(int i=0; i<aniArr2.length ; i++) {
			aniArr2[i].walk();
			aniArr2[i].eat();
			aniArr2[i].speak();
			// �ٿ�ĳ���� ����
//			if(i==0) {
//				((Cat)aniArr2[i]).grumming();
//			} else if(i==1) {
//				((Dog)aniArr2[i]).protect();
//			} else if (i==2) {
//				((Rabbit)aniArr2[i]).jump();
//			}
			
			//instacneof ������ // ���������� �̿��ؼ� ���������� ����Ű�� ��ü�� �������� �˾Ƴ��� ������
			if(aniArr2[i] instanceof Cat) { //i ��°�� ����Ű�°� Cat�̴�? ������ true ��ȯ, �ƴϸ� false ��ȯ
				((Cat)aniArr2[i]).grumming();
			} else if(aniArr2[i] instanceof Dog) {
				((Dog)aniArr2[i]).protect();
			} else if (aniArr2[i] instanceof Rabbit) {
				((Rabbit)aniArr2[i]).jump();
			}
		}
		

		
		
		// �Ű����� ������
		ZooController zoo = new ZooController();
//		zoo.catBehaivor();
//		zoo.dogBehavior();
//		zoo.rabbitBehavior();
		
		
		zoo.behavior(new Cat()); // ��ü�� �����ؼ� ���ڰ����� �Ѱ���
		zoo.behavior(new Dog());
		zoo.behavior(new Rabbit());
		
		
		
		// �ٿ� ĳ����
		
		
//		Scanner scan = new Scanner(System.in);
//		Animal a ;
//		System.out.println("==== ������ ====");
//		System.out.println("1. �����");
//		System.out.println("2. ������");
//		System.out.println("3. �䳢");
//		System.out.println("4. ������");
//		System.out.print("� ������ ���� �����Ű���?");
//		int select = scan.nextInt();
//		switch(select) {
//		case 1:
//			a = new Cat();
//			((Cat)a).grumming();
//			break;
//		case 2:
//			a = new Dog();
//			((Dog)a).protect();
//			break;
//		case 3:
//			a = new Rabbit();
//			((Rabbit)a).jump();
//			break;
//		case 4:
//			return;
//		default:
//				System.out.println("�߸� �����ϼ̽��ϴ�.");
//				a = new Animal();
//		}
//		a.walk();
//		a.eat();
//		a.speak();
		
		
//		Animal a = new Animal();
//		a.eat();
//		a.speak();
//		a.walk();
//		Cat c = new Cat();
//		c.grumming();
//		c.eat();
//		c.speak();
//		c.walk();
//		
//		Animal ac ; // Animal ���� ���������� �ڽ� Ŭ���� ��ü ���
//		ac = new Cat();
//		ac.eat();
//		ac.speak();
//		ac.walk();
//		
//		ac = new Dog();
//		ac.eat();
//		ac.speak();
//		ac.walk();
//		
//		ac = new Rabbit();
//		ac.eat();
//		ac.speak();
//		ac.walk();
//		// � ��ü�� ����Ŀ� ���� ����Ǵ� ����� �޶�����.
		
	}

}
