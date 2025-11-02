package NumbersAndLogicPrograms;

public class Armstrong {
	 public static void main(String[] args) {
	     int num=146;
	     int temp=num;
	     int temp1=num;
	     int finalNum=0;
	     int count=0;
	     while(num>0){
	         count++;
	        num= num/10;
	     }
	     while(temp>0){
	         int rem=temp%10;
	         finalNum=finalNum+((int) Math.pow(rem,count));
	         temp=temp/10;
	     }
	     if(temp1==finalNum){
	         System.out.println("The Number "+temp1+" Is Armstrong");
	     }
	     else{
	           System.out.println("The Number "+temp1+" Is not a Armstrong");
	     }
	    }
}
