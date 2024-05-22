
public class Pallindrom {
	public static void main(String[] args) {
		int no = 112211;
		int rem = 0;
		int rev = 0;
		int newno = no;
		while (newno > 0) {
			rem = newno % 10;
			rev = rev * 10 + rem;
			newno = newno / 10;
		}
		if (rev == no) {
			System.out.println("Palindrom");
		} else
			System.out.println("not Palindrom");

	}
}
