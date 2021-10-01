package oops;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {
		auth("Vijay");
	}

	private static void auth(String login) throws LoginException {
		if(!login.equals("admin")) {
			LoginException e=new LoginException();
			System.out.println(e.getMessage());
			throw e;
		}
		
	}

}
