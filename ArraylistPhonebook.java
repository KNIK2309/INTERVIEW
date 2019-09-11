package interview;

import java.util.ArrayList;

class Contact{
	String first_name;
	String last_name;
	String ph_no;
	
	public Contact(String fn, String ln, String pn )
	{
		first_name= fn;
		last_name=ln;
		ph_no=pn;
	}
	
	public String toString()
	{
		return first_name+" "+last_name+" ("+ph_no+") ";
	}
}
public class ArraylistPhonebook {

	public static void main (String[] args) {
		
Contact c1 = new Contact ("nikita", "khetade", "9527037694");
Contact c2 = new Contact("nishita", "khetade", "9156317471");
Contact c3 = new Contact("krutika", "khetade", "9766008543");

ArrayList <Contact> al = new ArrayList <Contact> ();
al.add(c1);
al.add(c2);
al.add(c3);
System.out.println(al);
	}

}

