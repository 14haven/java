package com.kh.project.model.vo;

public interface Phone {
	// �ʵ� �� - �������̽�  ���� �ʵ�� ������ static final (�����ص� �⺻������ �ٴ´�)
	public static final char [] NUMBERPAD 
		= {'1','2','3','4','5','6','7','8','9','*','0','#'}; //ĳ������ �迭
	
	// ������ �� - �������̽��� ��üȭ�� �Ұ����ϱ� ������ �����ڸ� ���� �� ����.
	// �޼ҵ� �� - �������̽� ���� �޼ҵ�� ������ �߻� �޼ҵ� (abstract)
	// public abstract (�����ص� �⺻������ �ٴ´�)
	String makeCall();	// ��ȭ �ɱ�
	String takeCall();	// ��ȭ �ޱ�

}
