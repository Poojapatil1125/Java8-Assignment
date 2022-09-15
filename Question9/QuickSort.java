package com.Question9;
//WAP to implements quick sort algorithm using 
//lambda expression.

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
	public static void main(String[] args) {
	  ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(1);
      al.add(2);
      al.add(9);
      al.add(5);
      al.add(3);
      System.out.println("Elements of the ArrayList " +
                            "before sorting : " + al);

      // using lambda expression in place of comparator object
      Collections.sort(al, (o1, o2) -> (o1 < o2) ? -1 :
                                     (o1 > o2) ? 1 : 0);
      System.out.println("Elements of the ArrayList after" +
                                         " sorting : " + al);
  }
}