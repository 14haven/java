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

	public void method03() {
		System.out.println("---------- Vector -----------");
		// Vector ��ü ����
		Vector list = new Vector();
		
		// ����Ʈ�� ������ �߰�
		list.add(10);
		list.add(5);
		list.add(20);
		System.out.println(list);	//[10, 5, 20]
		list.add("Hello");
		System.out.println(list);	//[10, 5, 20, Hello]
		
		// ����Ʈ�� ������ ����(Ư����ġ�� �߰�)
		list.add(2,25);
		System.out.println(list);	//[10, 5, 25, 20, Hello]
		
		// ����Ʈ ������ ���
		System.out.println(list.get(0));	//10
		
		// �ݺ��� Ȱ��
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+1+"��° ������ : "+list.get(i));
		}
		
		// ����Ʈ ������ ����
		list.set(4, 30);
		System.out.println(list);	//[10, 5, 25, 20, 30]
		
		// ����Ʈ ������ ����
		Collections.sort(list);	// �⺻ �������� ����
		System.out.println(list);	//[5, 10, 20, 25, 30]
		Collections.reverse(list);	// �������� ����
		System.out.println(list);	//[30, 25, 20, 10, 5]
		
		// ����Ʈ ������ ����
		list.remove(2);
		System.out.println(list);	//[30, 25, 10, 5]

		// ����Ʈ ��ü �ʱ�ȭ(��� ������ ����)
		list.clear();
		System.out.println(list);	//[]
		
		
		
		
	}

	public void method04() {
		System.out.println("------- LinkdedList -------");
		
		// LinkedList ��ü ����
		LinkedList list = new LinkedList();

		// ����Ʈ�� ������ �߰�
		list.add(20);
		list.add(4);
		list.add(60);
		System.out.println(list);	//[20, 4, 60]
		
		
		// ����Ʈ�� �����͸� ����
		list.add(1,10);
		System.out.println(list);	//[20, 10, 4, 60]
		list.addFirst(25);
		System.out.println(list);	//[25, 20, 10, 4, 60]
		list.addLast(30);
		System.out.println(list);	//[25, 20, 10, 4, 60, 30]
		
		// ����Ʈ ������ ���
		System.out.println(list.get(3));	//4
		System.out.println(list.getFirst());	//25
		System.out.println(list.getLast());		//30
		
		// �ݺ��� Ȱ��
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+1+"��° ������ : "+list.get(i));
		}
		
		/*
		 * 1��° ������ : 25
		 * 2��° ������ : 20
		 * 3��° ������ : 10
		 * 4��° ������ : 4
		 * 5��° ������ : 60
		 * 6��° ������ : 30
		 */
		
		// ����Ʈ ������ ����
		list.set(4, 35);
		System.out.println(list);	//[25, 20, 10, 4, 35, 30]
		
		// ����Ʈ ������ ����
		Collections.sort(list);	// �������� ����
		System.out.println(list);	// [4, 10, 20, 25, 30, 35]
		Collections.reverse(list);	// �������� ����
		System.out.println(list);	// [35, 30, 25, 20, 10, 4]
		
		// ����Ʈ ������ ����
		list.remove(3);
		System.out.println(list);	//[35, 30, 25, 10, 4]
		list.removeFirst();
		System.out.println(list);	//[30, 25, 10, 4]
		list.removeLast();
		System.out.println(list);	//[30, 25, 10]
		
		// ����Ʈ �ʱ�ȭ(����Ʈ �� ��� ������ ����)
		list.clear();
		System.out.println(list);	//[]
			
		
	}

	public void method05() {
		System.out.println("---------- HashSet ----------");
		//HashSet ��ü ����
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		
		
		// Set�� ������ �߰�
		hs.add(10);
		hs.add(5);
		hs.add(15);
		System.out.println(hs);	//[5, 10, 15]
		
		// �ߺ���� ����
		hs.add(10);
		System.out.println(hs);	//[5, 10, 15] -> 10�� �̹� �ֱ� ������ �ȵ���.
		
		/*
		 *  Set ������ ���
		 *  - �ε����� ���� ������ ���� �����ؼ� ��� �� �� ����
		 *  - Iterator �̿��ؼ� ������ ���
		 *  
		 */
		Iterator it = hs.iterator(); // iterator �޼ҵ带 ����Ͽ� �����͸� �ܾ��ƿͼ� it�� ����
		while(it.hasNext()) { // �ϰ� ���� ����Ű�� �ִ� ���� �����Ͱ� �ִ�?
			System.out.println(it.next()); // ������ ������ �Ͷ�
		}
		
		/*
		 * 5
		 * 10
		 * 15
		 */

		// Set ������ ����
		hs.remove(10);
		System.out.println(hs); //[5, 15]
		
		// Set �ʱ�ȭ
		hs.clear();
		System.out.println(hs);	//[]
		
			
		// Set�� �̿��� ����Ʈ�� �ߺ��� ������ ����
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println("����Ʈ ������ : "+list); // [10, 5, 20, 10, 20] �ߺ��� �����͵� ������ �� ����
		
		System.out.println("�� ������ : "+hs); //[]
		hs.addAll(list);
		System.out.println("�� ������ : "+hs); //[20, 5, 10] �ߺ��� ���� �������.
		list.clear();
		System.out.println("����Ʈ ������: "+list);
		//list.addAll(hs);
		//System.out.println("����Ʈ ������: "+list);
		Iterator it2 = hs.iterator();
		while(it2.hasNext()) {
//			int tmp = (int)(it2.next())+10;
//			list.add(tmp);
			list.add((int)(it2.next())+100);

			
		}
		System.out.println("����Ʈ ������ : "+list);	
		
		
		
		
	}

	public void method06() {
		System.out.println("---------- HashMap ----------");
		// HashMap ��ü ����
		//HashMap map = new HashMap();
		Hashtable map = new Hashtable();
		
		// map�� ������ �߰� - put(Ű,��);
		map.put("name","ȫ�浿"); // Ű�� String ���¿��� �Ѵ�.
		map.put("age",20);
		map.put("Ű", 17.5);
		map.put("1",10);
		System.out.println(map);	// {1=10, Ű=17.5, name=ȫ�浿, age=20}
		
		// Ű�� �̿��� ������ ���
		System.out.println(map.get("age")); // 20
		System.out.println(map.get("name"));// ȫ�浿
		 
		// �ߺ��� Ű�� �����͸� �߰�
		map.put("1",100);
		System.out.println(map);	// {1=100, Ű=17.5, name=ȫ�浿, age=20}
		
		// Ű�� Set ���·� ��ȯ
		System.out.println(map.keySet()); // [1, Ű, name, age] 
		
		// ���� Collection ���·� ��ȯ
		System.out.println(map.values()); // [100, 17.5, ȫ�浿, 20] 
		
		// map ������ ����
		map.remove("Ű");
		System.out.println(map);	//{1=100, name=ȫ�浿, age=20}
		
		// map �ʱ�ȭ
		map.clear();
		System.out.println(map);	//{}
		
		
	}

	public void method07() {
		System.out.println("------- Properties -------");
		
		// Properties ��ü ����
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/config.properties")); //resources�ȿ� config.properties �о�ð�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�ü��: "+prop.getProperty("OS"));
		System.out.println("����: "+prop.getProperty("Version"));
		System.out.println("�޸�: "+prop.getProperty("RAM"));
		
		
	
	}

	public void method08() {
		System.out.println("------- Tree -------");
		
		// ��ü ����
		TreeSet tree = new TreeSet();
		
		// ������ �߰�
		tree.add(10);
		tree.add(5);
		tree.add(20);
		System.out.println(tree);	//[5, 10, 20]
		
		tree.add(1);
		System.out.println(tree);	//[1, 5, 10, 20]
		
		tree.add(15);
		System.out.println(tree);	//[1, 5, 10, 15]
		
		// ������ ���
		// ������Iterator�� ��ȯ�ؼ� ����ؾ��ϴµ�
		System.out.println(tree.first());
		System.out.println(tree.last());
		// �̷������δ� ����� �� �ִ�.
		
		// ��ü ������ �������� ���ؼ���
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ������ ����
		tree.remove(20);
		System.out.println(tree);	//[5, 10]
		
		// �ʱ�ȭ
		tree.clear();
		System.out.println(tree);	//[]
		
		
		
	}

	public void method09() {
		System.out.println("--------- Tree Map ----------");
		// ��ü
		TreeMap map = new TreeMap();
		// �������� Ű�� �������� ������ ��� TreeMap Ŭ������ �����ϰ� ����� �� �ִ�.
		
		// ������ �߰�
		map.put("�̸�", "ȫ�浿");
		map.put("age",20);
		map.put("Ű", 156.7);
		map.put("t",10);
		map.put("4",40);
		map.put("1",30);
		map.put("B",20);
		System.out.println(map);
		// {1=30, 4=40, B=20, age=20, t=10, �̸�=ȫ�浿, Ű=156.7}
		// Ű�� �������� ����
		// ���� ����: ���� > ���ĺ��빮��> ���ĺ��ҹ��� > �ѱ�
		
		// ������ ���
		System.out.println(map.get("t"));
		
		// ������ ����
		map.put("B",50);
		System.out.println(map);
		// {1=30, 4=40, B=50, age=20, t=10, �̸�=ȫ�浿, Ű=156.7}
		
		// Ű�� Set ���·� ��ȯ
		System.out.println(map.keySet());
		// [1, 4, B, age, t, �̸�, Ű]
		
		// �����͸� collection ���·� ��ȯ
		System.out.println(map.values());
		// [30, 40, 50, 20, 10, ȫ�浿, 156.7]

		// ������ ����
		map.remove("4");
		System.out.println(map);
		// {1=30, B=50, age=20, t=10, �̸�=ȫ�浿, Ű=156.7}
		
		// �ʱ�ȭ
		map.clear();
		System.out.println(map);
		// {}
		
	
	
	}

	public void method10() {
		System.out.println("------- Stack -------");
		
		// ��ü ����
		Stack st = new Stack();
		
		// ������ �߰�
		st.push(10);
		st.push(5);
		st.push(20);
		System.out.println(st); //[10, 5, 20]
		
		// ������ ��� - peek() ���� ���� �����͸� �������� �ʰ� Ȯ���� �� ����
		System.out.println(st.peek());	//20
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());	
		System.out.println(st);
		
		// ������ ��� - pop() ���� ���������� �����͸� �ϳ��� ������ - ���� �����ʹ� ������
		int size = st.size() ;
		for(int i=0 ; i<size ; i++) {
			System.out.println(st.pop());
		}
		System.out.println(st); //[]
		
		
		System.out.println("------- Queue -------");
		// ��ü ����
		Queue que = new LinkedList();	
		
		// ������ ����
		que.offer(10);
		que.offer(5);
		que.offer(15);
		System.out.println(que);	//[10, 5, 15]
		
		// ������ ��� - peek() ���� �տ� �ִ� ������ Ȯ��
		System.out.println(que.peek()); // 10
		
		// ������ ��� - poll() ���� �տ� �ִ� ������ ���� ������� ������(���� �����ʹ� ������)
		System.out.println(que.poll());	// 10 �������� ����
		System.out.println(que.poll());	// 5 �������� ����
		System.out.println(que.poll());	// 15 �������� ����
		System.out.println(que);	// []
		
		
		
		
		
		
		
	}

}
