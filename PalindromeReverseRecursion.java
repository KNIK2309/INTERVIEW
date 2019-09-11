package interview;
import java.util.Scanner;
public class PalindromeReverseRecursion {
	
@SuppressWarnings("resource")
public static void main(String[] args) {
String str="";
String rev="";
Scanner sc = new Scanner (System.in);
System.out.println("enter a string");
str=sc.nextLine();
for (int i=str.length()-1;i>=0;i--) //for reverse loop
rev = rev + str.charAt(i);
System.out.println("reverse is " + rev);
	if(str.equals(rev))
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");
	
		}
}
