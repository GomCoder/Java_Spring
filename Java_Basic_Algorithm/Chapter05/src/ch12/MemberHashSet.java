package ch12;


import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet; //hashSet ����
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //Member�� ������ hashSet
	}
	
	public void addMember(Member member) { //hashSet�� Member�߰�
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId�� �Ű�������, ���� ���θ� ��ȯ
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId�� �Ű������� ��ġ�ϸ�
				hashSet.remove(member); // �ش� member�� ����
				return true; //true ��ȯ
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�."); //for�� ���� ������ return�� �ȵ� ���
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
