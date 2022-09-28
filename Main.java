package password_generator; 

public class Main {
	public static void main(String[] args) {
		Characters c = new Characters();
		System.out.println("-------Your New Password-------");
		System.out.println(c.finalPassword());
		System.out.println("-------------------------------");
	}
}
