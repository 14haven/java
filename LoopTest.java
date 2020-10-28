package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("반복할 횟수: ");
//		int t = scan.nextInt();
//		int i = 1; //초기식
//		
//		while(i<=t){ //조건식
//			System.out.println(i+"번째 반복");
//			i++; //증감식
//		}
		
		//수를 입력받아서 입력 받은 수 만큼 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("반복할 횟수: ");
//		int count = scan.nextInt();
//		int i = 0; //반복문에서 사용할 변수 , 초기식
//		//반복문 안에 초기식이 들어오면 안된다. 반복문의 조건에서 사용할 것이기 때문에
		
		
//		while(i<count) { //조건식 -> 반복문 안에 들어와있어도 됨
//			i++; //증감식 , 반복문이 진행되는 동안 증감이 되어야 한다. 반복문 안에 있어야 한다.
//			System.out.println(i+"번째 반복");
		
//		while(true) {
//			if(i >= count)
//				return; // 반복문을 빠져 나와라 , 메서드 자체를 종료시키는 분기문, 지금은 main메서드 안에 있기 때문에 main 종료
//			    //break;를 사용해줘도 됨 if문을 제외한 제어문 하나를 빠져나와주는 분기문
				
//		while(count > 0) { //조건식
//			System.out.println(count+" 반복");
//			count --; //증감식
//			
//		}
//		System.out.println("프로그램 종료부분");
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int num = scan.nextInt();
//		int num1 =0;
//		
//		while(num>0) {
//			
//			num1 += num; //누적
//			num--;
//					
//		} System.out.println("합계:"+num1);
		
		
		//0부터 입력받은 수 까지의 합을 구하기
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		//5 -> 0+1+2+3+4+5 ...
//		int i=1 ;
//		int sum=0;
//		while(i<=count) {
//			sum += i;
//			i++;
//			
//		}System.out.println(sum);

		//수를 입력 받아 0부터 입력 받은 수까지의 짝수들 합 구하기
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int count = scan.nextInt();
//		
//		// 5-> 0+2+4
//		int i=1;
//		int sum=0;
//		while (i<=count) {
//			sum += i;
//			i+=2;
//			
//		} System.out.println(sum);
//		
	
		
		// 구구단 출력하기(입력 받은 단 하나)
		
//		System.out.print("몇 단을 출력하시겠습니까?");
//		Scanner scan = new Scanner(System.in);
//		int thr = scan.nextInt();
//		int num=1;
//		while(num<=9) {
//			System.out.println(thr+" x "+num+" = "+(thr*num));
////			System.out.printf("%d x %d = %d \n", thr, i, thr*i);
//			num++;
//		}
		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//		System.out.println("##계산기##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.println("5.종료");
//		System.out.print("선택:");
//		int select = scan.nextInt();
//		
//			if(select>0 && select<=4) {
//			System.out.print("숫자1 입력:");
//			int num1 = scan.nextInt();
//			System.out.print("숫자2 입력:");
//			int num2 = scan.nextInt();
//			
//			if(select == 1) {
//				System.out.println("결과: "+(num1+num2));
//			}else if(select == 2) {
//				System.out.println("결과: "+(num1-num2));
//			}else if(select == 3) {
//				if (num2 ==0) {
//					System.out.println("0으로는 나눌 수 없습니다.");
//				}else {
//				System.out.println("결과: "+((double)num1/num2));
//				}
//			}else if(select == 4) {
//				System.out.println("결과: "+(num1*num2));
//			
//			}
//				
//		}else if(select ==5) {
//			 break;
//		}else {
//			System.out.println("번호를 다시 선택하세요");
//		}
//		
//		}
		
		
		//do-while (무조건 한 줄은 실행시키고 싶을 때)
//		int i = 1;
//		do {
//			System.out.println(i+" 출력");
//			i++;
//		}while(i <= 10);
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
////		int num;
////		do{
////			System.out.println("정수 입력(종료0): ");
////			num = scan.nextInt();
////			System.out.println("입력 값: "+num);
////		}while(num != 0);
//		
//		
//		
//		//while로 구현하기
//		int num=1; //조건식으로 쓸 변수 초기값 넣어줘야함
//		while(num != 0) {
//			System.out.println("정수 입력(종료0) :");
//			num = scan.nextInt();
//			System.out.println("입력 값: "+num);
//		}
		
		
		//for문 예시
		
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + "출력");
//		}
		
		
//		int i=1; //초기값 생략 가능
//		for( ;i<=10;i++) {
//			System.out.println(i+" 출력");
//		}
//		
		
//		int i=1;
//		for( ;i<=10; ) { //증감식 생략 가능
//			System.out.println(i+" 출력");
//			i++;
//		}
//		
		
//		int i=1;
//		for(;;) { //무한루프 //while(true)
//			System.out.println(i+" 출력");
//			i++;
//		}
		
		
//		for(int i=1,j=10 ; i<10 ; i++,j--) {
//			// 1부터 시작해서 1씩 증가하는 값도 필요하지만 10부터 시작해서 1씩 감소하는 값도 필요해
//		System.out.println(i+" i출력");
//		System.out.println(j+" j출력");
//		}

		
		
//		 Scanner scan = new Scanner(System.in);
//		 System.out.print("반복할 횟수:");
//		 int num = scan.nextInt();
//		 for (int count=1 ; count<=num ; count++) {
//			 System.out.println(count+"번째 반복");
//		 }
		 
		
//		for(int i=0 ; i<10 ; i++) {
//			System.out.println("## 외부 반복문"+i);
//			for(int j=0 ; j<10 ; j++) {
//				System.out.println("외부"+i+"에 대한 내부 반복문"+j);
//			}
//		}
		
		
		
		
		//for문 사용하여 구구단 출력하기(2~9단)
		
//		for(int firdan=2 ; firdan<10 ; firdan++) {
//			for(int secdan=1; secdan<10 ; secdan++) {
//				System.out.println(firdan+" x "+secdan+" = "+(firdan*secdan));
////				System.out.printf("%d x %d = %d\n", firdan, secdan, firdan*secdan);	
//			}
//		}
		 
		//while문을 사용해서 구구단 출력하기(2~9단)
		
//		int i = 2;
//		while(i<10) {
//			int s = 1; //중첩해서 쓸 때 초기화 밖에 하면 안됨
//			while(s<10) {
//				System.out.printf("%d x %d = %d\n", i, s, i*s);
//				s++;
//			} i++;
//		}
		
//		for(int i=2 ; i<10 ; i++) {
//		for(int j=1; j<10 ; j++) {
//			System.out.printf("%d x %d = %2d", i, j, i*j);
//			System.out.print("  ");
//		} System.out.println(); //System.out.println("\n"); 해줘도 됨
//	}
		
		
//		for(int j=1 ; j<=9 ; j++) {
//		for(int i=2 ; i<=9 ; i++) {
//			
//			System.out.printf("%d x %d = %2d", i, j, i*j  );
//			System.out.print("   ");
//			
//		}System.out.println("");
//		
//		}
//		//고정되는 수가 밖에 있게 하기
		
		System.out.println("## 별찍기 1 ##");	
		for(int j=0 ; j<5; j++) { //줄을 바꿔주는 반복문
		for(int i=0; i<=j ;i++) { //별을 출력해주는 반복문
			System.out.print("☆");
		 }System.out.println();
		}
	}
}
		
		
//		System.out.println("## 별찍기 3 ##");
//		
//		for(int i=1 ; i<6 ; i++) {
//			for(int j=4 ; j>i-1; j--) {
//				System.out.print("    ");
//			} 
//			
//			for(int s=1 ; s<=i ; s++) {
//				System.out.print("☆");
//			}System.out.println();
//		}
		
		
//		System.out.println("## 별찍기 3##");
//		
//		
//		for (int j=1; j<=5; j++ ) {
//			for(int s=4 ; s>=j ;s--) {
//			System.out.print("    ");
//			}
//			for (int i=0; i<j; i++ ) {
//			System.out.print("☆");
//		} System.out.println();
//		}
//		

		
//		System.out.println("## 별찍기3 ##");
//		String star;
//		for(int j=0; j<5; j++) {
//			star = "";
//			for(int i=0; i<=j ; i++) {
//				star += "*";
//				
//			} System.out.printf("%5s\n", star);
//		}
		
		
		// if문 써서 별찍기 3
		
//		for(int i=1; i<6; i++) {
//			for(int j=5; j>0; j--) {
//				if(i<j) {
//					System.out.print("    ");
//				} else {
//					System.out.print("☆");
//				}
//			}
//			System.out.println("" );
//		}
		
		

		
		
		
		
		
//		System.out.println("## 별찍기4 ##");
//		
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<i; j++) {
//				System.out.print("    ");
//			} for(int s=5; s>=i; s--) {
//				System.out.print("☆");
//			} System.out.println();
//		}
//		
		
		
		
		
		//분기문
		
//		for(int j=0; j<10 ; j++) {
//			System.out.println(j+" 외부 출력");
//			for(int i=0; i<10; i++) {
//				System.out.println(i+" 내부 출력");
//				if(i==5) {
//					return; //제어문을 아예 다빠져나오려면 return
//					// break; 제어문을 한개만 빠져나오려면
//				}
//			}
//		}
		
		//continue
		
//		for(int i=1; i<=10; i++) {
//			System.out.println("for문 안에 들어옴");
//			if(i % 2 == 0) {
//				continue;
//			}
//			System.out.println(i+" 출력");
//		}
		
//		for(int i=1; i<-10; i++) {
//			System.out.println("for문 안에 들어옴");
//			if(i % 2 != 0) {
//				System.out.println(i+" 출력");
//			}
//		}
		
		//소수 찾기 문제
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("1~100 사이의 정수를 입력하세요: ");
//		int num = scan.nextInt();
//		
//		if (num>0 && num<101) {
//			if(num!=0) {
//			
//				for(int i=2; i<num; i++) { //내가 입력받은 값을 2부터시작해서 입력받은 값 직전까지 나누었을때 나뉘면 소수가아님
//					if(num%i ==0) {
//						System.out.println(num+"은(는) 소수가 아닙니다.");
//						return;
//					} 
//				} System.out.println(num+"은(는) 소수입니다.");
//		
//	
//	
//			}
//			 else {System.out.println("1은 소수가 아닙니다.");	
//			}
//		}
//		else {
//			System.out.println("1~100 사이의 정수를 입력하세요!");
//		}
	
		
		
	//선생님이 푼 것
//		Scanner scan = new Scanner(System.in);
//		System.out.print("1~100 사이의 정수를 입력하세요: ");
//		int num = scan.nextInt();
//		boolean result = true;
//		
//		if (num>0 && num<101) {
//			if(num!=0) {
//			
//				for(int i=2; i<num; i++) { //내가 입력받은 값을 2부터시작해서 입력받은 값 직전까지 나누었을때 나뉘면 소수가아님
//					if(num%i ==0) {
//						result = false;
//					} 
//				} 
//				if(result) {
//				System.out.println(num+"은(는) 소수입니다.");
//				} else{
//					System.out.println(num+"은(는) 소수가 아닙니다.");
//				}
//		
//	
//	
//			}
//			 else {System.out.println("1은 소수가 아닙니다.");	
//			}
//		}
//		else {
//			System.out.println("1~100 사이의 정수를 입력하세요!");
//		}
		Scanner scan = new Scanner(System.in);
		System.out.print("1~100 사이의 정수를 입력하세요: ");
		int num = scan.nextInt();
		boolean result = true;
		
		
		if(num < 1 || num > 100) {
			System.out.println("1~100 사이의 정수를 입력하세요!");
		} else if(num==1) {
			System.out.println("1은 소수가 아닙니다.");
		} else {
			for(int i = 2; i < num; i++) {
				if(num % i ==0) {
					result = false;
				}
			}
			if(result) {
						System.out.println(num+"은(는) 소수 입니다.");
						} else{
							System.out.println(num+"은(는) 소수가 아닙니다.");
						}
				}
			
//		break; //제어문 종료
//		return; //메서드 종료
//		System.exit(0); //프로그램 종료
		}
		
	}

