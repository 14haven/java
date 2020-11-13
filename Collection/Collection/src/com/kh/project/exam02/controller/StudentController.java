package com.kh.project.exam02.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

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

	public void method03() {
		System.out.println("---------- Vector -----------");
		// Vector 객체 생성
		Vector list = new Vector();
		
		// 리스트에 데이터 추가
		list.add(10);
		list.add(5);
		list.add(20);
		System.out.println(list);	//[10, 5, 20]
		list.add("Hello");
		System.out.println(list);	//[10, 5, 20, Hello]
		
		// 리스트에 데이터 삽입(특정위치에 추가)
		list.add(2,25);
		System.out.println(list);	//[10, 5, 25, 20, Hello]
		
		// 리스트 데이터 사용
		System.out.println(list.get(0));	//10
		
		// 반복문 활용
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+1+"번째 데이터 : "+list.get(i));
		}
		
		// 리스트 데이터 수정
		list.set(4, 30);
		System.out.println(list);	//[10, 5, 25, 20, 30]
		
		// 리스트 데이터 정렬
		Collections.sort(list);	// 기본 오름차순 정렬
		System.out.println(list);	//[5, 10, 20, 25, 30]
		Collections.reverse(list);	// 내림차순 정렬
		System.out.println(list);	//[30, 25, 20, 10, 5]
		
		// 리스트 데이터 삭제
		list.remove(2);
		System.out.println(list);	//[30, 25, 10, 5]

		// 리스트 전체 초기화(모든 데이터 삭제)
		list.clear();
		System.out.println(list);	//[]
		
		
		
		
	}

	public void method04() {
		System.out.println("------- LinkdedList -------");
		
		// LinkedList 객체 생성
		LinkedList list = new LinkedList();

		// 리스트에 데이터 추가
		list.add(20);
		list.add(4);
		list.add(60);
		System.out.println(list);	//[20, 4, 60]
		
		
		// 리스트에 데이터를 삽입
		list.add(1,10);
		System.out.println(list);	//[20, 10, 4, 60]
		list.addFirst(25);
		System.out.println(list);	//[25, 20, 10, 4, 60]
		list.addLast(30);
		System.out.println(list);	//[25, 20, 10, 4, 60, 30]
		
		// 리스트 데이터 사용
		System.out.println(list.get(3));	//4
		System.out.println(list.getFirst());	//25
		System.out.println(list.getLast());		//30
		
		// 반복문 활용
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+1+"번째 데이터 : "+list.get(i));
		}
		
		/*
		 * 1번째 데이터 : 25
		 * 2번째 데이터 : 20
		 * 3번째 데이터 : 10
		 * 4번째 데이터 : 4
		 * 5번째 데이터 : 60
		 * 6번째 데이터 : 30
		 */
		
		// 리스트 데이터 수정
		list.set(4, 35);
		System.out.println(list);	//[25, 20, 10, 4, 35, 30]
		
		// 리스트 데이터 정렬
		Collections.sort(list);	// 오름차순 정렬
		System.out.println(list);	// [4, 10, 20, 25, 30, 35]
		Collections.reverse(list);	// 내림차순 정렬
		System.out.println(list);	// [35, 30, 25, 20, 10, 4]
		
		// 리스트 데이터 삭제
		list.remove(3);
		System.out.println(list);	//[35, 30, 25, 10, 4]
		list.removeFirst();
		System.out.println(list);	//[30, 25, 10, 4]
		list.removeLast();
		System.out.println(list);	//[30, 25, 10]
		
		// 리스트 초기화(리스트 내 모든 데이터 삭제)
		list.clear();
		System.out.println(list);	//[]
			
		
	}

	public void method05() {
		System.out.println("---------- HashSet ----------");
		//HashSet 객체 생성
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		
		
		// Set에 데이터 추가
		hs.add(10);
		hs.add(5);
		hs.add(15);
		System.out.println(hs);	//[5, 10, 15]
		
		// 중복요소 저장
		hs.add(10);
		System.out.println(hs);	//[5, 10, 15] -> 10이 이미 있기 때문에 안들어간다.
		
		/*
		 *  Set 데이터 사용
		 *  - 인덱스가 없기 때문에 직접 접근해서 사용 할 수 없음
		 *  - Iterator 이용해서 데이터 사용
		 *  
		 */
		Iterator it = hs.iterator(); // iterator 메소드를 사용하여 데이터를 긁어모아와서 it에 저장
		while(it.hasNext()) { // 니가 지금 가리키고 있는 곳에 데이터가 있니?
			System.out.println(it.next()); // 데이터 가지고 와라
		}
		
		/*
		 * 5
		 * 10
		 * 15
		 */

		// Set 데이터 삭제
		hs.remove(10);
		System.out.println(hs); //[5, 15]
		
		// Set 초기화
		hs.clear();
		System.out.println(hs);	//[]
		
			
		// Set을 이용해 리스트의 중복된 데이터 제거
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println("리스트 데이터 : "+list); // [10, 5, 20, 10, 20] 중복된 데이터도 저장이 된 상태
		
		System.out.println("셋 데이터 : "+hs); //[]
		hs.addAll(list);
		System.out.println("셋 데이터 : "+hs); //[20, 5, 10] 중복된 값이 사라졌다.
		list.clear();
		System.out.println("리스트 데이터: "+list);
		//list.addAll(hs);
		//System.out.println("리스트 데이터: "+list);
		Iterator it2 = hs.iterator();
		while(it2.hasNext()) {
//			int tmp = (int)(it2.next())+10;
//			list.add(tmp);
			list.add((int)(it2.next())+100);

			
		}
		System.out.println("리스트 데이터 : "+list);	
		
		
		
		
	}

	public void method06() {
		System.out.println("---------- HashMap ----------");
		// HashMap 객체 생성
		//HashMap map = new HashMap();
		Hashtable map = new Hashtable();
		
		// map에 데이터 추가 - put(키,값);
		map.put("name","홍길동"); // 키는 String 형태여야 한다.
		map.put("age",20);
		map.put("키", 17.5);
		map.put("1",10);
		System.out.println(map);	// {1=10, 키=17.5, name=홍길동, age=20}
		
		// 키를 이용해 데이터 사용
		System.out.println(map.get("age")); // 20
		System.out.println(map.get("name"));// 홍길동
		 
		// 중복된 키의 데이터를 추가
		map.put("1",100);
		System.out.println(map);	// {1=100, 키=17.5, name=홍길동, age=20}
		
		// 키를 Set 형태로 반환
		System.out.println(map.keySet()); // [1, 키, name, age] 
		
		// 값을 Collection 형태로 반환
		System.out.println(map.values()); // [100, 17.5, 홍길동, 20] 
		
		// map 데이터 삭제
		map.remove("키");
		System.out.println(map);	//{1=100, name=홍길동, age=20}
		
		// map 초기화
		map.clear();
		System.out.println(map);	//{}
		
		
	}

	public void method07() {
		System.out.println("------- Properties -------");
		
		// Properties 객체 생성
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/config.properties")); //resources안에 config.properties 읽어올게
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("운영체제: "+prop.getProperty("OS"));
		System.out.println("버전: "+prop.getProperty("Version"));
		System.out.println("메모리: "+prop.getProperty("RAM"));
		
		
	
	}

	public void method08() {
		System.out.println("------- Tree -------");
		
		// 객체 생성
		TreeSet tree = new TreeSet();
		
		// 데이터 추가
		tree.add(10);
		tree.add(5);
		tree.add(20);
		System.out.println(tree);	//[5, 10, 20]
		
		tree.add(1);
		System.out.println(tree);	//[1, 5, 10, 20]
		
		tree.add(15);
		System.out.println(tree);	//[1, 5, 10, 15]
		
		// 데이터 사용
		// 원래는Iterator로 변환해서 사용해야하는데
		System.out.println(tree.first());
		System.out.println(tree.last());
		// 이런식으로는 사용할 수 있다.
		
		// 전체 데이터 가져오기 위해서는
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 데이터 삭제
		tree.remove(20);
		System.out.println(tree);	//[5, 10]
		
		// 초기화
		tree.clear();
		System.out.println(tree);	//[]
		
		
		
	}

	public void method09() {
		System.out.println("--------- Tree Map ----------");
		// 객체
		TreeMap map = new TreeMap();
		// 데이터의 키를 기준으로 정렬할 경우 TreeMap 클래스를 유용하게 사용할 수 있다.
		
		// 데이터 추가
		map.put("이름", "홍길동");
		map.put("age",20);
		map.put("키", 156.7);
		map.put("t",10);
		map.put("4",40);
		map.put("1",30);
		map.put("B",20);
		System.out.println(map);
		// {1=30, 4=40, B=20, age=20, t=10, 이름=홍길동, 키=156.7}
		// 키를 기준으로 정렬
		// 정렬 기준: 숫자 > 알파벳대문자> 알파벳소문자 > 한글
		
		// 데이터 사용
		System.out.println(map.get("t"));
		
		// 데이터 수정
		map.put("B",50);
		System.out.println(map);
		// {1=30, 4=40, B=50, age=20, t=10, 이름=홍길동, 키=156.7}
		
		// 키를 Set 형태로 반환
		System.out.println(map.keySet());
		// [1, 4, B, age, t, 이름, 키]
		
		// 데이터를 collection 형태로 반환
		System.out.println(map.values());
		// [30, 40, 50, 20, 10, 홍길동, 156.7]

		// 데이터 삭제
		map.remove("4");
		System.out.println(map);
		// {1=30, B=50, age=20, t=10, 이름=홍길동, 키=156.7}
		
		// 초기화
		map.clear();
		System.out.println(map);
		// {}
		
	
	
	}

	public void method10() {
		System.out.println("------- Stack -------");
		
		// 객체 생성
		Stack st = new Stack();
		
		// 데이터 추가
		st.push(10);
		st.push(5);
		st.push(20);
		System.out.println(st); //[10, 5, 20]
		
		// 데이터 사용 - peek() 가장 위에 데이터를 삭제하지 않고 확인할 수 있음
		System.out.println(st.peek());	//20
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());	
		System.out.println(st);
		
		// 데이터 사용 - pop() 가장 위에서부터 데이터를 하나씩 꺼내옴 - 꺼낸 데이터는 삭제됨
		int size = st.size() ;
		for(int i=0 ; i<size ; i++) {
			System.out.println(st.pop());
		}
		System.out.println(st); //[]
		
		
		System.out.println("------- Queue -------");
		// 객체 생성
		Queue que = new LinkedList();	
		
		// 데이터 삽입
		que.offer(10);
		que.offer(5);
		que.offer(15);
		System.out.println(que);	//[10, 5, 15]
		
		// 데이터 사용 - peek() 가장 앞에 있는 데이터 확인
		System.out.println(que.peek()); // 10
		
		// 데이터 사용 - poll() 가장 앞에 있는 데이터 부터 순서대로 꺼내옴(꺼낸 데이터는 삭제됨)
		System.out.println(que.poll());	// 10 꺼내오고 삭제
		System.out.println(que.poll());	// 5 꺼내오고 삭제
		System.out.println(que.poll());	// 15 꺼내오고 삭제
		System.out.println(que);	// []
		
		
		
		
		
		
		
	}

}
