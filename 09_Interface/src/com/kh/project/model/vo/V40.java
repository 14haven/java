package com.kh.project.model.vo;

public class V40 extends SmartPhone implements NotePen{
	// �����ں�
	public V40(){
		setMaker("LG");
	}
	//�޼����

	
	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		return "��ȭ�ޱ� ��ư�� ����";
	}

	@Override
	public String picture() {
		return "1200, 1600�� ȭ�� Ʈ���� ī�޶�";
	}
	@Override
	public String charge() {
		return "�������, ��� ���� ����";
	}

	@Override
	public String touch() {
		return "������";
	}

	@Override
	public boolean bluethootPen() {
		return false;
	}

	@Override
	public String printInformation() {
		String tmp ="V40�� "+getMaker()+"���� ��������� ������ ������ ����.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "������� �� ž�� ���� : "+bluethootPen();
		return tmp;
	}
	
	
}
