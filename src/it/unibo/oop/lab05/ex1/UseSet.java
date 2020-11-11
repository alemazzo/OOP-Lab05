package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	TreeSet<String> tree = new TreeSet<>();
    	for(int i = 0; i < 20; i++) {
    		tree.add(""+i);
    	}
    	System.out.println(tree);
    	
    	Iterator<String> it = tree.iterator();
    	while (it.hasNext()) {
    		final String temp = it.next();
    		if(Integer.parseInt(temp) % 3 == 0) {
    			it.remove();
    		}
    	}

    	System.out.println(tree);
    	for(String s : tree) {
    		System.out.print(s + " ");
    	}
    	
    	System.out.println();
    	boolean even = true;
    	for(String s : tree) {
    		if(Integer.parseInt(s) % 2 == 1) {
    			even = false;
    			break;
    		}
    	}
    	System.out.println("Even = " + even);
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    }
}
