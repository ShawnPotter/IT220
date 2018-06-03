package arrayintlist;

public class ArrayIntList {

	private int[] elementData;
	private int size;

	public static final int DEFAULT_CAPACITY = 100;

	// implement constructor to construct an empty list of DEFAULT_CAPACITY
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}

	// implement constructor to construct an empty list with the given capacity
	// if capacity < 0 throw IllegalArgumentException
	public ArrayIntList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException();
		}
		elementData = new int[capacity];
		size = 0;
	}

	// implement add method which appends the value to the end of the list and increments
	// size if the list has not exceeded it's capacity
	public void add(int value) {
		checkCapacity(size + 1);
		elementData[size]=value;
		size++;
	}
	
	// implement add method which inserts the value at the given index, shifting subsequent values right and
	// increments size if the list has not exceeded it's capacity
	public void add(int index, int value) {
		checkCapacity(size+1);
		if(index >= 0 || index <= size+1) {
			//go through array backwards shifting elements right
			for(int i = size; i >= index + 1; i-- ) {
				//new spot  = previous spot value
				elementData[i] = elementData[i-1];
			}
			elementData[index]=value;
			size++;
		}
		else {
			throw new IndexOutOfBoundsException("Index: "+index);
		}
	}

	// implement getter for size which returns the current number of elements in list
	public int size() {

		return 0;
	}
	
	// implement indexOf method to return the position of the first occurence of the given value in the list, return
	// -1 if not found (uses a linear search)
	public int indexOf(int value) {
		for(int i = 0; i < size; i++) {
			if(elementData[i]==value) {
				return i;
			}
		}
		return -1;
	}

	// implement the remove method that removes the value at the given index and shifts subsequent values left
	// and decrements size
	public void remove(int index) {
		checkIndex(index);
		//go forwards through array so you don't overwrite the data to be moved
		for(int i = index; i < size-1; i++) {
			//move element prior = next element
			elementData[i]=elementData[i+1];
			
		}
		size--;
	}
	// implement getter to return the arrayList element at given index
	public int get(int index) {
		
		return elementData[index];
	}
	
	// implement the contains method which returns true if the value is in the list, false otherwise
	public boolean contains(int value) {
		
		return indexOf(value)>-1;
	}
	
	// implement the isEmpty method which returns true if the list is empty, false otherwise
	public boolean isEmpty() {
		return size==0; //boolean zen
	}
	
	// implement the set method that assigns the given value to the index that is given
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index]=value;
		
	}
	
	// implement the clear method that "empties" the list of all values
	public void clear() {
		size=0;
	}
	
	// implement the addAll method that appends all the list values from the other list to this list
	public void addAll(ArrayIntList other) {
		for(int num : other.elementData) {
			this.add(num);
		}
		this.size = this.size + other.size;
		
	}

	// implement toString method to return comma-separated, bracketed version of list
	// like [23, 34, 45]
	@Override
	public String toString() {
		String result = "[" + elementData[0];
		for(int i = 1; i < size; i++) {
			result = result + "," + " "+elementData[i];
		}
		return result + "]";
	}
	
	// This method checks that the underlying array has the given capacity, throwing an IllegalStateException if it does not
	private void checkCapacity(int capacity) {
		if(capacity > elementData.length)
			throw new IllegalStateException("exceeds list capacity");
	}
	
	// This method makes sure the index is within bounds of the list and throws an IndexOutOfBoundsException if the index 
	// is out of bounds
	
	private void checkIndex(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index: "+index);
	}
}
