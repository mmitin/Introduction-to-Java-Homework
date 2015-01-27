import java.util.Scanner;

public class _8_SortArrayOfStrings {
	public static void main (String[]args){
		Scanner input =new Scanner (System.in);
		String buffer =null;
		System.out.print("Enter positive integer n->");
		int n = input.nextInt();
		String [] myArray=new String [n];
		System.out.print("Enter"+" "+ n +" " + "strings->");
		for (int i = 0; i < n; i++){
			myArray[i]=input.next();
		}
		for (int i = 0; i < n-1; i++){
			for (int j=i+1; j<n;j++){
			if (myArray[i].compareToIgnoreCase(myArray[j])>0){
				buffer=myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=buffer;
				i=0;j=1;
			}
		}
		}
		for (int i =0; i<n; i++){
			System.out.println(myArray[i]);
		}
	}
}
