package ch12;


import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet; //hashSet 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //Member로 선언한 hashSet
	}
	
	public void addMember(Member member) { //hashSet에 Member추가
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId가 매개변수와 일치하면
				hashSet.remove(member); // 해당 member를 삭제
				return true; //true 반환
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다."); //for가 끝날 때가지 return이 안된 경우
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
