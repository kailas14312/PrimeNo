
public class primeNo {
	public static void main(String[] args) {
		
		int no = 23;
		int counter = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				counter++;
			}
		}
		if (counter == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
