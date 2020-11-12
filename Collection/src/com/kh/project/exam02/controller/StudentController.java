package com.kh.project.exam02.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.project.exam02.model.vo.Student;

public class StudentController {
	@Override
	public String toString(){
		return "StudentController의 toString()";
	}
	public void method01() {
		System.out.println("------- ArrayList 객체데이터 사용 -------");
		
		// ArrayList 생성
		ArrayList<Student> list = new ArrayList<Student>();
		
		//리버싱 -> 만들어진 프로그램을 뒤집어 까는 것
		// 리스트에 Student 객체 추가
		//ArrayList는 Student의 객체의 주소를 담아서 사용한다
		
			// 객체를 생성하여 리스트에서 주소를 저장해서 사용함
		list.add(new Student(20012,"홍길동",20)); // Student 형태 공간만들어서 데이터 담겠다
		list.add(new Student(20011,"김길동",30));
		list.add(new Student(20013,"고길동",20));
		
		/* 리스트 데이터 확인
		 * - 객체 이름만을 이용해서 사용할 경우 객체의 주소를 사용하게 됨
		 * - 객체 이름만으로 출력하면 주소값이 출력됨
		 * - 객체 내부 실제 데이터를 출력하고 싶은 경우
		 * 		- 객체 내부에 toString 메소드를 오버라이딩해주면 됨
		 * 		- toString() 메소드는 원래 Object의 메소드
		 */		
		
		System.out.println(list);
		//list.toString => 출력형식 만들어줌 toString -> 자기안의 필드를 출력해주는 메소드
		//이후로는 Systm.out.println이 알아서 list만 적어도 list.toString 실행해준다
		
//		System.out.println(list.get(0));
//		System.out.println(((Student)list.get(0)).getName());
//		System.out.println(((Student)list.get(0)).toString());
//		// 리스트, 즉 컬렉션의 주소를 따라갔을 때 객체가 있을때에는 그곳에 다양한 기능이 있으나 그 공간이 어떤 공간인지 알 방법이 없음
//		// 그 공간이 어떤 공간인지 알려줘야한다. 다운캐스팅, 강제 형변환
		
		System.out.println(list.get(0));	// Student 클래스의 toString() 메소드 반환값 출력
		System.out.println(list.get(1));	// Student 클래스의 toString() 메소드 반환값 출력
		System.out.println(list.get(2));	// Student 클래스의 toString() 메소드 반환값 출력
	
		// 반복문 사용
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getClassNumber()+"번 학생의 이름은 "
		+list.get(i).getName()+"이고, 나이는 "
		+list.get(i).getAge()+"살 입니다.");
		}
		/*
		 * 20012번 학생의 이름은 홍길동이고, 나이는 20살 입니다.
		 * 20011번 학생의 이름은 김길동이고, 나이는 30살 입니다.
		 * 20013번 학생의 이름은 고길동이고, 나이는 20살 입니다.
		 */
		
		// 리스트 데이터 삽입
		list.add(2,new Student(20014,"최길동",28));
		System.out.println(list); // [번호: 20012 / 이름: 홍길동 / 나이: 20, 번호: 20011 / 이름: 김길동 / 나이: 30, 번호: 20014 / 이름: 최길동 / 나이: 28, 번호: 20013 / 이름: 고길동 / 나이: 20]
		System.out.println(list.get(2));
		
		// 리스트 데이터 수정
		list.set(1, new Student(20015,"이길동",33));
		System.out.println(list); // [번호: 20012 / 이름: 홍길동 / 나이: 20, 번호: 20015 / 이름: 이길동 / 나이: 33, 번호: 20014 / 이름: 최길동 / 나이: 28, 번호: 20013 / 이름: 고길동 / 나이: 20]
		
		// 리스트 내부 객체 멤버 필드 수정
		list.get(0).setAge(21);
		System.out.println(list); // [번호: 20012 / 이름: 홍길동 / 나이: 21, 번호: 20015 / 이름: 이길동 / 나이: 33, 번호: 20014 / 이름: 최길동 / 나이: 28, 번호: 20013 / 이름: 고길동 / 나이: 20]

		// 리스트 내 특정 객체 삭제
		list.remove(2);
		System.out.println(list); // [번호: 20012 / 이름: 홍길동 / 나이: 21, 번호: 20015 / 이름: 이길동 / 나이: 33, 번호: 20013 / 이름: 고길동 / 나이: 20]
		
		// 리스트 내 모든 데이터 삭제
		list.clear();
		System.out.println(list); // []
	}
	
	public void method02() {
		System.out.println("------- ArrayList 객체데이터 정렬 -------");
		// ArrayList 생성
		ArrayList<Student>list = new ArrayList<Student>();
		// 리스트에 Studnet 객체 추가
		list.add(new Student(20012,"홍길동",20));
		list.add(new Student(20014,"이길동",27));
		list.add(new Student(20010,"고길동",34));
		list.add(new Student(20015,"최길동",29));
		list.add(new Student(20011,"김길동",45));
		// 리스트 전체 내용 출력
		System.out.println(list);
		
		/* 리스트에 객체를 저장할 경우 기본적인 방법으로는 정렬이 안됨
		 * - Collections.sort() 메소드가 정렬을 위한 기준을 찾을 수 없기 때문
		 * - Comparable 인터페이스에 있는 comparTo() 메소드를 오버라이딩(재정의) 해서 사용
		 * 
		 */
		
		Collections.sort(list); // 정렬 기준을 몰라서 오류 발생
		System.out.println(list);
		Collections.reverse(list);
	}
}
