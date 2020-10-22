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
		System.out.println(10+20); // 연산식 들어갈 수 있음
		System.out.println("안녕하세요"+"집가야지~!"); //문자열을 연결해서도 사용 할 수 있음
		
		// printf("출력할 서식" [, 인자값,...]);
		System.out.printf("안녕하세요\t프린트에프");
		System.out.printf("\\\\벌써\"시간이.....\n"); // \\원표시 두개와 큰따옴표
		String name = "홍길동";
		int age = 20;
		System.out.printf("제이름은 %s이고, 나이는 %d살 입니다\n" , name, age); //나이를 실수 형태로 출력한다던지, 형태를 변환하여 출력할 수 있다.
		System.out.println("제이름은 "+name+"이고, 나이는 "+age+"살 입니다"); //다른 형태로 변환해서 출력하기는 힘들다.
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65);
		
		
		
		
		

	}

}
