package com.kh.project.exam01.run;

import com.kh.project.exam01.model.vo.GenericExam01;

public class Run {

	public static void main(String[] args) {
//		/* 제네릭 전용 전 클래스 사용
//		 * - 매개변수 생성자: public GenericExam01(int var1, int var2)
//		 */
//		
//		GenericExam01 ge01 = new GenericExam01(10,20);	// 정상 사용 가능
//		//GenericExam01 ge02 = new GenericExam01(1.5,2.5);	// 오류 발생
//		GenericExam01 ge03 = new GenericExam01('A','B');	// 단일문자<=>정수 호환가능
//				// 정상사용 가능하나 정수형태 값으로 사용됨
//		//GenericExam01 ge04 = new GenericExam01("Hi","bye"); 	// 오류 발생
		
//		/* 제네릭 전용 후 클래스 사용
//		 * - 클래스 : public class GenericExam01<T>
//		 * - 매개변수 생성자: public GenericExam01(T var1, T var2)
//		 */
//		
//		//제네릭은 기본데이터타입을 제공하지 않는다. 내가 정수형태를 쓰고 싶다면?
//		// Wrapper 사용
//		GenericExam01<Integer> ge01 = new GenericExam01<Integer>(10,20);	// 정상 사용 가능
//		GenericExam01<Double> ge02 = new GenericExam01<Double>(1.5,2.5);	// 정상 사용 가능
//		GenericExam01<Character> ge03 = new GenericExam01<Character>('A','B');	// 정상 사용 가능
//		GenericExam01<String> ge04 = new GenericExam01<String>("Hi","bye"); 	// 정상 사용 가능
	
		/* 제네릭 멀피파라메터 전용 후 클래스 사용
		 * - 클래스 : public class GenericExam01<T,M>
		 * - 매개변수 생성자: public GenericExam01(T var1, M var2)
		 */
		
		//제네릭은 기본데이터타입을 제공하지 않는다. 내가 정수형태를 쓰고 싶다면?
		// Wrapper 사용
		GenericExam01<Integer,Integer> ge01 = new GenericExam01<Integer,Integer>(10,20);	// 정상 사용 가능
		GenericExam01<Double,Double> ge02 = new GenericExam01<Double,Double>(1.5,2.5);	// 정상 사용 가능
		GenericExam01<Character,Character> ge03 = new GenericExam01<Character,Character>('A','B');	// 정상 사용 가능
		GenericExam01<String,String> ge04 = new GenericExam01<String,String>("Hi","bye"); 	// 정상 사용 가능
		GenericExam01<Integer,Double> ge05 = new GenericExam01(10,1.5); // 제네릭 타입 생략 가능
		GenericExam01<Character,String> ge06;
		ge06 = new GenericExam01('a',"Hello");
		
		GenericExam01<Integer,Double> ge07 = new GenericExam01();
		ge07.var1 = 10; // 정수형으로 사용돼서 값 정상 대입
		//ge07.var1 = 1.5; // 정수형 공간에 실수값을 대입하려고 해서 에러 발생
		ge07.var2 = 0.5;
		
		/* 제네릭 메소드
		 *  - public <A> A method01(A num)
		 */
		System.out.println(ge07.<Integer>method01(10)); // 정석
		System.out.println(ge07.method01(10)); // 인자값을 보고 데이터 타입을 알 수 있기 때문에 생략 가능
		System.out.println(ge07.method01('A'));
		System.out.println(ge07.method01(1.5));
		
	}

}
