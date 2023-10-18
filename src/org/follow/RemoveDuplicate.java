package org.follow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		

		int [] ar = {10,20,30,40,10,20,50};
		
  
	Set<Integer> s = new LinkedHashSet<>();
	for (int i = 0; i < ar.length; i++) {
		s.add(ar[i]);
		
		
	}
	System.out.println(s);
    
    
    
	//	 ------------------------------------
		
//		  List<Integer> asList = new ArrayList<Integer>();
//	for (int i=0; i<ar.length;i++){
//			for (int j=i+1;j<ar.length;j++){
//				if((ar[i]==ar[j])){
//        							
//			}}
//			
//			asList.add(ar[i]);
//		}
//		Set<Integer> s = new LinkedHashSet<Integer>(asList);
//		System.out.println(s);
	}}

