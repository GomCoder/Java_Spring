package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
		
	}
	
}



public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		
		memberTreeSet.addMember(memberLee);		
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);;
		memberTreeSet.showAllMember();
		*/
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("Park");
		treeSet.add("Kim");
		treeSet.add("Lee");
		
		System.out.println(treeSet);
		
				
	}
}
