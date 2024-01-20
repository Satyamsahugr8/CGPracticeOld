package com.pooja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public void generate(List<String> data) throws InterruptedException {
		
		if(data.size() > 50) {
			throw new InterruptedException("Error");
		}
	}

	
	
	public static void main(String[] args) throws InterruptedException{
		Main obj = new Main();
		List<String> data = new ArrayList<>(Collections.nCopies(500, "Method"));
		obj.generate(data);
	}
}
