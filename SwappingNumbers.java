import java.util.Scanner;


class SwappingNumbers{

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value");
	int a = sc.nextInt();
	System.out.println("Enter b value");
	
	int b = sc.nextInt();
	a = a^b;
	b = a^b;
	a = a^b;	
System.out.println("After Swapping: ");
System.out.println(a);
System.out.println(b);

}
}