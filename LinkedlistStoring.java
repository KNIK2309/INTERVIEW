package interview;

import java.util.*;

public class LinkedlistStoring {

	public static void main(String[] args) {
		LinkedList <String> Ll = new LinkedList <String>();
		HashSet <String> Hs = new HashSet <String>();
		LinkedHashSet <String> Lh = new LinkedHashSet <String>();
		TreeSet <String> Ts = new TreeSet <String>();
		Ll.add("a");
		Hs.add("A");
		Lh.add("B");
		Ll.add("b");
		Ts.add("d");
		Ts.add("e");
		Ts.add("a");
		Ts.add("a");
		System.out.println(Ll);
		System.out.println(Hs);
		System.out.println(Lh);
		System.out.println(Ts);
	}

}
