package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		// ���� ����
		int num;
		// ���� ��� - �� ����
		num = 10;
		// ���� ��� - �� �б�
		System.out.println(num); // 10
		
		num = 10+20;
		System.out.println(num); // 30
		
		// ���� ���� �� �ٷ� �� ����(�ʱⰪ)
		int num2 = 20;
		// �������� ���� ���ÿ� ����(���� �ڷ����� ����)
		int num3, num4, num5;
		// �������� ���� ���ÿ� ���� �� �ٷ� �� ����(�ʱⰪ)
		int num6, num7 = 40, num8 = 50; // num6���� �ƹ� ���� ���� ����
		
		// �������� �ٸ� ������ ����
		int num9 = 10;
		int num10 = num9;
		
		// �������� �̿��� ���� �� �ٽ� ����
		int num11 = 100;
		System.out.println(num11); // 100
		num11 = num11 + 1;
		System.out.println(num11); // 101
		
		// ������ Ÿ�Կ� ���� ���� ����
		byte num01 = 100; //1byte ũ���� �������� ����
		System.out.println("num01���� ��:" + num01); // 100
		short num02 = 10000; //2byte ũ���� �������� ����
		System.out.println("num02���� ��:"+ num02); // 10000
		int num03 = 10000000; // 4byte ũ���� �������� ����
		System.out.println("num03���� ��:"+ num03); // 10000000
		long num04 = 10000000000L; // 8byte ũ���� ���� ���� ����
		System.out.println("num04���� ��:"+ num04);  //10000000000
		float num05 = 3.5F; // 4byte ũ���� �Ǽ����� ����
		System.out.println("num05���� ��:"+ num05); // 3.5
		double num06 = 12345.234; // 8byte ũ���� �Ǽ����� ����
		System.out.println("num06���� ��:"+ num06); // 12345.234
		char ch = '��'; // 2byte ũ���� ���Ϲ������� ����
		System.out.println("ch���� ��:"+ch); 
		String str = "��θ�~!!"; // ����ũ���� ���ڿ� ���� ����(ũ�Ⱑ �׶� �׶� ���Ѵ�)
		System.out.println("str���� ��: "+str); // ��θ�~!!
		System.out.println("str���� ��: "+str.charAt(0)); // Ư����ġ �ѱ��� ���� 0��° ��ġ�� �ִ� ����
		System.out.println("Str���� ��: "+str.length()); // ���� ����
		boolean bl = true; // 1byte ũ���� ������ ����
		System.out.println("bl���� ��: "+bl);// true
		bl = false;
		System.out.println("bl���� ��: "+bl);// false
		
		// ������ �ٸ� ���� ������ ����
		// int in1 = 3.5; //����
		float fl1 = 5; // 5.0
		System.out.println("fl1���� ��: "+fl1);
		double fl2 = 100; // 100.0
		System.out.println("fl2���� ��: "+fl2);
		int in2 = 'A'; //65// ���Ϲ��ڴ� ���������� ������ �ȴ�
		System.out.println("in2���� ��:"+in2);
		char ch1 = 65; // ���Ϲ��ڿ� �������� ȥ���� �ȴ�.
		System.out.println("ch1���� ��:"+ch1);
		//string str1 = 'A'; //����
	    String str1 = ""+'A'+100; //���� �ȶ�
	    System.out.println("str1���� ��:"+str1);
	    
	    // ���� ��� ����
	    int var1 = 10; 
	    System.out.println(var1); // 10 ���� ���
	    {
	    	int var2 = 20;
	    	System.out.println(var1);  // var1�� ��µɱ�? 10 ���� ���
	    	System.out.println(var2);  //  20 ���� ���
	    	// �ڱ� �������� var1�� ã�ƺ��� ������ main���� var1�� ã�´�.
	    }
		//System.out.println(var2); // ���� ��, ������ ����� ���� var2 ��ã��
	    
	    // final ���
	    final int num100;
	    //System.out.println(num100);
	    num100 = 20; // ���� �� �ѹ��� �� ���� ����
	    System.out.println(num100);
	    // num100 = 20; // ���� �߻�
	    
	    int number = 290;
	    System.out.println((byte)number);
	    
	    		
	    
	    
	    
	}

}
