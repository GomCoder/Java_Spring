package ch10;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member�� ������ ArrayList
	}
	
	public void addMember(Member member) { //ArrayList�� Member�߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId�� �Ű�������, ���� ���θ� ��ȯ
		for(int i = 0; i < arrayList.size(); i++) { // �ش� ID�� ���� Member�� ArrayList���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId�� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); //�ش� member�� ����
				return true; //true ��ȯ
			}
		}
		System.out.println(memberId + " �� �������� �ʽ��ϴ�."); //for���� ���� ������ return�� �ȵ� ���
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
