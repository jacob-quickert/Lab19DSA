package com.gc.lists;

import java.util.Arrays;

public class MyArrayList implements MyList {

	String[] array = new String[4];

	int length = 0;

	private void doubleLength() {

		// make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);
	}

	private boolean isFull() {
		return length == array.length;
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			// if our array is out of space, double the size.
			doubleLength();
		}
		// Loop backwards and shift all the items over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		// set the first element and increment the length
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// Loop backwards and shift all the items over to make room for the new one
		for (int i = 0; i < length; i++) {
			array[i] = array[i + 1];
		}
		// set the first element and increment the length
		array[length - 1] = null;
		length--;

	}

	@Override
	public void addAtEnd(String data) {

		if (isFull()) {
			// if our array is out of space, double the size.
			doubleLength();
		}
		// set the next item in the array and increment the length
		array[length] = data;
		length++;
	}

	@Override
	public void removeFromEnd() {
		// clear the last slot and decrement the length
		array[length - 1] = null;
		length--;
	}

	@Override
	public String get(int index) {

		return array[index];
	}

	@Override
	public int size() {

		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}

		sb.append(" ]");
		return sb.toString();
	}

	@Override
	public boolean insertAt(int index, String data) {
		// TODO Auto-generated method stub
		if (isFull()) {
			doubleLength();
		}
		// if condition makes sure that input is valid
		if (index >= 0 && index <= length) {
			
			for (int i = length; i > index; i--) {
				array[i] = array[i - 1];
			}

			array[index] = data;
			length++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeAt(int index) {
		// TODO Auto-generated method stub

		if (index >= 0 && index <= length) {
			for (int i = index; i < length; i++) {
				array[i] = array[i + 1];
			}
			array[length - 1] = null;
			length--;
			return true;
		} else {
			return false;
		}
	}

}
