package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearch {
	
	public BinarySearch() {
		Random random = new Random();
		List list = new ArrayList();
		for(int i=0; i<10; i++) {
			list.add(random.nextInt(100));
		}
	    Collections.sort(list);
		System.out.println(list);
		System.out.println(binary_search(list, 30));
	}
	
	public boolean binary_search(List data, int search) {
		if(data.size()==1&&search==(int)data.get(0)) {
			return true;
		}
		if(data.size()==1&&search!=(int)data.get(0)) {
			return false;
		}
		if(data.size()==0) {
			return false;
		}
		int medium = data.size()/2;
		if(search==(int)data.get(medium)) {
			return true;
		}else {
			if(search>(int)data.get(medium)) {
				return binary_search(data.subList(medium,data.size()),search);
			}else {
				return binary_search(data.subList(0,medium),search);
			}
		}
	}
	
	public static void main(String[] args) {
		new BinarySearch();
	}

}