package interview;

import java.util.Scanner;

public class SwapwoTemp {

@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of a and b");
int a=sc.nextInt();
System.out.println("a = "+a);
int b=sc.nextInt();
System.out.println("b = "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("new value of a = "+a);
System.out.println("new value of b = "+b);
	}

}
