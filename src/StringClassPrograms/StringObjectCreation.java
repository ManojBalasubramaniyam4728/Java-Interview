package StringClassPrograms;

public class StringObjectCreation {
	
	public static void main(String[] args) {
		String data= "welcome";
		String data1= new String("welcome");
		
		System.out.println(data==data1);//Comparing variable with object so answer is false
		System.out.println(data.equals(data1));  //Comparing variable value with object value  answer is true
		
	}

}
