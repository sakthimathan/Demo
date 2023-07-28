package StepDefenition;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"somke Test"})
	public static void createaccount() {
		System.out.println("account is created");
	}
	@Test(groups = {"Recursion Test"})
	public static void login() {
		System.out.println("enter Detail");
	}
	@Test(groups = {"sanity Test"})
	public static void persnalDeatails() {
		System.out.println("creat personal Details");
	}
	@Test(groups = {"somke Test"})
	public static void creataNewPost() {
		System.out.println("Post new Picture");
	}
	@Test
	public static void logOut() {
		System.out.println("Log Out Success Fully");
	}
}
