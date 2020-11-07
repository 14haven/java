package com.kh.project.poly;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		// 기본적인 객체 사용 방법
		// 해당 클래스를 이용해서 참조변수를 만들고, 객체의 주소를 담아서 사용
		// 각 객체의 참조변수를 이용해서 멤버에 접근
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
		
		
		// 업 캐스팅
		// 상속관계일 경우, 부모클래스로 참조변수를 만들고, 자식 객체의 주소를 담아서 사용
		// 부모 참조변수를 이용해서 각 객체의 멤버에 접근이 가능하다.
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
		
		// 객체 배열과 다형성
		Animal [] aniArr2 = new Animal[3];
		aniArr2[0] = new Cat();
		aniArr2[1] = new Dog();
		aniArr2[2] = new Rabbit();
		
		for(int i=0; i<aniArr2.length ; i++) {
			aniArr2[i].walk();
			aniArr2[i].eat();
			aniArr2[i].speak();
			// 다운캐스팅 적용
//			if(i==0) {
//				((Cat)aniArr2[i]).grumming();
//			} else if(i==1) {
//				((Dog)aniArr2[i]).protect();
//			} else if (i==2) {
//				((Rabbit)aniArr2[i]).jump();
//			}
			
			//instacneof 연산자 // 참조변수를 이용해서 참조변수가 가리키는 객체가 무엇인지 알아내는 연산자
			if(aniArr2[i] instanceof Cat) { //i 번째가 가리키는게 Cat이니? 맞으면 true 반환, 아니면 false 반환
				((Cat)aniArr2[i]).grumming();
			} else if(aniArr2[i] instanceof Dog) {
				((Dog)aniArr2[i]).protect();
			} else if (aniArr2[i] instanceof Rabbit) {
				((Rabbit)aniArr2[i]).jump();
			}
		}
		

		
		
		// 매개변수 다형성
		ZooController zoo = new ZooController();
//		zoo.catBehaivor();
//		zoo.dogBehavior();
//		zoo.rabbitBehavior();
		
		
		zoo.behavior(new Cat()); // 객체를 생성해서 인자값으로 넘겨줌
		zoo.behavior(new Dog());
		zoo.behavior(new Rabbit());
		
		
		
		// 다운 캐스팅
		
		
//		Scanner scan = new Scanner(System.in);
//		Animal a ;
//		System.out.println("==== 동물원 ====");
//		System.out.println("1. 고양이");
//		System.out.println("2. 강아지");
//		System.out.println("3. 토끼");
//		System.out.println("4. 나가기");
//		System.out.print("어떤 동물을 보고 싶으신가요?");
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
//				System.out.println("잘못 선택하셨습니다.");
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
//		Animal ac ; // Animal 형의 참조변수에 자식 클래스 객체 담기
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
//		// 어떤 객체를 담느냐에 따라 실행되는 결과가 달라진다.
		
	}

}
