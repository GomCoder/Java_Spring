package ch13;


import java.util.Iterator;
import java.util.TreeSet;

import ch14.Member;


public class MemberTreeSet {
	
	private TreeSet<Member> treeSet; //hashSet ����
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); //Member�� ������ hashSet
	}
	
	public void addMember(Member member) { //hashSet�� Member�߰�
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId�� �Ű�������, ���� ���θ� ��ȯ
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId�� �Ű������� ��ġ�ϸ�
				treeSet.remove(member); // �ش� member�� ����
				return true; //true ��ȯ
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�."); //for�� ���� ������ return�� �ȵ� ���
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
