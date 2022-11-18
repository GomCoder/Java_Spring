package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member�� ������ ArrayList
	}
	
	public void addMember(Member member) { //ArrayList�� Member�߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId�� �Ű�������, ���� ���θ� ��ȯ
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId�� �Ű������� ��ġ�ϸ�
				arrayList.remove(member); // �ش� member�� ����
				return true; //true ��ȯ
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�."); //for�� ���� ������ return�� �ȵ� ���
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
