package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SequentialSearch {
	
	public SequentialSearch() {
		Random random = new Random();
		List list = new ArrayList();
		for(int i=0; i<10; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		System.out.println(sequential(list,30));
	}
	
	public int  sequential(List data, int search) {
		for(int i=0; i<data.size();i++) {
			if((int)data.get(i)==search) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new SequentialSearch();
	}

}