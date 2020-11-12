package com.kh.project.exam02.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.project.exam02.model.vo.Student;

public class StudentController {
	@Override
	public String toString(){
		return "StudentController�� toString()";
	}
	public void method01() {
		System.out.println("------- ArrayList ��ü������ ��� -------");
		
		// ArrayList ����
		ArrayList<Student> list = new ArrayList<Student>();
		
		//������ -> ������� ���α׷��� ������ ��� ��
		// ����Ʈ�� Student ��ü �߰�
		//ArrayList�� Student�� ��ü�� �ּҸ� ��Ƽ� ����Ѵ�
		
			// ��ü�� �����Ͽ� ����Ʈ���� �ּҸ� �����ؼ� �����
		list.add(new Student(20012,"ȫ�浿",20)); // Student ���� �������� ������ ��ڴ�
		list.add(new Student(20011,"��浿",30));
		list.add(new Student(20013,"��浿",20));
		
		/* ����Ʈ ������ Ȯ��
		 * - ��ü �̸����� �̿��ؼ� ����� ��� ��ü�� �ּҸ� ����ϰ� ��
		 * - ��ü �̸������� ����ϸ� �ּҰ��� ��µ�
		 * - ��ü ���� ���� �����͸� ����ϰ� ���� ���
		 * 		- ��ü ���ο� toString �޼ҵ带 �������̵����ָ� ��
		 * 		- toString() �޼ҵ�� ���� Object�� �޼ҵ�
		 */		
		
		System.out.println(list);
		//list.toString => ������� ������� toString -> �ڱ���� �ʵ带 ������ִ� �޼ҵ�
		//���ķδ� Systm.out.println�� �˾Ƽ� list�� ��� list.toString �������ش�
		
//		System.out.println(list.get(0));
//		System.out.println(((Student)list.get(0)).getName());
//		System.out.println(((Student)list.get(0)).toString());
//		// ����Ʈ, �� �÷����� �ּҸ� ������ �� ��ü�� ���������� �װ��� �پ��� ����� ������ �� ������ � �������� �� ����� ����
//		// �� ������ � �������� �˷�����Ѵ�. �ٿ�ĳ����, ���� ����ȯ
		
		System.out.println(list.get(0));	// Student Ŭ������ toString() �޼ҵ� ��ȯ�� ���
		System.out.println(list.get(1));	// Student Ŭ������ toString() �޼ҵ� ��ȯ�� ���
		System.out.println(list.get(2));	// Student Ŭ������ toString() �޼ҵ� ��ȯ�� ���
	
		// �ݺ��� ���
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getClassNumber()+"�� �л��� �̸��� "
		+list.get(i).getName()+"�̰�, ���̴� "
		+list.get(i).getAge()+"�� �Դϴ�.");
		}
		/*
		 * 20012�� �л��� �̸��� ȫ�浿�̰�, ���̴� 20�� �Դϴ�.
		 * 20011�� �л��� �̸��� ��浿�̰�, ���̴� 30�� �Դϴ�.
		 * 20013�� �л��� �̸��� ��浿�̰�, ���̴� 20�� �Դϴ�.
		 */
		
		// ����Ʈ ������ ����
		list.add(2,new Student(20014,"�ֱ浿",28));
		System.out.println(list); // [��ȣ: 20012 / �̸�: ȫ�浿 / ����: 20, ��ȣ: 20011 / �̸�: ��浿 / ����: 30, ��ȣ: 20014 / �̸�: �ֱ浿 / ����: 28, ��ȣ: 20013 / �̸�: ��浿 / ����: 20]
		System.out.println(list.get(2));
		
		// ����Ʈ ������ ����
		list.set(1, new Student(20015,"�̱浿",33));
		System.out.println(list); // [��ȣ: 20012 / �̸�: ȫ�浿 / ����: 20, ��ȣ: 20015 / �̸�: �̱浿 / ����: 33, ��ȣ: 20014 / �̸�: �ֱ浿 / ����: 28, ��ȣ: 20013 / �̸�: ��浿 / ����: 20]
		
		// ����Ʈ ���� ��ü ��� �ʵ� ����
		list.get(0).setAge(21);
		System.out.println(list); // [��ȣ: 20012 / �̸�: ȫ�浿 / ����: 21, ��ȣ: 20015 / �̸�: �̱浿 / ����: 33, ��ȣ: 20014 / �̸�: �ֱ浿 / ����: 28, ��ȣ: 20013 / �̸�: ��浿 / ����: 20]

		// ����Ʈ �� Ư�� ��ü ����
		list.remove(2);
		System.out.println(list); // [��ȣ: 20012 / �̸�: ȫ�浿 / ����: 21, ��ȣ: 20015 / �̸�: �̱浿 / ����: 33, ��ȣ: 20013 / �̸�: ��浿 / ����: 20]
		
		// ����Ʈ �� ��� ������ ����
		list.clear();
		System.out.println(list); // []
	}
	
	public void method02() {
		System.out.println("------- ArrayList ��ü������ ���� -------");
		// ArrayList ����
		ArrayList<Student>list = new ArrayList<Student>();
		// ����Ʈ�� Studnet ��ü �߰�
		list.add(new Student(20012,"ȫ�浿",20));
		list.add(new Student(20014,"�̱浿",27));
		list.add(new Student(20010,"��浿",34));
		list.add(new Student(20015,"�ֱ浿",29));
		list.add(new Student(20011,"��浿",45));
		// ����Ʈ ��ü ���� ���
		System.out.println(list);
		
		/* ����Ʈ�� ��ü�� ������ ��� �⺻���� ������δ� ������ �ȵ�
		 * - Collections.sort() �޼ҵ尡 ������ ���� ������ ã�� �� ���� ����
		 * - Comparable �������̽��� �ִ� comparTo() �޼ҵ带 �������̵�(������) �ؼ� ���
		 * 
		 */
		
		Collections.sort(list); // ���� ������ ���� ���� �߻�
		System.out.println(list);
		Collections.reverse(list);
	}
}
