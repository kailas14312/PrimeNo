public class ArmStrong {

	public static void main(String[] args) {
		
		int no=153;
		int newno=no;
		int counter=0;
		
		while(newno>0) {
			newno=newno/10;
			counter++;
		}int newno2=no;
		 int rem=0;
		 int arm=0;
		 while(newno2>0) {
			 int mult=1;
			 rem=newno2%10;
			 for(int i=1; i<=counter; i++) {
				 mult=mult*rem; }
			 arm=arm+mult;
			 newno2=newno2/10;
		 }if(arm==no) {
			 System.out.println("ArmStrong No");
		 }else System.out.println("Not ArmStrong No");
		
	}
}
