package com.kh.exam01.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.activation.MimetypesFileTypeMap;

public class IOExam01 {
	public void method01() {
		System.out.println("------ ���ο� ���� �����ϱ� ------");
		File file = new File("C:\\iotest\\test01.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("������ �����Ǿ����ϴ�.");
			} catch (IOException e) {
				System.out.println("������ ������ �� �����ϴ�.");
			}			
		}
		// ���� ���� ���
		System.out.println("���ϸ� : "+file.getName());
		System.out.println("���ϰ�� : "+file.getPath());
		System.out.println("����ũ�� : "+file.length());
		// ���� ���� Ȯ��
		System.out.println("�������� : "+
					new MimetypesFileTypeMap().getContentType(file));
	}

	public void method02() {
		System.out.println("------ ���� ���� Ȯ���ϱ� ------");
		File file = new File("C:\\iotest\\���ζ�.jpg");
		if(file.exists()) {
			// ���� ���� ���
			System.out.println("���ϸ� : "+file.getName());
			System.out.println("���ϰ�� : "+file.getPath());
			System.out.println("����ũ�� : "+file.length());
			// ���� ���� Ȯ��
			System.out.println("�������� : "+
						new MimetypesFileTypeMap().getContentType(file));
		}
	}

	public void method03() {
		System.out.println("------ ���� ��� : FileOutputStream -------");
		
		// ���� ��� ��Ʈ�� �������� ����
		FileOutputStream fos = null;
		
		try {
			// ���� ��� ��Ʈ�� ��ü ����
				// ������ �̸��� ������ ������ ���� ����, ������ ������ �����
			//fos = new FileOutputStream("C:\\iotest\\test02.txt");
				// ������ �̸��� ������ ������ ���� ����, ������ ������ �̾��
			//fos = new FileOutputStream("C:\\iotest\\test02.txt", true);
			
			// File ��ü ���� �� ���ڷ� �Ѱ��ִ� �͵� ���� - ���� ������ ������
			File file = new File("C:\\iotest\\test02.txt");
			fos = new FileOutputStream(file);

			
			// ���Ͽ� ���� ����
				// ����Ʈ ������� ����ؾ� �ϱ� ������ ����ƮŸ���� �����͸� �����ؾ� ��
			fos.write("�ȳ��ϼ���".getBytes());
			fos.write("12345\n".getBytes());
			fos.write("��������".getBytes());
			
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� ����");
		} catch (IOException e) {
			System.out.println("���� ���� ���� ����");
		} finally {
			// ���� ��� ��Ʈ�� ���� ����
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("���� ���� ����");
			}
		}
	}

	public void method04() {
		System.out.println("------ ���� �Է� : FileInputStream -------");
		try(FileInputStream fis = new FileInputStream("C:\\iotest\\test02.txt")) {
			// read() �޼ҵ�� ���� ���� �о��
			// �Ű����� ���� read()�޼ҵ� : 1byte�� �о�ͼ� ����Ʈ��(�ƽ�Ű�ڵ尪)���� ����  
			System.out.println(fis.read());	// ù���� H�� �ƽ�Ű�ڵ尪 : 72
			// char������ ���� ����ȯ
			System.out.println((char)fis.read());	// �ι�°���� e�� �ƽ�Ű�ڵ尪�� �����ͼ� �������·� ����ȯ
			// ����Ʈ����(�ƽ�Ű�ڵ尪)�� �����͸� �Է¹޾Ƽ� �������·� ǥ�����ִ� �޼ҵ�
			System.out.write(fis.read());	// ����°���� l�� �ƽ�Ű�ڵ尪�� �����ͼ� �������·� ���
			System.out.println();
			
			// �о�� ������ �迭�� ����
			byte [] buffer = new byte[100];	// �Է°��� �ӽ÷� ������ �迭 ����
			// �Է½�Ʈ���� ���� ��� ������ �о�� ����Ʈ�� �迭�� ����
			fis.read(buffer);
			// �迭 ���� Ȯ�� 1
			for(int i = 0; buffer[i] != 0 ; i++) {
				System.out.print((char)buffer[i]);
			}
			System.out.println();
			// �迭 ���� Ȯ�� 2
			System.out.write(buffer);
			System.out.println();
			
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� ����");
		} catch (IOException e1) {
			System.out.println("���� �ݱ� ����");
		}
	}
	
	public void method05() {
		System.out.println("------- �̹��� ���� �Է� : FileInputStream -------");
		File file = new File("C:\\iotest\\���ζ�.jpg");		
		try(FileInputStream fis = new FileInputStream(file)) {
			// �̹��� ���� ũ�� �˾ƿ���
			System.out.println(file.length());
			// �̹��� ���� ������ ������ �ӽ� ���� ����
			byte [] buffer = new byte[(int)file.length()];
			// ���� ������ �ӽ� ������ ����
			fis.read(buffer);
			// �ӽ� ������ ����� ���� ���� ���
			System.out.write(buffer);
		} catch (IOException e1) {
			System.out.println("�̹��� ���� �Է� ����");
		}
		
	}

	public void method06() {
		System.out.println("------- ���� ��� : FileWriter -------");
		try(FileWriter fw = new FileWriter("C:\\iotest\\test03.txt")) {
			fw.write("HiHi\n");
			fw.write("Welcome");	
			System.out.println("���� ��� �Ϸ�");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}

	public void method07() {
		System.out.println("------- ���� �Է� : FileReader -------");
		try(FileReader fr = new FileReader("C:\\iotest\\test03.txt")) {
			// �Ѱ� ���� �о �������·� ����
			System.out.println(fr.read());
			// char�� �迭�� �о�� ���� ���� ����
			char [] str = new char[100];
			fr.read(str);
			// �迭 ���� ���
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("���� �Է� ����");
		}
		
	}

	public void method08() throws IOException {
		System.out.println("------- ���� ��Ʈ�� : DataOutputStream -------");
		// ���� ��� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:\\iotest\\test04.txt");
		// ������ ��� ���� ��Ʈ�� ����
		DataOutputStream dos = new DataOutputStream(fos);
		// ���Ͽ� ������ ����
		dos.writeUTF("Hello world");
		dos.writeUTF("�ȳ��ϼ���");
		dos.writeInt(65);
		// ��Ʈ�� ��ü �ݱ�
		dos.close();
		fos.close();
		
		System.out.println("------- ���� ��Ʈ�� : DataInputStream -------");
		// ���� �Է� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream("C:\\iotest\\test04.txt");
		// ������ �Է� ���� ��Ʈ�� ����
		DataInputStream dis = new DataInputStream(fis);
		// ���Ͽ��� ������ �о����
		System.out.println(dis.readUTF());
		System.out.println(dis.readUTF());
		System.out.println(dis.readChar());
		
		// ��Ʈ�� ��ü �ݱ�
		dis.close();
		fis.close();
	}
}