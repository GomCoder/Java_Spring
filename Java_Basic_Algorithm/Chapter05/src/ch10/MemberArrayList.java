package ch10;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; //ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member로 선언한 ArrayList
	}
	
	public void addMember(Member member) { //ArrayList에 Member추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //MemberId를 매개변수로, 삭제 여부를 반환
		for(int i = 0; i < arrayList.size(); i++) { // 해당 ID를 가진 Member를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { //MemberId가 매개변수와 일치하면
				arrayList.remove(i); //해당 member를 삭제
				return true; //true 반환
			}
		}
		System.out.println(memberId + " 가 존재하지 않습니다."); //for문이 끝날 때까지 return이 안된 경우
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
