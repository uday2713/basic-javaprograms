import java.util.Scanner;
class Shifts{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a = sc.nextInt();
	if((a&1) == 0){
	System.out.println("Even");
}
else{
	System.out.println("Odd");
}
}

}