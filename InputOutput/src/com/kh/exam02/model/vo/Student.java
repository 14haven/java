package com.kh.exam02.model.vo;

public class Student {
// 필드부
	//[접근제한자] [키워드] <데이터타입> <필드명> [ = <초기값>];
	private String name;
	private int age;
	private String tel;
	private String addr;

// 생성자부
	//[접근제한자] [키워드] <클래스명> ([매개변수,..]) { [실행내용;...] }
	// 기본 디폴트 생성자
	public Student() {}
	// 매개변수 생성자
	public Student(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

// 메소드부
	// Getter/Setter 메소드
	public String getName() {  return this.name;	}
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getTel() { return tel; }
	public void setTel(String tel) { this.tel = tel; }
	public String getAddr() {return addr; }
	public void setAddr(String addr) { this.addr = addr; }
	
	// Object클래스에 있는 toString 메소드 오버라이딩
		// 필드의 내용을 한번에 출력해서 확인하기 위한 용도
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+", 전화번호 : "+tel+", 주소 : "+addr;
		//return "[name=>"+name+",age=>"+age+",tel=>"+tel+",addr=>"+addr+"]";
	}
	
}
