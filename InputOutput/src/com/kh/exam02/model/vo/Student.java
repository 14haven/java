package com.kh.exam02.model.vo;

public class Student {
// �ʵ��
	//[����������] [Ű����] <������Ÿ��> <�ʵ��> [ = <�ʱⰪ>];
	private String name;
	private int age;
	private String tel;
	private String addr;

// �����ں�
	//[����������] [Ű����] <Ŭ������> ([�Ű�����,..]) { [���೻��;...] }
	// �⺻ ����Ʈ ������
	public Student() {}
	// �Ű����� ������
	public Student(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

// �޼ҵ��
	// Getter/Setter �޼ҵ�
	public String getName() {  return this.name;	}
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getTel() { return tel; }
	public void setTel(String tel) { this.tel = tel; }
	public String getAddr() {return addr; }
	public void setAddr(String addr) { this.addr = addr; }
	
	// ObjectŬ������ �ִ� toString �޼ҵ� �������̵�
		// �ʵ��� ������ �ѹ��� ����ؼ� Ȯ���ϱ� ���� �뵵
	public String toString() {
		return "�̸� : "+name+", ���� : "+age+", ��ȭ��ȣ : "+tel+", �ּ� : "+addr;
		//return "[name=>"+name+",age=>"+age+",tel=>"+tel+",addr=>"+addr+"]";
	}
	
}
