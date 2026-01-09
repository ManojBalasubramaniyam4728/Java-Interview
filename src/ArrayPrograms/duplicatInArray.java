package ArrayPrograms;

public class  duplicatInArray{
public static void main(String[] args) {
		 String duplicateArray="";
			int arr[]={1, 3, 4, 5, 4, 6, 5,6};
			for(int a=0; a<=arr.length-1;a++){
			    for(int b=a+1; b<=arr.length-1;b++){
			        if(arr[a]==arr[b]){
			            duplicateArray+=arr[a]+" ";
			        }
			    }
			}
			System.out.println(duplicateArray);

	}
	

}
