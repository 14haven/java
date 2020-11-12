package com.kh.project.exam02.model.vo;

public class Student implements Comparable{
	// �ʵ��
	private int classNumber;	// �л� ��ȣ
	private String name;		// �л� �̸�
	private int age;			// �л� ����
	// �����ں�
		// �⺻ ������
	public Student() {}
		// �Ű����� ������
	public Student(int classNumber, String name, int age) {
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
	}
	// �޼ҵ��
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ȣ: "+classNumber+" / �̸�: "+name+" / ����: "+age;
	}
//	public String getField() {
//		return "��ȣ: "+classNumber+" / �̸�: "+name+" / ����: "+age;
//	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		// ��������
			// this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ū ���  : 1 (���)
			// this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ���� ��� : -1 (����)
			// ���� ��� : 0
//		if(this.classNumber > ((Student)o).classNumber) {
//			return 1;
//		} else if(this.classNumber < ((Student)o).classNumber) {
//			return -1;
//		} else
//			return 0;
			// ����, �Ǽ�, ���Ϲ���
			
			// ��ȣ�� ���� 
			return this.classNumber - ((Student)o).classNumber;
			// ���̷� ���� 
			//return this.age - ((Student)o).age;
			// ���ڿ� ����
			// return this.name.compareTo(((Student)o).name);
		// ��������
			// this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ū ��� : -1 (����)
			// this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ���� ��� : 1 (���)
			// ���� ��� : 0
	}
}
