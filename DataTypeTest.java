package kh.project1.test1;

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01000001 
		System.out.println(0b01000001);
		System.out.println((double)0b01000001);
		System.out.println((char)0b01000001);
		
		// ����
		System.out.println(100); // ������ ���¸� ���� ������ �Ǵ�
		//�ڷ����� �˷����� ������ ������ int�� �����Ѵ� 4byte�� �����Ѵ�
		System.out.println(3.5); // ������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println((int)3.5); // �Ǽ��� ������ �ٲ㼭 ǥ��
		// ������ 3.5�ε� ������ �ٲ� 3�� ��µ�
		System.out.println('A'); // ������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println((int)'A'); // ���Ϲ��ڸ� ������ �ٲ㼭 ǥ��
		
		
		// �Ǽ�
		System.out.println(5.6); // ������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println(20); // ������ ���¸� ���� ������ �Ǵ�
		System.out.println((double)20); // ������ �Ǽ��� �ٲ㼭 ǥ��
		System.out.println('C'); // ������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println((double)'C'); // ���Ϲ��ڸ� �Ǽ��� �ٲ㼭 ǥ��
		
		// ���Ϲ���
		System.out.println('J'); // ������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println(100); // ������ ���¸� ���� ������ �Ǵ�
		System.out.println((char)100); // ������ ���Ϲ��ڷ� �ٲ㼭 ǥ��
		System.out.println(65.6); // ������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println((char)65.6); //�Ǽ��� ���Ϲ��ڷ� �ٲ㼭 ǥ��(�Ҽ��� ���ڸ� ����)
		System.out.println((char)0xc815); //��
		System.out.println((char)0xc720); //��
		System.out.println((char)0xbbf8); //��
		System.out.println((char)0xc190); //��
		System.out.println((char)0xC8FC); //��
		System.out.println((char)0xC5f0); //��
		
		// ���ڿ�
		System.out.println("Hello"); // ������ ���¸� ���� ���ڿ��� �Ǵ�
		
		// ����(Boolean)
		System.out.println(true); // ������ ���¸� ���� Boolean������ �Ǵ�
		System.out.println(false); // ������ ���¸� ���� Boolean������ �Ǵ� 
		
		// �ڷ��� ũ�� �˾ƿ���(bit����)
		//�ڷ���.SIZE
		//String, Boolean�� �ȵ�
		//int = Integer, char = Character , �������� �ڷ��� ù���ڸ� �빮�ڷ� ���
		
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Character.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
	}
}
