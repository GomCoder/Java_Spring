package ch14;

import java.util.Comparator;

//public class Member implements Comparable<Member>{

public class Member implements Comparator<Member>{
	private int memberId; //ȸ�� ���̵�
	private String memberName; // ȸ�� �̸�
	
	public Member() {
		
	}
	
	
	public Member(int memberId, String memberName) { //������
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + " �Դϴ�. ";
	}

	/*
	@Override
	public int compareTo(Member member) { //�� ��Ҹ� ���ϴ� �Լ�
		
		
		//���� ���� ���ĵ�
		if(this.memberId > member.memberId) {
			return 1;
		} else if(this.memberId < member.memberId) {
			return -1;
		} else {
			return 0;
		}
		
		
		//return (this.memberId - member.memberId); //��������
		return	(this.memberId - member.memberId)* (-1); //��������
	}
	*/
	
	@Override
	public int compare(Member member1, Member member2) {
		
		return (member1.memberId - member2.memberId);
		
	}	
}
