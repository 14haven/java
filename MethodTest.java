package kh.project1.test1;
import java.util.Scanner;
public class MethodTest {

	public static int[] func1(int num) {
		System.out.println("func1 �޼���");

		int[] arr = new int[num];
		for(int i=0; i<arr.length ; i++){
			arr[i] = i*10 ;
		} 
		return arr; 
	}
	public static int func2(int num) {
		System.out.println("func1 �޼���");

		int sum = 0;
		for(int i=0; i<=num ; i++) {
			sum += i;
		} 
		return sum; // ����������sum�̶�� ������� ���ܵΰڴ�.
	}

	
	public static int plus(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	} 
	
	public static int minus(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	public static int g(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
	public static int n(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}
	
	public static int nam(int num1, int num2) {
		int sum = num1 % num2;
		return sum;
	}
	
	public static void main(String[] args) {
		

		
		
		 //������ �� ����� �Լ��� ����
		System.out.println("## ���� ##");
		System.out.println("1.���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.print("����: ");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		if(select>0 && select<5) {
			System.out.print("ù���� ���ڸ� �Է��ϼ���:");
			int fir = scan.nextInt();
			System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
			int sec = scan.nextInt();
			
			
			switch(select) {
			case 1 : System.out.println("���: "+plus(fir,sec));
					break;
			case 2 : System.out.println("���: "+minus(fir,sec));
					break;
			case 3 : System.out.println("���: "+g(fir,sec));
					break;
			case 4 :if (sec !=0) {
				System.out.println("���: "+n(fir,sec));
					break;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
					break;
			}
			}
		} else {
			System.out.println("��ȣ�� �ٽ� �����ϼ���");
		}
	
		
//		int [] sum;
//		System.out.println("���θ޼���");
//		sum = func1(10);
//		System.out.println("���ο��� �޾ƿ� arr �ּ�: "+sum);
//		for(int i=0; i<sum.length; i++) {
//			System.out.println(sum[i]);
//		}
		
	
		
//		System.out.println("���� �޼���");
//		int sum = func1(10);
//		System.out.println(sum);
//		System.out.println("���� �޼���2");
//		System.out.println(func1(20));
//		System.out.println(func1(20)+10);
//		func1(10);
		
	
//		int num = 10;
//		int sum = 0;
//		for(int i=0; i<=num ; i++) {
//			sum += i;
//		} 
//		System.out.println(sum);
//
//			
//		num = 20;
//		sum=0;
//		for(int i=0; i<=num ; i++) {
//			sum += i;
//		} 
//		System.out.println(sum);
		
	}

}
