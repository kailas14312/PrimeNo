public class PrimeNoSerise {
	
	public static void main(String[] args) {
		
		int no =20;
		int counter=0;
		
		for(int i=2; i<=no; i++) {
			for(int j=2; j<=i-1; j++) {
				
				if(i%j==0) {
					counter++;
					}
			}if(counter==0) {
				
				System.out.println(i);
			}else counter = 0;
		}
		System.out.println("this is kailas...");
	}

}

