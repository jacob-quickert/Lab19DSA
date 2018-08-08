package com.gc.lists;

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		
		test(list);
		list = new MyLinkedList();
		test(list);

	}
	private static void test(MyList list) {
		list.addAtBeginning("D");
		list.addAtBeginning("C");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("E");
		list.addAtEnd("F");
		list.addAtEnd("G");
		// test for all adds
		System.out.println("1 " + list);
		System.out.println(list.size());
		// test for remove last letter G
		list.removeFromEnd();
		System.out.println("2 " + list);
		System.out.println(list.size());
		// test for remove first letter A
		list.removeFromBeginning();
		System.out.println("3 " + list);
		System.out.println(list.size());
		// test to insert Z after D
		list.insertAt(3, "Z");
		System.out.println("4 " + list);
		System.out.println(list.size());
		// test to remove E
		list.removeAt(4);
		System.out.println("5 " + list);
		System.out.println(list.size());
		// final result  and head count
		System.out.println("Final " + list);
		System.out.println(list.size());
	}
}
