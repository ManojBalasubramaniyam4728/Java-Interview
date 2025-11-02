package NumbersAndLogicPrograms;

public class ReverseNumeber {
	public static void main(String[] args) {
		int num=10897;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("the reverse numere is "+sum);
	}
}
