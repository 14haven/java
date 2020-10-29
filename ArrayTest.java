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


		// 배열 선언
		
//		String[] studentName; // 메모리의 주소를 저장하는 참조 변수 생성(Stack 영역에)
//		// 배열 할당 - 실제로 데이터가 저장될 공간 생성
////		studentName = new String[10];  //실제 데이터를 저장하는 변수 공간 생성 후 주소를 참조변수에 저장(Heap 영역)
//		//new String[]안에 고정된 값이 아닌 변수로 넣을 수도 있다.
//		Scanner scan = new Scanner(System.in);
//		
//		//학생 인수 입력받기
//		System.out.println("학생이 몇명입니까? ");
//		int count = scan.nextInt();
//		// 입력 받은 인원 수 만큼 공간 할당
//		studentName = new String[count] ;
//		
//		//입력 이름 받기
//		for(int i=0; i<studentName.length ; i++) {
//			System.out.print(i+1+"번째 학생 이름: ");
//			studentName[i] = scan.next();
//		}
//		
//		//학생 목록 출력
//		System.out.println("## 학생 목록 ##");
//		for(int i=0 ; i<studentName.length ; i++) {
//			System.out.println(studentName[i]);
//		}
		
		
		//얕은 복사
//		int[] arr1 = new int[] {10,20,30,40,50};
//		int[] arr2 = arr1;
//		
//		arr1[0] = 100;
//		
//		System.out.println("arr1주소: "+arr1);
//		for(int i=0 ; i<arr1.length ; i++) {
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("arr2주소: "+arr2);
//		for(int i=0 ; i<arr2.length ; i++) {
//			System.out.print(arr2[i]+" ");
//		}

		
//		// 깊은 복사
//		int [] arr1 = new int[] {10,20,30,40,50};
//		int [] arr2 = new int[5];
		
		
		// 방법 1 for문 사용
//		for(int i=2 ; i<arr1.length ; i++ ) {
//			arr2[i-2] = arr1[i];
//		}
		
		
		// 방법 2 
//		//System.arraycopy(원본배열, 원본 시작위치, 목적지 배열, 목적지 시작위치, 복사할 길이;
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 전체 데이터 복사
//		System.arraycopy(arr1, 3, arr2, 0, arr1.length-3); // 특정 데이터 복사
		
		
		// 방법 3
//		//Arrays.copyOf(원본배열, 복사할 길이);
//		arr2 = Arrays.copyOf(arr1, arr1.length); // 전체 데이터 복사
//		arr2 = Arrays.copyOf(arr1, 3); //특정 데이터 복사
//		//Arrays.copyOfRange(원본배열, 시작위치, 끝위치+1);
//		arr2 = Arrays.copyOfRange(arr1, 3, 5); //끝 인덱스가 끝 인덱스 전까지 복사해라 라는 뜻임
		
//		// 방법 4
//		arr2 = arr1.clone(); //전체 데이터 복사 
////		arr1[0] =100;
//		
//		
//		System.out.println("arr1 주소: "+arr1);
//		for(int i=0 ; i<arr1.length ; i++) {
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("arr2 주소: "+arr2);
//		for(int i=0; i<arr2.length; i++) {
//			System.out.print(arr2[i]+" ");
//		}
		
		
		// 2차원 배열 선언
//		int [][] arr1;
//		int arr2 [][];
//		int [] arr3 [];
//		
//		// 2차원 배열 할당
//		arr1 = new int[3][5];
//		arr2 = new int[3][]; //1차원배열 3개 만들건데 변수의 공간 몇개 만들지는 아직 모르겠어
//		arr2[0] = new int[5]; // arr2의 0번째 1차원배열에 5칸짜리 공간 만들게
//		arr2[1] = new int[3]; // arr2의 1번째 1차원배열에 3칸짜리 공간 만들게
//		arr2[2] = new int[10]; // arr2의 2번째 1차원배열에 10칸짜리 공간 만들게
//		// 초기값 지정
//		arr3 =new int[][] {{10,20,30,40,50},{10,20,30},{10,20,30,40}};
//		
		
		int [][] arr = new int[2][4];
//		System.out.println(arr);//주소를 저장하는 공간의 주소를 가지고 있다.
//		
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0; j<arr[i].length ;j++) {
				arr[i][j] = (j+1)*10;
			}
		}
		System.out.println(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
//		System.out.println(arr[0]); //주소를 저장하는 공간
//		System.out.println(arr[1]); //주소를 저장하는 공간
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[0][3]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		System.out.println(arr[1][3]);
		
		
		
		}		
	}


