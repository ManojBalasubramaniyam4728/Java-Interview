package PatternPrograms;

public class pattern3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<i;k++) {
				System.out.print("*");
			}
			
			for(int l=2; l<i; l++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		for(int i=2; i<=4; i++) {
			for(int m=1; m<i; m++) {
			System.out.print(" ");
			}
			
			for(int d=5; d>i; d--) {
			System.out.print("*");
			}
			
			for(int p=4; p>i; p-- ) {
			  System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
}
}
