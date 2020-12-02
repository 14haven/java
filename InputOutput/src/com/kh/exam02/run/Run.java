package com.kh.exam02.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.exam02.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// Student st : Student Ŭ������ ���������� ����
		// = new Student() : Student ��ü ���� �� �ּҸ� ���������� ����
		Student st = new Student("ȫ�浿",20,"01012341234","����� ���α�");
		// ��ü�� �� �ʵ� ���� ���
		System.out.println(st.toString());
		
	// ��ü�� ���Ϸ� ����
		// ���� ��� ��Ʈ��, ��ü ��� ���� ��Ʈ���� ���� ���� ���� ����
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// ���� ����� �� ���� �߻��� �� �ֱ� ������ �ݵ�� ����ó���� ����� ��
		try {
			// ���� ��� ��Ʈ�� ��ü ����(�� ��Ʈ�� : ���� ��θ� ������ִ� ��Ʈ��)
			fos = new FileOutputStream("C:\\iotest\\student.txt");
			// ��ü ��� ���� ��Ʈ�� ��ü ����
			oos = new ObjectOutputStream(fos);
			
			// ���� ��Ʈ���� �̿��ؼ� ��ü�� ���Ϸ� ����
			oos.writeObject(st);
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
