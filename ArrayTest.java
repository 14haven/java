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
//		System.out.println(arr); // arr의 주소값이 출력된다.
//		// 초기값: boolean - false. char = \u0000
//		// 정수형 - 0 , 실수형 - 0.0, 참조형 - null
		
		
		
//		int[] arr = new int[5];
//		
//		for(int i=0; i<arr.length ; i++) {
//			arr[i]= (i+1)*10;
//		} //arr 배열 만듬
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
//		} // arr 출력
		
		
//		String[] cClass = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<cClass.length; i++) {
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C강의장 학생목록 ##");
//		for(int i=0; i<cClass.length; i++) {
//			System.out.println("이름: "+cClass[i]);
//		}
//	
	
//		int[] num = new int[5];
//		int sum =0; ;
//		Scanner scan = new Scanner(System.in);
//		for (int i=0; i<num.length; i++) {
//			System.out.print(i+1+"번째 수 입력:");
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
			System.out.print(i+1+"번째 수 입력:");
			num[i] = scan.nextInt();
			sum += num[i];
		} for( int s=0 ; s<num.length; s++) {
			System.out.print(num[s]);
			if(s != num.length-1) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = "+sum);


		
//		System.out.println("### 로또 번호 생성기 ###");
//		Scanner scan = new Scanner(System.in);
//		
////		System.out.println(Math.random());
////		// (형변환)(Math.random()*갯수+시작수)
//		
//		System.out.print("생성할 번호 갯수: ");
//		int num = scan.nextInt();
//
//		for (int s=0; s<num.length; s++) {
//		
//		System.out.print((int)(Math.random()*45+1)+" ");
//	
		
		
		
		
		
		}		
	}


