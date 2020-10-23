package kh.project1.test1;

// Scanner Class 포함
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
	    // Scanner 생성
		
		 Scanner scan = new Scanner(System.in);
		
	    // 정수 입력 받기
		int num1; // 정수 형태로 입력 받을 거니까 정수형태 변수 만들어줌
		System.out.print("정수를 입력하세요: ");
		num1 = scan.nextInt(); 
		System.out.println("입력값: "+num1);
		// 실수 입력받기
		System.out.print("실수를 입력하세요: ");
		float num2; // 실수 형태로 입력 받을 거니까 실수형태 변수 만들어주기
		num2 = scan.nextFloat();
		System.out.println("입력값: "+num2);
		System.out.print("실수(double)를 입력하세요: ");
		double num3;
		num3 = scan.nextDouble();
		System.out.println("입력값: "+num3);
		
		// 문자열 입력
		// scan.next();  공백을 기준으로 입력을 받음 a b 입력하면 a만 출력됨
		System.out.print("문자열을 입력하세요: ");
		String str1; // 문자열 형태로 입력 받을 거니까 문자열 형태 변수 만들어주기
		str1 = scan.next();
		System.out.println("입력값: "+str1);
		System.out.print("문자열을 입력하세요: ");
		String str2;
		scan.skip("[\\r\\n]+"); // 스캔아 \\r\\n (엔터)가 있으면 넘어가라  []+은 스킵의 문법
		//scan.nextLine(); // 엔터 없애기
		str2 = scan.nextLine();
		System.out.println("입력값: "+str2);
		
		
		
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.print("전화번호: ");
		String tel = scan.next();
		System.out.printf("제 이름은 %s이고, 나이는 %d이고, 전화번호는 %s 입니다", name,age,tel);
		// System.out.println("제 이름은"+name+"이고, 나이는"+age+"이고, 전화번호는"+tel+"입니다.");
	
		

	}

}
