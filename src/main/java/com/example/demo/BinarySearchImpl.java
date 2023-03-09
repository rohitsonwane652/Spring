package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgo algo;
//	public BinarySearchImpl(SortAlgo algo) {
//		super();
//		this.algo = algo;
//	}

	public int binarySearch(int num[],int numForSearch) {
		algo.sort(num);
		System.out.println(algo);
		
		return 3;
	}
}
