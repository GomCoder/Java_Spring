package ch08;

public class PersonTest {

	public static void main(String[] args) {
		Person tomas = new Person();
		tomas.personHeight = 180;
		tomas.personWeight = 78;
		tomas.personGender = "³²¼º";
		tomas.personName = "Tomas";
		tomas.personAge = 37;		
		
		System.out.println(tomas.showPersonInfo());
	}
}
