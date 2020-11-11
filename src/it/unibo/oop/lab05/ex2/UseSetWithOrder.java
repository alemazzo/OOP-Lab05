package it.unibo.oop.lab05.ex2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     * @param TreeSetComparator 
     */
    public static void main(final String[] args) {
    	
    	TreeSet<String> tree = new TreeSet<String>(new TreeSetComparator());
    	for(int i=0; i < 100; i++) {
    		tree.add(String.valueOf(Math.random()));
    	}
    	System.out.println(tree);
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    }
}
