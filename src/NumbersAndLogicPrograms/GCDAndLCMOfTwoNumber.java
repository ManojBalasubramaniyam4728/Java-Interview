package NumbersAndLogicPrograms;

public class GCDAndLCMOfTwoNumber {
	public static int getGCD(int a, int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static int getLCM(int a, int b) {
		return (int)(a*b)/getGCD(a, b);
	}
	public static void main(String[] args) {
		System.out.println("The Lowest common multiple is "+getLCM(12,18)); //36
		System.out.println("The gratest common devision is "+getGCD(12,18)); //6
	}
}
