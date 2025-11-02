package NumbersAndLogicPrograms;

public class Strong {
	public static void main(String[] args) {
	     int num=145;
	     int temp=num;
	     int finalNum=0;
	     
	     while(num>0){
	         int rem=num%10;
	         int sum=1;
	         for(int i=rem;i>=1;i--){
	            sum*=i;
	         }
	         finalNum+=sum;
	        num= num/10;
	     }
	     if(temp==finalNum){
	         System.out.println("The Number "+temp+" Is Strong");
	     }
	     else{
	           System.out.println("The Number "+temp+" Is not a Strong");
	     }
	    }
}
