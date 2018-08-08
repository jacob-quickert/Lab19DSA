/**
 * 
 */
package com.gc.lists;

/**
 * @author jacobquickert
 *
 */
public interface MyList {
	
	
	void addAtBeginning(String data);
	
	void removeFromBeginning();
	
	void addAtEnd(String data);
	
	void removeFromEnd();
	
	boolean insertAt(int index, String data);
	
	boolean removeAt(int index);
	
	String get(int index);
	
	int size(); //how many items are in the list

}
