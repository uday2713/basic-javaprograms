class PalindromeNumber{
public static void main(String[] args){
	int num = 1221;	
	if(num<0){
	System.out.println("Enter Valid Number");
	return;
}
	int originalNum = num;
	int reversedNum = 0;
	while( num !=0){
	int remender = num %10;
	reversedNum = reversedNum * 10 + remender;
	num = num/10;
}
	System.out.println(originalNum == reversedNum ? "Palindrome" : "Not a Palindrome");
}
}