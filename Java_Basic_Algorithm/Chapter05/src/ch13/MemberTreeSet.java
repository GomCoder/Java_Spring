package ch13;


import java.util.Iterator;
import java.util.TreeSet;

import ch14.Member;


public class MemberTreeSet {
	
	private TreeSet<Member> treeSet; //hashSet 선언
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); //Member로 선언한 hashSet
	}
	
	public void addMember(Member member) { //hashSet에 Member추가
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId가 매개변수와 일치하면
				treeSet.remove(member); // 해당 member를 삭제
				return true; //true 반환
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다."); //for가 끝날 때가지 return이 안된 경우
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
