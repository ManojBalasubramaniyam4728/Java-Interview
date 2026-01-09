package PatternPrograms;

public class pattern5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				if(k==1) {
				System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			
			for(int l=2;l<=i;l++) {
				if(l==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		for(int i=2; i<=5;i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>=i;k--) {
				if(k==5) {
				System.out.print("*");
				}
				else {
				System.out.print(" ");	
				}
			}
			for(int l=5;l>i; l--) {
				if(l==i+1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
