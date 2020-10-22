package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언
		int num;
		// 변수 사용 - 값 대입
		num = 10;
		// 변수 사용 - 값 읽기
		System.out.println(num); // 10
		
		num = 10+20;
		System.out.println(num); // 30
		
		// 변수 선언 후 바로 값 대입(초기값)
		int num2 = 20;
		// 여러개의 변수 동시에 선언(같은 자료형만 가능)
		int num3, num4, num5;
		// 여러개의 변수 동시에 선언 후 바로 값 대입(초기값)
		int num6, num7 = 40, num8 = 50; // num6에는 아무 값도 없는 상태
		
		// 변수갑을 다른 변수에 대입
		int num9 = 10;
		int num10 = num9;
		
		// 변수값을 이용해 연산 후 다시 대입
		int num11 = 100;
		System.out.println(num11); // 100
		num11 = num11 + 1;
		System.out.println(num11); // 101
		
		// 데이터 타입에 따른 변수 선언
		byte num01 = 100; //1byte 크기의 정수형태 공간
		System.out.println("num01변수 값:" + num01); // 100
		short num02 = 10000; //2byte 크기의 정수형태 공간
		System.out.println("num02변수 값:"+ num02); // 10000
		int num03 = 10000000; // 4byte 크기의 정수형태 공간
		System.out.println("num03변수 값:"+ num03); // 10000000
		long num04 = 10000000000L; // 8byte 크기의 정수 형태 공간
		System.out.println("num04변수 값:"+ num04);  //10000000000
		float num05 = 3.5F; // 4byte 크기의 실수형태 공간
		System.out.println("num05변수 값:"+ num05); // 3.5
		double num06 = 12345.234; // 8byte 크기의 실수형태 공간
		System.out.println("num06변수 값:"+ num06); // 12345.234
		char ch = '가'; // 2byte 크기의 단일문자형태 공간
		System.out.println("ch변수 값:"+ch); 
		String str = "배부름~!!"; // 가변크기의 문자열 형태 공간(크기가 그때 그때 변한다)
		System.out.println("str변수 값: "+str); // 배부름~!!
		System.out.println("str변수 값: "+str.charAt(0)); // 특정위치 한글자 추출 0번째 위치에 있는 문자
		System.out.println("Str변수 값: "+str.length()); // 문자 개수
		boolean bl = true; // 1byte 크기의 논리형태 공간
		System.out.println("bl변수 값: "+bl);// true
		bl = false;
		System.out.println("bl변수 값: "+bl);// false
		
		// 변수에 다른 형태 데이터 대입
		// int in1 = 3.5; //에러
		float fl1 = 5; // 5.0
		System.out.println("fl1변수 값: "+fl1);
		double fl2 = 100; // 100.0
		System.out.println("fl2변수 값: "+fl2);
		int in2 = 'A'; //65// 단일문자는 정수형으로 저장이 된다
		System.out.println("in2변수 값:"+in2);
		char ch1 = 65; // 단일문자와 정수형은 혼용이 된다.
		System.out.println("ch1변수 값:"+ch1);
		//string str1 = 'A'; //에러
	    String str1 = ""+'A'+100; //에러 안뜸
	    System.out.println("str1변수 값:"+str1);
	    
	    // 변수 사용 영역
	    int var1 = 10; 
	    System.out.println(var1); // 10 정상 출력
	    {
	    	int var2 = 20;
	    	System.out.println(var1);  // var1은 출력될까? 10 정상 출력
	    	System.out.println(var2);  //  20 정상 출력
	    	// 자기 영역에서 var1을 찾아보고 없으면 main에서 var1을 찾는다.
	    }
		//System.out.println(var2); // 에러 뜸, 영역을 벗어나는 순간 var2 못찾음
	    
	    // final 상수
	    final int num100;
	    //System.out.println(num100);
	    num100 = 20; // 선언 후 한번은 값 대입 가능
	    System.out.println(num100);
	    // num100 = 20; // 에러 발생
	    
	    int number = 290;
	    System.out.println((byte)number);
	    
	    		
	    
	    
	    
	}

}
