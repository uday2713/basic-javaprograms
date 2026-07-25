import java.util.Scanner;
class Even_or_Odd{
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Uday Enter a number"); 
	int n = sc.nextInt();
	
	if(n < 0 || n == 0 ){
	System.out.println("Enter a valid number");
	return;
}

	if(n%2==0){
	System.out.println("Even");
	}
	else{
	System.out.println("Odd");
	}
}
}