package NumbersAndLogicPrograms;

public class greatestOfThreeNumbers {
	public static void main(String[] args) {
		System.out.println("===============one way using ternary========================");
		int a=10; int b=20;int c=30;
		int d=((a>b)?((a>c)?a:c):(b>c)?b:c);
		System.out.println(d +" is grater");
		System.out.println("============================================================");
		System.out.println("===============anotehr way without using ternary========================");
		if(a>b) {
			if(a>c) {
				System.out.println("a variable value is grater and numere is "+a);
			  }
			else {
				System.out.println("c variable value is grater and numere is "+c);
			}
			}
	else {
		if(b>c) {
			System.out.println("b variable value is grater and numere is "+b);
		}
		else {
			System.out.println("c variable value is grater and numere is "+c);
		}
	}	
	}
}
