package kh.project1.test1;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		
	    Scanner scan = new Scanner(System.in);
		 

		//1�� 
	    // ����: �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String sex = scan.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = scan.nextDouble();
		System.out.println("Ű "+height+"cm�� "+age+"�� "+sex+"�� "+name+"�� �ݰ����ϴ� ^^");
		
		
		
		//2��
		// ����: Ű����� ���� �� ���� �Է� �޾� �� ���� ��,��,��,�������� ���� ����ϼ���.
		//  Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = scan.nextInt();
		
		System.out.println("���ϱ� ���: "+(num1+num2));
		System.out.println("���� ���: "+(num1-num2));
		System.out.println("���ϱ� ���: "+(num1*num2));
		System.out.println("������ ���: "+(num1/num2));
		
		
		
		//3��
		// ����: Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		// ��� ����) ����: ����*����, �ѷ�:(����+����)*2
		//  Scanner scan = new Scanner(System.in);
		
		System.out.print("���� :");
	    double width = scan.nextDouble();
	    System.out.print("���� :");
	    double length = scan.nextDouble();
	    System.out.print("���� :");
	    System.out.println(width*length);
	    System.out.print("�ѷ�: ");
	    System.out.println((width+length)*2);
	    
	    
	    
	    //4��
	    // Scanner scan = new Scanner(System.in);
	    // ����: ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String letter = scan.next();
		System.out.println("ù ��° ����: "+letter.charAt(0));
		System.out.println("�� ��° ����: "+letter.charAt(1));
		System.out.println("�� ��° ����: "+letter.charAt(2));
		
	/*
		Scanner scan = new Scanner(System.in); // Scanner��� Ŭ������ �̿��ؼ� scan�� ������ش�
		
		�ǽ� 1��
		
	    System.out.print("�̸��� �Է��ϼ���: ");
		String name = scan.next(); //�Է� ���� ������ ��� ������ �ؾ� ��밡�� -> ���� ������ְ� �̸� �����ֱ�
		System.out.print("������ �Է��ϼ���(��/��): ");
		//String sex = scan.next();
		char sex = scan.next().charAt(0); //�տ� �ѱ��� �ްڴ�
		System.out.print("���̸� �Է��ϼ���: ");
		int age = scan.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		Double height = scan.nextDouble();
		System.out.println("Ű "+height+"cm�� "+age+"�� "+sex+"�� "+name+"�� �ݰ����ϴ�^^");
		
		
		//�ǽ� 2��
		System.out.print("ù ��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = scan.nextInt();
		System.out.println("���ϱ� ��� :"+(num1+num2));
		System.out.println("���� ���: "+(num1-num2));
		System.out.println("���ϱ� ���: "+(num1*num2));
		System.out.println("������ ���: "+(num1/num2));
		
		
		//�ǽ� 3��
		System.out.print("����: ");
		Double num1 = scan.nextDouble();
		System.out.print("����: ");
		Double num2 = scan.nextDouble();
		System.out.println("����: "+(num1*num2));
		System.out.println("�ѷ�: "+(num1+num2)*2);

		
		//�ǽ� 4��
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = scan.next();
		System.out.println("ù ��° ����:" + str.charAt(0));
		System.out.println("�� ��° ����:" + str.charAt(1));
		System.out.println("�� ��° ����:" + str.charAt(2));
		
	*/
		
		
	}

}
