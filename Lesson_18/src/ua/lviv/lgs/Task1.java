package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		
		
		List<Integer> oldList= new ArrayList<Integer>();
		oldList.add(1);
		oldList.add(2);
		System.out.println(oldList);
		
		List<String> newList = new ArrayList<>(oldList.size());
		newList.add("a");
		System.out.println(newList);
	}
	
}
