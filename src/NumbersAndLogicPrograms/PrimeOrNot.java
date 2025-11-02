package NumbersAndLogicPrograms;

public class PrimeOrNot{
    public static void main(String[] args) {
    for(int a=4;a<=10;a++){
        boolean d=true;
         if(a<=1){
             System.out.println(a+" Is composite number");
             continue;
         }
       for(int i=2;i<=a/2;i++){
         if(a%i==0){
             d=false;
             break;
         }
       }
        if(d==true){
         System.out.println(a+" Is Prime Number");
       }
        else{
         System.out.println(a+ " Is Not a Prime Number");
     }
  }
 }
}
