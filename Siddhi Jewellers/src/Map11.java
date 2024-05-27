
import java.util.*;

public class Map11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("kindly enter toe no for swap");
		for (int i = 1; i <= 100; i++) {
			int user1 = sc.nextInt();
			int user2 = sc.nextInt();
			getSwap(user1, user2);
		}
	}

	public static void getSwap(int no1, int no2) {

		int a = no1;
		int b = no2;
        int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println(a + "\n" + b);

	}

}