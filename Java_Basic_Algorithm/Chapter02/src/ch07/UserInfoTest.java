package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword ="zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "0987mnbvc", "Kim");
		System.out.println(userKim.showUserInfo());
		
	}

}
