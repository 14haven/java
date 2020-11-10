package com.kh.project.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	// ������
	public GalaxyNote9() {
		/* �θ� Ŭ����(SmartPhone) ���ο� �ִ� maker �ʵ��� ���� �ʱ�ȭ
		 * - maker �ʵ尡 private ���������ڸ� ������ �ֱ� ������ ���� ������ �Ұ���
		 * - �ڽ� Ŭ���� ���ο� setMaker �޼ҵ尡 ���� ������ super.�� ���� ����
		 * */
		super.setMaker("�Ｚ");	//
	}


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
		return "1300�� ���ī�޶�";
	}
	@Override
	public String charge() {
		return "��� ����, ��� ���� ����";
	}
	@Override
	public String touch() {
		return "������, ������ ����";
	}

	@Override
	public boolean bluethootPen() {
		return true;
	}
	@Override
	public String printInformation() {
		String tmp ="������ ��Ʈ9�� "+getMaker()+"���� ��������� ������ ������ ����.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "������� �� ž�� ���� : "+bluethootPen();
		return tmp;
	}

}