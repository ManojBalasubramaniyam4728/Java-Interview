package NumbersAndLogicPrograms;

public class Plindarom {
	public static void main(String[] args) {
		int num=1581;
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (temp==sum) {
			System.out.println(temp+" Is a palindrom");
		}
		else {
			System.out.println(temp+" Is Not a Palindrom");
		}
	}
}
