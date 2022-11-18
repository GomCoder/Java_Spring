package ch08;

public class Person {
	public int personHeight;
	public int personWeight;
	public String personGender;
	public String personName;
	public int personAge;
	
	public Person() {	}
	
	public Person(int personHeight, int personWeight, String personGender, String personName, int personAge) {
		this.personHeight = personHeight;
		this.personWeight = personWeight;
		this.personGender = personGender;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String showPersonInfo()  {
		return "키가 " + personHeight + "이고 몸무게가 " + personWeight + "킬로인 " + personGender + "이 있습니다. 이름은 "
							+ personName + "이고 나이는 " + personAge +"세 입니다.";
	}
	
}
