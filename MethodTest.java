package kh.project1.test1;
import java.util.Scanner;
public class MethodTest {

	public static int[] func1(int num) {
		System.out.println("func1 메서드");

		int[] arr = new int[num];
		for(int i=0; i<arr.length ; i++){
			arr[i] = i*10 ;
		} 
		return arr; 
	}
	public static int func2(int num) {
		System.out.println("func1 메서드");

		int sum = 0;
		for(int i=0; i<=num ; i++) {
			sum += i;
		} 
		return sum; // 정수형태의sum이라는 결과값을 남겨두겠다.
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
		

		
		
		 //계산기의 각 기능을 함수로 구현
		System.out.println("## 계산기 ##");
		System.out.println("1.더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.print("선택: ");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		if(select>0 && select<5) {
			System.out.print("첫번재 숫자를 입력하세요:");
			int fir = scan.nextInt();
			System.out.print("두번째 숫자를 입력하세요:");
			int sec = scan.nextInt();
			
			
			switch(select) {
			case 1 : System.out.println("결과: "+plus(fir,sec));
					break;
			case 2 : System.out.println("결과: "+minus(fir,sec));
					break;
			case 3 : System.out.println("결과: "+g(fir,sec));
					break;
			case 4 :if (sec !=0) {
				System.out.println("결과: "+n(fir,sec));
					break;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
					break;
			}
			}
		} else {
			System.out.println("번호를 다시 선택하세요");
		}
	
		
//		int [] sum;
//		System.out.println("메인메서드");
//		sum = func1(10);
//		System.out.println("메인에서 받아온 arr 주소: "+sum);
//		for(int i=0; i<sum.length; i++) {
//			System.out.println(sum[i]);
//		}
		
	
		
//		System.out.println("메인 메서드");
//		int sum = func1(10);
//		System.out.println(sum);
//		System.out.println("메인 메서드2");
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
