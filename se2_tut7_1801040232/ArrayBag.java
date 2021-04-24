package sE2;

/**
 * A class of bags whose entries are stored in a fixed-size array.
 */
public final class ArrayBag<T> implements BagInterface<T> {

    //STEP 1: DETERMINES THE DATA FIELDS   
    /**
     * TO-DO: Declares the necessary attributes 
     * bag: T[] 
     * numberOfEntries: int
     * DEFAULT_CAPACITY: int (30) 
     * MAX_CAPACITY: int (3000)
     */
	 private final T[] bag;
	 private int numberOfEntries = 0;
	 private final static int DEFAULT_CAPACITY = 30;
	 private final int MAX_CAPACITY = 3000;
	 
    //STEP 2: IMPLEMENTS THE CONSTRUCTORS
    /**
     * TO-DO: Creates an empty bag with default capacity
     */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    
    /**
     * TO-DO: Creates an empty bag having a given capacity.
     *
     * @param desiredCapacity The integer capacity desired.
     */
    public ArrayBag(int desiredCapacity) {
		if(desiredCapacity <= MAX_CAPACITY){
			bag = (T[]) new Object[desiredCapacity];
		} else{
			throw new IllegalStateException("Invalid size!");
		}

    }

    //STEP 3: IMPLEMENTS THE FUNCTIONS
    /**
     * TO-DO: Adds a new entry to this bag.
     *
     * @param newEntry The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T newEntry) {
    	bag[numberOfEntries] = newEntry;
    	numberOfEntries++;
        return true;
    }

    /**
     * TO-DO: Retrieves all entries that are in this bag.
     *
     * @return A newly allocated array of all the entries in this bag.
     */
    public T[] toArray() {
    	T[] a = (T[]) new Object[numberOfEntries];
    	for(int i=0;i<numberOfEntries;i++) {
    		a[i]=bag[i];
    	}
        return a;

    }

    /**
     * TO-DO: Sees whether this bag is empty.
     *
     * @return True if this bag is empty, or false if not.
     */
    public boolean isEmpty() {
    	if(numberOfEntries==0) {
    		return true;
    	}
        return false;
    }

    /**
     * TO-DO: Gets the current number of entries in this bag.
     *
     * @return The integer number of entries currently in this bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }

    /**
     * TO-DO: Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in this bag.
     */
    public int getFrequencyOf(T anEntry) {
    	int count = 0;
    	for(int i=0;i<numberOfEntries;i++) {
    		if(bag[i].equals(anEntry)) {
    			count++;
    		}
    	}
        return count;

    }

    /**
     * TO-DO: Tests whether this bag contains a given entry.
     *
     * @param anEntry The entry to locate.
     * @return True if this bag contains anEntry, or false otherwise.
     */
    public boolean contains(T anEntry) {
    	for(int i=0;i<numberOfEntries;i++) {
    		if(bag[i].equals(anEntry)) {
    			return true;
    		}
    	}
        return false;

    }

    /**
     * TO-DO: Removes all entries from this bag.
     */
    public void clear() {
    	while(!isEmpty()) {
    		this.remove();
    	}
    }

    /**
     * TO-DO: Removes one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T remove() {
    	T a = bag[numberOfEntries-1];
    	bag[numberOfEntries-1]=null;
    	numberOfEntries--;
        return a;

    }

    /**
     * TO-DO: Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry) {
    	for(int i=0;i<numberOfEntries;i++) {
    		if(bag[i].equals(anEntry)) {
    			for(int j=i;j<numberOfEntries-1;j++) {
    				bag[j]=bag[j+1];
    			}
    			bag[numberOfEntries-1]=null;
    			numberOfEntries--;
    			return true;
    		}
    	}
        return false;

    }

    // TO-DO: Returns true if the array bag is full, or false if not.
    private boolean isArrayFull() {
    	if(this.getCurrentSize()==bag.length) {
    		return true;
    	}
        return false;

    }

    // TO-DO: Locates a given entry within the array bag.
    // Returns the index of the entry, if located,
    // or -1 otherwise.
    // Precondition: checkInitialization has been called.
    private int getIndexOf(T anEntry) {
    	for(int i=0;i<numberOfEntries;i++) {
    		if(bag[i].equals(anEntry)) {
    			return i;
    		}
    	}
        return -1;

    }

    // TO-DO: Removes and returns the entry at a given index within the array.
    // If no such entry exists, returns null.
    // Precondition: 0 <= givenIndex < numberOfEntries.
    // Precondition: checkInitialization has been called.
    private T removeEntry(int givenIndex) {
    	if(givenIndex<0 || givenIndex>=numberOfEntries) {
    		return null;
    	}else {
    		T a = bag[givenIndex];
    		for(int i=givenIndex;i<numberOfEntries-1;i++) {
    			bag[i]=bag[i+1];
    		}
    		bag[numberOfEntries-1]=null;
    		numberOfEntries--;
    		return a;
    	}

    }

}
