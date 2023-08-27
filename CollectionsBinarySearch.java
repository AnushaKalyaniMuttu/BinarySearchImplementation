package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearch {

	public static void main(String[] args) {
		/*
		 * The list to Collections.binarySearch should
		 * be in ordered way and the return type is the
		 * index position of the value search
		 *if does not exists it returns undefined
		 */
		List<Integer> list=new ArrayList<>();
		list.add(1);

		list.add(2);
		list.add(3);
		list.add(4);

	int index=	Collections.binarySearch(list, 1);
	int indexForNonExistNumber=	Collections.binarySearch(list, 6);

	System.out.println(index);
	System.out.println(indexForNonExistNumber);
}
}
