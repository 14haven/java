package kh.project1.test1;

import java.util.Scanner;
public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if(num % 2 == 0) {
//			if(num == 0) {
//				System.out.println("0입니다.");
//			}else {
//			System.out.println("짝수입니다.");
//		}
//		}else {
//			System.out.println("홀수입니다.");
//		}
//				
//		

		
		
//		if(num > 0) {
//			System.out.println("양수입니다.");
//			System.out.println("조건이 참입니다.");
//		}
//		else {
//			System.out.println("양수가 아닙니다.");
//		}
//		System.out.println("프로그램 종료");
//		

//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//				System.out.println("홀수");		
//			}
		
//		if(num > 0) {
//			System.out.println("0보다 큰 수");	
//		}else if (num < 0) {
//			System.out.println("0보다 작은 수");
//		}else {
//			System.out.println("0과 같은 수");
//		}
		
		
//		int month = scan.nextInt();
//		String season;
//		if(month ==1 || month ==2 || month == 12) {
//			season = "겨울";	
//		} else if(month >= 3 && month <=5) {
//			season = "봄";
//		} else if(month >= 6 && month <=8) {
//			season = "여름";
//		} else if(month >=9 && month <=11) {
//			season = "가을";
//		} else {
//			season = "해당하는 계절이 없습니다.";
//		}
//		 System.out.println(season);
		 
		
//		System.out.print("월 입력: ");
//		int month = scan.nextInt();
//		System.out.print("온도 입력: ");
//		int temperature = scan.nextInt();
//		String season = "";
//		
//		if(month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//			if(temperature <= -15) {
//					season += " 한파 경보";
//			} else if(temperature <= -12) {
//				    season += " 한파 주의보";
//			}
//		} else if (month >= 3 && month <= 5) {
//			  		season = "봄";
//		} else if (month >= 6 && month <= 8) {
//					season = "여름";
//					if(temperature >= 35) {
//							season += " 폭염 경보";
//					} else if(temperature >= 33) {
//							season += " 폭염 주의보";
//					}
//		} else if (month >= 9 && month <= 11) {
//					season = "가을";
//		} else {
//					season = "해당하는 계절이 없습니다.";
//		}
//		System.out.println(season);
		
		
		
//		System.out.println("##놀이 공원 프로그램##");
//		
//		int num1 = 15000; // 어른 입장료
//		int num2 = 5000; // 아이 입장료
//		int money; // 총 금액
//		
//		
//		System.out.print("입장 하실 인원은 총 몇 명입니까? ");
//		int total = scan.nextInt(); // 입장할 인원 입력 받음
//		if (total <=0) { // 입장 인원이 0명 일 때
//			System.out.println("인원 수를 다시 입력하세요");
//		} else if (total >=1 ) { // 입장 인원이 0명이 아니라면 
//			System.out.print("어른은 몇 명 입니까?(인원당 1만 5천원) "); //어른 인원 입력 받음
//			int adult = scan.nextInt();
//			
//				if ( adult == total ) { // 어른 인원이 총 인원과 같을 때
//						money = adult*num1;
//						System.out.println("지불하실 총 금액은 "+money+"원 입니다");
//				} else if ( adult > total ) { //어른 인원이 총 인원보다 많을 때  
//					System.out.print("인원 수를 다시 입력하세요");
//				} else if ( adult < total ) { // 어른 인원이 총 인원보다 적을 때
//					System.out.print("아이는 몇 명 입니까?(인원당 5천원) "); // 아이 인원 입력 받음
//					int kids = scan.nextInt(); 
//					
//					if (kids == total) { //아이 인원이 총 인원과 같을 때
//						money = kids*num2;
//					} else if ( (kids+adult) > total || (total-adult) != kids ) {
//						//아이 인원이 총 인원보다 많거나 총 인원에서 어른 인원을 뺀 것과 다를 때
//						System.out.println("인원 수를 다시 입력하세요");
//					} else { 
//						money = (adult*num1)+(kids*num2);
//						 System.out.println("지불하실 총 금액은 "+money+"원 입니다");
//				}
//	  }
//    }
		
		
		//놀이공원 프로그램
//		int total, adult, child=0;
//		System.out.println("## 놀이공원 프로그램##");
//		System.out.print("입장하실 인원은 총 몇명입니까?");
//		total = scan.nextInt();
//		if(total > 0) {
//			System.out.print("어른은 몇 명입니까?(인원당 1만 5천원)");
//			adult = scan.nextInt();
//			if( total > adult) {
//				System.out.print("아이는 몇 명입니까?(인원당 5천원)");
//				child = scan.nextInt();
//			}
//			if(total == adult +child) {
//		System.out.println("지불하실 총 금액은 "+(15000*adult+5000*child)+"원 입니다.");
//		}else {
//			System.out.println("인원수가 맞지 않습니다.");
//		}
//		}else {
//			System.out.println("장난치지말고 집에 가세요~!!");
//		}
//		
		
		
		
		
		
		
//		// 계산기 만들기 (if문 사용)
//		
//		System.out.print("##계산기##\n1.더하기\n2.빼기\n3.나누기\n4.곱하기\n");
//		System.out.print("숫자 입력: ");
//		int num1 = scan.nextInt();
//		System.out.print("숫자 입력: ");
//		int num2 = scan.nextInt();
//		System.out.print("선택: ");
//		int num3 = scan.nextInt();
//			if (num3 == 1 || num3 == 2 || num3 == 3 || num3 == 4) {
//				double total ;
//				if (num3 == 1) {
//					total = num1 + num2;
//				} else if (num3 ==2) {
//					total = num1 - num2;
//				} else if (num3 ==3) {
//					if (num1<0 || num2<=0) {
//						System.out.print("번호를 다시 누르세요");
//				} else { 
//					total = num1 / num2 ;
//							}
//				} else if (num3 ==4) {
//					total = num1 * num2;
//				}
//			} else {
//				System.out.print("번호를 다시 누르세요");
//			} System.out.println(total);
//		
		
		//계산기 풀이
//		System.out.println("## 계산기##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.print("선택: ");
//		int select = scan.nextInt();
//		if(select > 0 && select <5) {
//		System.out.print("숫자 1 입력: ");
//		int num1 = scan.nextInt();
//		System.out.print("숫자 2 입력: ");
//		int num2 = scan.nextInt();
//		if(select == 1) {
//			System.out.println("결과: "+(num1 + num2));
//		}else if(select ==2) {
//			System.out.println("결과: "+(num1 - num2));
//		}else if(select ==3) {
//			if(num2 !=0) {
//				System.out.println("결과: "+((double)num1 / num2));
//			}else {
//				System.out.println("0으로 나눌 수 없습니다~!");
//			}
//		}else if(select ==4) {
//			System.out.println("결과: "+(num1 * num2));
//		}
//		}else {
//			System.out.println("잘못된 선택입니다.");
//		}
//		
		
		
		
		
		
		 //switch문 예시
//		System.out.print("정수를 입력하세요: ");
//		int select = scan.nextInt();
//		switch(select)
//		{
//		case 1 : System.out.println("1 입력");
//				break;
//		case 2 : System.out.println("2 입력");
//				break;
//		case 3 : System.out.println("3 입력");
//				break;
//		case 4 : System.out.println("4 입력");
//				break;
//		default : System.out.println("기타입력");
//		}
		
//		System.out.print("정수를 입력하세요: ");
//		int select = scan.nextInt();
//		switch(select/10)
//		{
//		case 0 : System.out.println("0~9입력");
//			break;
//		case 1 : System.out.println("10~19입력");
//			break;
//		case 2 : System.out.println("20~29입력");
//			break;
//		case 3 : System.out.println("30~39입력");
//			break;
//		case 4 : System.out.println("40~49입력");
//			break;
//			//default : System.out.println("기타입력");
//		}
		
//		System.out.print("정수를 입력하세요: ");
//		int select = scan.nextInt();
//		switch(select)
//		{
//		case 0 : 
//		case 5: System.out.println("0 또는 5 입력");
//			break;
//		case 3 : 
//		case 7 : 
//		case 9 : System.out.println("3,7,9 입력");
//			break;
//			//default : System.out.println("기타입력");
//		}
		
		
		// swtich를 이용해서 문자나 문자열로도 가능
//		System.out.print("이름을 입력하세요: ");
//	    String select = scan.next();
//		switch(select)
//		{
//		case "이은지" : 
//		case "김우영" : System.out.println("1팀입니다.");
//			break;
//		case "최민재" : 
//		case "김지민" : 
//		case "박주희" : System.out.println("2팀입니다.");
//			break;
//			//default : System.out.println("기타입력");
//		}
		
//		System.out.print("정수를 입력하세요: ");
//		int num = scan.nextInt();
//		String team ;
//		switch(num%5) {
//		case 1:
//				team ="1조";
//				break;
//		case 2:
//				team ="2조";
//				break;
//		case 3:
//				team ="3조";
//				break;
//		case 4:
//				team ="4조";
//				break;
//		default:
//				team = "다시";
//		} 
//		System.out.println(team);
		
		
		
		
		
//		System.out.println("##계산기##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.print("선택: ");
//		int num = scan.nextInt();
//		System.out.print("첫 번째 숫자: ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 숫자: ");
//		int num2 = scan.nextInt();
//		
//		switch(num) {
//		case 1: System.out.println("결과: "+(num1 + num2));
//			break;
//		case 2: System.out.println("결과: "+(num1-num2));
//			break;
//		case 3: 
//			 {switch(num2){
//			  case 0:System.out.println("다시");
//			 	break;
//		
//			 	default:
//			 		System.out.println("결과: "+((double)num1/num2));}
//			 } break;
//		case 4: System.out.println("결과: "+(num*num2));
//			break;
//		default:System.out.println("다시");
//		}
		
		
		
		
		System.out.println("##계산기##");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.나누기");
		System.out.println("4.곱하기");
		System.out.print("선택: ");
		int num = scan.nextInt();
		System.out.print("첫 번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = scan.nextInt();
		
		switch(num) {
		case 1: System.out.println("결과: "+(num1 + num2));
			break;
		case 2: System.out.println("결과: "+(num1-num2));
			break;
		case 3: 
			 {if(num2 !=0) {
				 System.out.println("결과: "+((double)num1/num2));
			 }else {
				 System.out.println("다시");
			 }
			 } break;
		case 4: System.out.println("결과: "+(num*num2));
			break;
		default:System.out.println("다시");
		}
		
		
		
			 
	  }
	} 


