package kh.project1.test1;

public class PrintTest {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.5;
		
		// print()
		System.out.print(10);
		System.out.print(3.5);
		System.out.print("Hello");
		
		// println()
		System.out.println(10);
		System.out.println(3.5);
		System.out.println("Hello");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(10+20); // ����� �� �� ����
		System.out.println("�ȳ��ϼ���"+"��������~!"); //���ڿ��� �����ؼ��� ��� �� �� ����
		
		// printf("����� ����" [, ���ڰ�,...]);
		System.out.printf("�ȳ��ϼ���\t����Ʈ����");
		System.out.printf("\\\\����\"�ð���.....\n"); // \\��ǥ�� �ΰ��� ū����ǥ
		String name = "ȫ�浿";
		int age = 20;
		System.out.printf("���̸��� %s�̰�, ���̴� %d�� �Դϴ�\n" , name, age); //���̸� �Ǽ� ���·� ����Ѵٴ���, ���¸� ��ȯ�Ͽ� ����� �� �ִ�.
		System.out.println("���̸��� "+name+"�̰�, ���̴� "+age+"�� �Դϴ�"); //�ٸ� ���·� ��ȯ�ؼ� ����ϱ�� �����.
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65);
		
		
		
		
		

	}

}
