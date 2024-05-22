
public class Factorial {

	public static void main(String[] args) {

		int totalfact = 0;
		int no = 5;
		int fact = 1;

		for (int i = fact; i <= no; i++) {

			fact = fact * i;
			System.out.println(fact);

			totalfact = totalfact + fact;
		}
		System.out.println(totalfact);
	}
}
