package kh.project1.test1;

// Scanner Class ����
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
	    // Scanner ����
		
		 Scanner scan = new Scanner(System.in);
		
	    // ���� �Է� �ޱ�
		int num1; // ���� ���·� �Է� ���� �Ŵϱ� �������� ���� �������
		System.out.print("������ �Է��ϼ���: ");
		num1 = scan.nextInt(); 
		System.out.println("�Է°�: "+num1);
		// �Ǽ� �Է¹ޱ�
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		float num2; // �Ǽ� ���·� �Է� ���� �Ŵϱ� �Ǽ����� ���� ������ֱ�
		num2 = scan.nextFloat();
		System.out.println("�Է°�: "+num2);
		System.out.print("�Ǽ�(double)�� �Է��ϼ���: ");
		double num3;
		num3 = scan.nextDouble();
		System.out.println("�Է°�: "+num3);
		
		// ���ڿ� �Է�
		// scan.next();  ������ �������� �Է��� ���� a b �Է��ϸ� a�� ��µ�
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str1; // ���ڿ� ���·� �Է� ���� �Ŵϱ� ���ڿ� ���� ���� ������ֱ�
		str1 = scan.next();
		System.out.println("�Է°�: "+str1);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str2;
		scan.skip("[\\r\\n]+"); // ��ĵ�� \\r\\n (����)�� ������ �Ѿ��  []+�� ��ŵ�� ����
		//scan.nextLine(); // ���� ���ֱ�
		str2 = scan.nextLine();
		System.out.println("�Է°�: "+str2);
		
		
		
		System.out.print("�̸�: ");
		String name = scan.next();
		System.out.print("����: ");
		int age = scan.nextInt();
		System.out.print("��ȭ��ȣ: ");
		String tel = scan.next();
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d�̰�, ��ȭ��ȣ�� %s �Դϴ�", name,age,tel);
		// System.out.println("�� �̸���"+name+"�̰�, ���̴�"+age+"�̰�, ��ȭ��ȣ��"+tel+"�Դϴ�.");
	
		

	}

}
