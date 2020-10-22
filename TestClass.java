package kh.project1.test1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(10);		//정수형
        System.out.println(5.7);	//실수형
        System.out.println('A');	//단일 문자
        System.out.println("A");	//문자열
        System.out.println("Hello");	//문자열
        System.out.println(10+20);	//연산을 다 하고 결과를 출력한다, 정수 연산
        System.out.println(5.5+3.5);	// 실수 연산
        System.out.println(10+3.5);		// 정수+실수 연산 -> 실수로 나옴, 표현할 수 있는 범위 실수가 훨씬 크다, 더 큰 타입에 맞춰서 변환되어 연산된다
        System.out.println('A'+'B');	// 단일문자연산 , 정수형으로 바뀌어서 연산이 된다 
        System.out.println(10+'A');		// 정수+단일문자 연산, 단일문자는 그냥 정수형이라고 치면 된다 표현만 문자로 한 것
        System.out.println("Hello"+"bye");	//문자열 연산, 문자열 두개를 그냥 이어쓰는 것
        System.out.println("Hello"+'A');	//문자열 연산, 문자열로 바뀜, 문자열이 가장 큼
        System.out.println("Hello"+20);		//문자열 +정수 연산, 문자열이랑 계산하면 다 문자열로 바뀐다
        System.out.println("Hello"+3.5);	//문자열+실수 연산
        

	}

}
