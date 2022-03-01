import java.util.Scanner;

public class ProcessName5026211058{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nType your full name : ");
	String fullName = sc.nextLine();

	int nameIdx = fullName.indexOf(" ");
	String lastName = fullName.substring(nameIdx);
	System.out.println(nameIdx);
	System.out.println("Your name is : " + lastName + ", " + fullName.charAt(0) + ".");
	}
}