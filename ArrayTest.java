package kh.project1.test1;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
//		int[] arr= new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr); // arr�� �ּҰ��� ��µȴ�.
//		// �ʱⰪ: boolean - false. char = \u0000
//		// ������ - 0 , �Ǽ��� - 0.0, ������ - null
		
		
		
//		int[] arr = new int[5];
//		
//		for(int i=0; i<arr.length ; i++) {
//			arr[i]= (i+1)*10;
//		} //arr �迭 ����
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
//		} // arr ���
		
		
//		String[] cClass = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<cClass.length; i++) {
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C������ �л���� ##");
//		for(int i=0; i<cClass.length; i++) {
//			System.out.println("�̸�: "+cClass[i]);
//		}
//	
	
//		int[] num = new int[5];
//		int sum =0; ;
//		Scanner scan = new Scanner(System.in);
//		for (int i=0; i<num.length; i++) {
//			System.out.print(i+1+"��° �� �Է�:");
//			num[i] = scan.nextInt();
//		} for (int j=0 ; j<num.length; j++) {
//			sum += num[j] ;
//		} for( int s=0 ; s<num.length-1; s++) {
//			System.out.print(num[s]);
//			System.out.print(" + ");
//			
//		}
//		System.out.print(num[num.length-1]);
//		System.out.print(" = ");
//		System.out.println(sum);
//	
		
		
		int[] num = new int[5];
		int sum =0; ;
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<num.length; i++) {
			System.out.print(i+1+"��° �� �Է�:");
			num[i] = scan.nextInt();
			sum += num[i];
		} for( int s=0 ; s<num.length; s++) {
			System.out.print(num[s]);
			if(s != num.length-1) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = "+sum);


		
//		System.out.println("### �ζ� ��ȣ ������ ###");
//		Scanner scan = new Scanner(System.in);
//		
////		System.out.println(Math.random());
////		// (����ȯ)(Math.random()*����+���ۼ�)
//		
//		System.out.print("������ ��ȣ ����: ");
//		int num = scan.nextInt();
//
//		for (int s=0; s<num.length; s++) {
//		
//		System.out.print((int)(Math.random()*45+1)+" ");
//	
		
		
		
		
		
		}		
	}


