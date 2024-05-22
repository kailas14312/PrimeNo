

public class fibonacci {

	public static void main(String[] args) {
		int no=10;
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=1; i<=no; i++) {
			
			int c=a+b;
			      a=b;
			      b=c;
			      System.out.println(c);
		}
		
	}
}
