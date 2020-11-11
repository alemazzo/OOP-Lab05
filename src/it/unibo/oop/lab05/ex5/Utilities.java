package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	for(X elem : source) {
    		target.add(elem);
    	}
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        
        final int index = new Random().nextInt(coll.toArray().length);
        int count = 0;
        for(X elem : coll) {
        	if(count == index) {
        		return elem;
        	}else {
        		count++;
        	}
        }
        return null;
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
        
    	X first = Utilities.<X>getRandomElement(one);
    	Y second = Utilities.<Y>getRandomElement(two);
    	
    	return new Pair<X, Y>(first, second);
    }
}
