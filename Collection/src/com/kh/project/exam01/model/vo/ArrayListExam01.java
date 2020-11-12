package com.kh.project.exam01.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import : ctrl+ shift + m
public class ArrayListExam01 {
	
	public void method01() {
		System.out.println("---------- 기존 배열 사용 ----------");
		String str = "Hello";	// 변수사용
		String[] arr = new String [3];	// 배열 사용 - 데이터 여러개 저장
		
		// 배열에 데이터 추가
		arr[0] = "hihi";
		arr[1] = "bye";
		arr[2] = "hello";
		
		// 배열 내 데이터 사용
		System.out.println("arr[0]의 값 : "+arr[0]);
		System.out.println("arr[1]의 값 : "+arr[1]);
		System.out.println("arr[2]의 값 : "+arr[2]);
		
		// 반복문을 이용해서 사용
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i+1+"번째 값 : "+arr[i]);
		}
		
		// 향상된 반복문
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		
		// 기존 크기보다 더 많은 데이터 추가
	    //arr[3] = "hahaha"; // 컴파일은 되는데 실행중 오류 발생 -> 런타임(Runtime) 오류 발생
		String[] tmpArr = new String[5];

		
		// 공간크기를 키워서 새로 만든 배열에 기존 데이터 삽입
		for(int i=0 ; i<arr.length ; i++) {
			tmpArr[i] = arr[i];
		}
//		
//		String [] tmpArr = arr;
//		arr = new String[5];
//		
		// 기존 데이터 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i+1+"번째 값 : "+arr[i]);
		}
		
		// 새로 만든 배열 데이터 출력
		for(int i=0 ; i<tmpArr.length ; i++) {
			System.out.println("tmpArr 값 : "+tmpArr[i]);
		}
		
		// 기존에 사용하던 배열 참조변수에 새로운 배열 대입
		arr = tmpArr; // 새로만든 배열의 공간의 주소를 저장하도록
		
		arr[3] = "extends";
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println("arr 값 : "+ arr[i]);
		}
		
		// 배열에 데이터 삽입
		// arr[1] = "insert"; // 1번째 데이터가 수정됨
		int insertIndex = 1 ; // 삽입하고 싶은 위치
		// 실제 저장된 데이터의 마지막 인덱스 알아내기
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i] == null) { // null 값을 만날 때를 찾음
				// 마지막 데이터부터 한칸씩 뒤로 이동
				for(int j = i; j>insertIndex ; j--) { 
					arr[j] = arr[j-1]; // 뒷 자리에 앞 값 대입
				}
				// 삽입할 데이터 입력
				arr[insertIndex] = "insertData";
				
				break;
			}
		}
		for(int i=0 ; i<arr.length; i++) {
			System.out.println("arr 삽입 후 값 : "+ arr[i]);
		}	
		
		// 배열 내 데이터 삭제
		int deleteIndex = 2; // 인덱스[2] 값을 삭제하겠다.
		
		for(int i = deleteIndex; i<arr.length && arr[i] != null; i++) { // 내 값을 내 전 인덱스에 넘겨주기
			if(i == arr.length - 1)
				arr[i] = null; // 마지막 인덱스는 뒤에 값이 없기 때문에 null 넣어줌
			else
			arr[i] = arr[i+1];	
		}
		for(int i=0 ; i<arr.length; i++) {
			System.out.println("arr 삭제 후 값 : "+ arr[i]);
		}	
	}
	
	public void method02() {
		System.out.println("---------- ArrayList 기본 사용 ----------");
		// ArrayList 객체 생성
		ArrayList aList1 = new ArrayList(2); // 크기를 지정하면서 리스트 객체 생성 (2칸 짜리 공간만들겠다)
		ArrayList aList2 = new ArrayList(); // 크기를 지정하지 않고 리스트 객체 생성 -> 10칸 짜리 자동으로 만들어짐
	
		System.out.println(aList1.size()); // 리스트 내 데이터 개수, 이 안에 데이터 몇개 들어있는지 알고싶어
		System.out.println(aList1); // 리스트 내 저장된 모든 데이터를 콤마(,)로 구분해서 대괄호([]) 안에 모두 나열해줌
		System.out.println(aList2.size());
		System.out.println(aList2);
		
		// 리스트에 데이터 추가 - 가장 마지막 위치에 추가
		aList1.add(10);			// 리스트에 정수값 추가
		aList1.add("Hello");	// 리스트에 문자열 추가
		aList1.add(4.7);		// 리스트에 실수값 추가
		// 서로 다른 자료형 값 저장 가능
		System.out.println(aList1); // [10, Hello, 4.7]
		System.out.println(aList1.size()); // 3 - 리스트 내 데이터 개수
	
		// 리스트 내 데이터 사용 - 객체명.get(인덱스) 메서드를 사용
		System.out.println("[0]번 인덱스 값: "+aList1.get(0));	// 10
		System.out.println("[1]번 인덱스 값: "+aList1.get(1));	// Hello
		System.out.println("[2]번 인덱스 값: "+aList1.get(2));	// 4.7
		
		// 반복문 활용
		for(int i=0 ; i<aList1.size(); i++) {
			System.out.println(i+1+"번째 값 : "+aList1.get(i));
		}
		/*
		 * 1번째 값 : 10
		 * 2번째 값 : Hello
		 * 3번째 값 : 4.7
		 */
		
		// 향상된 반복문
		for(Object tmp : aList1 ) { // Object는 모든 변수, 객체들의 조상
			System.out.println(tmp);
		}
		/* 
		 * 10
		 * Hello
		 * 4.7
		 */
		
		// 리스트에 데이터 삽입 - 중간 위치에 값 삽입
		aList1.add(1, "안녕");		// 1번 인덱스에 "안녕" 문자열 삽입
		System.out.println(aList1); // [10, 안녕, Hello, 4.7]
		
		// 리스트 내 데이터 수정
		aList1.set(1, "안녕하세요");	// 1번 인덱스 값을 "안녕하세요"로 변경 
		System.out.println(aList1);	// [10, 안녕하세요, Hello, 4.7]

		// 리스트 내 특정 데이터에 대한 인덱스 값 확인 - 데이터를 몾찾으면 -1 반환, 찾으면 해당 인덴스 값을 반환
		System.out.println(aList1.indexOf("Hello"));	// 2
		System.out.println(aList1.indexOf("hi"));		// -1
		
		// 리스트 내 특정 데이터의 존재 여부 검사 - 데이터가 있으면 ture, 없으면 false 반환
		System.out.println(aList1.contains("Hello"));	// true
		System.out.println(aList1.contains("hi"));		// false
		
		// 리스트 내 특정 데이터 삭제
		aList1.remove(2);	// 2번 인덱스 값 삭제
		System.out.println(aList1); // [10, 안녕하세요, 4.7]
		
		System.out.println(aList1.get(2)); // 삭제 후 원래 마지막 3번 인덱스 값이 2번 인덱스 값이 됨 
		
		// 리스트 내 모든 데이터 삭제
		aList1.clear();
		System.out.println(aList1); // [] 
		
		aList1.add(10);
		aList1.add(20);
		aList1.add(30);
		aList1.add(40);
		aList1.add(50);
		
		System.out.println(aList1); // [10, 20, 30, 40 ,50]
		
		aList1.remove((Integer)20); // 20이라는 데이터가 삭제됨
		System.out.println(aList1); // [10, 30, 40, 50]
		
		aList2.add(10);
		aList2.add(40);
		
		//aList1.removeAll(aList2);
		
		aList1.removeAll(aList1.subList(1, 3)); // 컬렉션 형태로 알려줘야한다. List 형태거나 Set 형태거나
		
		System.out.println(aList1);	// [10, 50]

		// ArrayList 객체 생성 시 초기값 지정
		ArrayList al = new ArrayList(Arrays.asList("Hello",10,1.5,'가')); // 초기화하려면 리스트가 필요하다
		System.out.println("al 값 : "+al);
		
		ArrayList al2 = new ArrayList(al); //다른 리스트 만들어서 새로운 리스트의 생성자의 인자값으로 넣어주기
		System.out.println("al2 값 : "+al);
		
		
		
	}

	public void method03() {
		System.out.println("---------- ArrayList 정렬  ----------");
		ArrayList list = new ArrayList();
		
		// 리스트에 데이터 추가 - 추가한 순서대로 저장되어 있음
		list.add(55);
		list.add(23);
		list.add(68);
		list.add(43);
		list.add(22);
		
		System.out.println(list);	// [55, 23, 68, 43, 22]

		 // 데이터 정렬
		 Collections.sort(list);	// 기본 오름차순 정렬
		 System.out.println(list);	// [22, 23, 43, 55, 68]
		 //Collections.reverse(list);	// 내림차순 정렬
		 list.sort(Collections.reverseOrder());
		 System.out.println(list);	// [68, 55, 43, 23, 22]
		 
		// 가급적이면 하나의 타입의 데이터만 담든지 캐스팅을 하든지
		 
		 
		 
	}
}
