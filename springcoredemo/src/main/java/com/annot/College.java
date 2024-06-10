package com.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="colz")
public class College {
	@Value("SNSC")
	private String name;
	@Value("980")
	private String contact;
	
	void printCollege() {
		
		
		System.out.println("Name="+name);
		System.out.println("Contact="+contact);
	}

}
