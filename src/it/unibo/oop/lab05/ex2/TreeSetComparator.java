package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class TreeSetComparator implements Comparator<String> {

	public TreeSetComparator() {
		
	}
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		return o2.compareTo(o1);
	}

}
