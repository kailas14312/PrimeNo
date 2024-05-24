
import java.util.*;

public class Map11 {
	static Scanner sc = new Scanner(System.in);
     static int user;
	public static void main(String[] args) {
		System.out.println("enter your no to check prime or not");
		for(int i=1; i<=100; i++) {
		
		 user = sc.nextInt();
		getPrime(user);
		}
	}

	public static void getPrime(int no) {

		int no1 = no;
		int counter = 0;

		for (int i = 1; i <= no1; i++) {
			if (no % i == 0) {
				counter++;
			}

		}
		if (counter == 2) {
			System.out.println("prime No");
		}else if(user==1 || user==0) {
			System.out.println("nither prime , nor compositive");
		}
		else
			System.out.println("not prime");
            System.out.println("kailas dahiwal");
	}
}