package kh.project1.test1;

import java.util.Scanner;
public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if(num % 2 == 0) {
//			if(num == 0) {
//				System.out.println("0�Դϴ�.");
//			}else {
//			System.out.println("¦���Դϴ�.");
//		}
//		}else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//				
//		

		
		
//		if(num > 0) {
//			System.out.println("����Դϴ�.");
//			System.out.println("������ ���Դϴ�.");
//		}
//		else {
//			System.out.println("����� �ƴմϴ�.");
//		}
//		System.out.println("���α׷� ����");
//		

//		if(num % 2 == 0) {
//			System.out.println("¦��");
//		} else {
//				System.out.println("Ȧ��");		
//			}
		
//		if(num > 0) {
//			System.out.println("0���� ū ��");	
//		}else if (num < 0) {
//			System.out.println("0���� ���� ��");
//		}else {
//			System.out.println("0�� ���� ��");
//		}
		
		
//		int month = scan.nextInt();
//		String season;
//		if(month ==1 || month ==2 || month == 12) {
//			season = "�ܿ�";	
//		} else if(month >= 3 && month <=5) {
//			season = "��";
//		} else if(month >= 6 && month <=8) {
//			season = "����";
//		} else if(month >=9 && month <=11) {
//			season = "����";
//		} else {
//			season = "�ش��ϴ� ������ �����ϴ�.";
//		}
//		 System.out.println(season);
		 
		
//		System.out.print("�� �Է�: ");
//		int month = scan.nextInt();
//		System.out.print("�µ� �Է�: ");
//		int temperature = scan.nextInt();
//		String season = "";
//		
//		if(month == 1 || month == 2 || month == 12) {
//			season = "�ܿ�";
//			if(temperature <= -15) {
//					season += " ���� �溸";
//			} else if(temperature <= -12) {
//				    season += " ���� ���Ǻ�";
//			}
//		} else if (month >= 3 && month <= 5) {
//			  		season = "��";
//		} else if (month >= 6 && month <= 8) {
//					season = "����";
//					if(temperature >= 35) {
//							season += " ���� �溸";
//					} else if(temperature >= 33) {
//							season += " ���� ���Ǻ�";
//					}
//		} else if (month >= 9 && month <= 11) {
//					season = "����";
//		} else {
//					season = "�ش��ϴ� ������ �����ϴ�.";
//		}
//		System.out.println(season);
		
		
		
//		System.out.println("##���� ���� ���α׷�##");
//		
//		int num1 = 15000; // � �����
//		int num2 = 5000; // ���� �����
//		int money; // �� �ݾ�
//		
//		
//		System.out.print("���� �Ͻ� �ο��� �� �� ���Դϱ�? ");
//		int total = scan.nextInt(); // ������ �ο� �Է� ����
//		if (total <=0) { // ���� �ο��� 0�� �� ��
//			System.out.println("�ο� ���� �ٽ� �Է��ϼ���");
//		} else if (total >=1 ) { // ���� �ο��� 0���� �ƴ϶�� 
//			System.out.print("��� �� �� �Դϱ�?(�ο��� 1�� 5õ��) "); //� �ο� �Է� ����
//			int adult = scan.nextInt();
//			
//				if ( adult == total ) { // � �ο��� �� �ο��� ���� ��
//						money = adult*num1;
//						System.out.println("�����Ͻ� �� �ݾ��� "+money+"�� �Դϴ�");
//				} else if ( adult > total ) { //� �ο��� �� �ο����� ���� ��  
//					System.out.print("�ο� ���� �ٽ� �Է��ϼ���");
//				} else if ( adult < total ) { // � �ο��� �� �ο����� ���� ��
//					System.out.print("���̴� �� �� �Դϱ�?(�ο��� 5õ��) "); // ���� �ο� �Է� ����
//					int kids = scan.nextInt(); 
//					
//					if (kids == total) { //���� �ο��� �� �ο��� ���� ��
//						money = kids*num2;
//					} else if ( (kids+adult) > total || (total-adult) != kids ) {
//						//���� �ο��� �� �ο����� ���ų� �� �ο����� � �ο��� �� �Ͱ� �ٸ� ��
//						System.out.println("�ο� ���� �ٽ� �Է��ϼ���");
//					} else { 
//						money = (adult*num1)+(kids*num2);
//						 System.out.println("�����Ͻ� �� �ݾ��� "+money+"�� �Դϴ�");
//				}
//	  }
//    }
		
		
		//���̰��� ���α׷�
//		int total, adult, child=0;
//		System.out.println("## ���̰��� ���α׷�##");
//		System.out.print("�����Ͻ� �ο��� �� ����Դϱ�?");
//		total = scan.nextInt();
//		if(total > 0) {
//			System.out.print("��� �� ���Դϱ�?(�ο��� 1�� 5õ��)");
//			adult = scan.nextInt();
//			if( total > adult) {
//				System.out.print("���̴� �� ���Դϱ�?(�ο��� 5õ��)");
//				child = scan.nextInt();
//			}
//			if(total == adult +child) {
//		System.out.println("�����Ͻ� �� �ݾ��� "+(15000*adult+5000*child)+"�� �Դϴ�.");
//		}else {
//			System.out.println("�ο����� ���� �ʽ��ϴ�.");
//		}
//		}else {
//			System.out.println("�峭ġ������ ���� ������~!!");
//		}
//		
		
		
		
		
		
		
//		// ���� ����� (if�� ���)
//		
//		System.out.print("##����##\n1.���ϱ�\n2.����\n3.������\n4.���ϱ�\n");
//		System.out.print("���� �Է�: ");
//		int num1 = scan.nextInt();
//		System.out.print("���� �Է�: ");
//		int num2 = scan.nextInt();
//		System.out.print("����: ");
//		int num3 = scan.nextInt();
//			if (num3 == 1 || num3 == 2 || num3 == 3 || num3 == 4) {
//				double total ;
//				if (num3 == 1) {
//					total = num1 + num2;
//				} else if (num3 ==2) {
//					total = num1 - num2;
//				} else if (num3 ==3) {
//					if (num1<0 || num2<=0) {
//						System.out.print("��ȣ�� �ٽ� ��������");
//				} else { 
//					total = num1 / num2 ;
//							}
//				} else if (num3 ==4) {
//					total = num1 * num2;
//				}
//			} else {
//				System.out.print("��ȣ�� �ٽ� ��������");
//			} System.out.println(total);
//		
		
		//���� Ǯ��
//		System.out.println("## ����##");
//		System.out.println("1.���ϱ�");
//		System.out.println("2.����");
//		System.out.println("3.������");
//		System.out.println("4.���ϱ�");
//		System.out.print("����: ");
//		int select = scan.nextInt();
//		if(select > 0 && select <5) {
//		System.out.print("���� 1 �Է�: ");
//		int num1 = scan.nextInt();
//		System.out.print("���� 2 �Է�: ");
//		int num2 = scan.nextInt();
//		if(select == 1) {
//			System.out.println("���: "+(num1 + num2));
//		}else if(select ==2) {
//			System.out.println("���: "+(num1 - num2));
//		}else if(select ==3) {
//			if(num2 !=0) {
//				System.out.println("���: "+((double)num1 / num2));
//			}else {
//				System.out.println("0���� ���� �� �����ϴ�~!");
//			}
//		}else if(select ==4) {
//			System.out.println("���: "+(num1 * num2));
//		}
//		}else {
//			System.out.println("�߸��� �����Դϴ�.");
//		}
//		
		
		
		
		
		
		 //switch�� ����
//		System.out.print("������ �Է��ϼ���: ");
//		int select = scan.nextInt();
//		switch(select)
//		{
//		case 1 : System.out.println("1 �Է�");
//				break;
//		case 2 : System.out.println("2 �Է�");
//				break;
//		case 3 : System.out.println("3 �Է�");
//				break;
//		case 4 : System.out.println("4 �Է�");
//				break;
//		default : System.out.println("��Ÿ�Է�");
//		}
		
//		System.out.print("������ �Է��ϼ���: ");
//		int select = scan.nextInt();
//		switch(select/10)
//		{
//		case 0 : System.out.println("0~9�Է�");
//			break;
//		case 1 : System.out.println("10~19�Է�");
//			break;
//		case 2 : System.out.println("20~29�Է�");
//			break;
//		case 3 : System.out.println("30~39�Է�");
//			break;
//		case 4 : System.out.println("40~49�Է�");
//			break;
//			//default : System.out.println("��Ÿ�Է�");
//		}
		
//		System.out.print("������ �Է��ϼ���: ");
//		int select = scan.nextInt();
//		switch(select)
//		{
//		case 0 : 
//		case 5: System.out.println("0 �Ǵ� 5 �Է�");
//			break;
//		case 3 : 
//		case 7 : 
//		case 9 : System.out.println("3,7,9 �Է�");
//			break;
//			//default : System.out.println("��Ÿ�Է�");
//		}
		
		
		// swtich�� �̿��ؼ� ���ڳ� ���ڿ��ε� ����
//		System.out.print("�̸��� �Է��ϼ���: ");
//	    String select = scan.next();
//		switch(select)
//		{
//		case "������" : 
//		case "��쿵" : System.out.println("1���Դϴ�.");
//			break;
//		case "�ֹ���" : 
//		case "������" : 
//		case "������" : System.out.println("2���Դϴ�.");
//			break;
//			//default : System.out.println("��Ÿ�Է�");
//		}
		
//		System.out.print("������ �Է��ϼ���: ");
//		int num = scan.nextInt();
//		String team ;
//		switch(num%5) {
//		case 1:
//				team ="1��";
//				break;
//		case 2:
//				team ="2��";
//				break;
//		case 3:
//				team ="3��";
//				break;
//		case 4:
//				team ="4��";
//				break;
//		default:
//				team = "�ٽ�";
//		} 
//		System.out.println(team);
		
		
		
		
		
//		System.out.println("##����##");
//		System.out.println("1.���ϱ�");
//		System.out.println("2.����");
//		System.out.println("3.������");
//		System.out.println("4.���ϱ�");
//		System.out.print("����: ");
//		int num = scan.nextInt();
//		System.out.print("ù ��° ����: ");
//		int num1 = scan.nextInt();
//		System.out.print("�� ��° ����: ");
//		int num2 = scan.nextInt();
//		
//		switch(num) {
//		case 1: System.out.println("���: "+(num1 + num2));
//			break;
//		case 2: System.out.println("���: "+(num1-num2));
//			break;
//		case 3: 
//			 {switch(num2){
//			  case 0:System.out.println("�ٽ�");
//			 	break;
//		
//			 	default:
//			 		System.out.println("���: "+((double)num1/num2));}
//			 } break;
//		case 4: System.out.println("���: "+(num*num2));
//			break;
//		default:System.out.println("�ٽ�");
//		}
		
		
		
		
		System.out.println("##����##");
		System.out.println("1.���ϱ�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.���ϱ�");
		System.out.print("����: ");
		int num = scan.nextInt();
		System.out.print("ù ��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = scan.nextInt();
		
		switch(num) {
		case 1: System.out.println("���: "+(num1 + num2));
			break;
		case 2: System.out.println("���: "+(num1-num2));
			break;
		case 3: 
			 {if(num2 !=0) {
				 System.out.println("���: "+((double)num1/num2));
			 }else {
				 System.out.println("�ٽ�");
			 }
			 } break;
		case 4: System.out.println("���: "+(num*num2));
			break;
		default:System.out.println("�ٽ�");
		}
		
		
		
			 
	  }
	} 


