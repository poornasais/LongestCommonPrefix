package com.test.helloworld;

import java.util.LinkedList;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		int[] values = {1,-1,-2};
		
		System.out.println(maxSubArray(values));
	}
	
	
	 public static int maxSubArray(int[] nums) {
	        TreeSet<Integer> largeOne = new TreeSet<Integer>();
	        if(nums == null || nums.length == 0){
	         return 0;   
	        }else if(nums.length ==1) {
	        	return nums[0];
	        }else if(nums.length ==2 && nums[0] <0 && nums[1]<0) {
	        	return Math.max(nums[0], nums[1]);
	        }
	       int popValue = nums[0];
	        for(int n =1; n<nums.length; n++){
	        	popValue =  Math.max(nums[n], popValue+nums[n]);
	        	largeOne.add(popValue);
	        }
	        return largeOne.last();
	    }
	
	
	 public static int numJewelsInStones(String J, String S) {
	        
	        int output = 0;
	        int lengthJ = 0;
	        char[] jewls = J.toCharArray();
	        while(lengthJ<J.length()){
	            if(S.contains(Character.toString(jewls[lengthJ]))){
	                output++;
	            }
	            lengthJ++;
	        }
	        return output;
	    }
	
	
public static String longestCommonPrefix(String[] strs) {
	  char[] firstWordList ;
		 if(!(strs.length == 0)){
	         firstWordList = strs[0].toCharArray();
	     }else{
	         return "";
	     }
	         
	     StringBuilder commonLetters = new StringBuilder();
	     for(int i =0; i<firstWordList.length; i++){
	         int count =0;
	         char letter = firstWordList[i];
	         for(int j =1; j<strs.length;j++){
	             if(!(strs[j].length()>i && strs[j].charAt(i) == letter)){
	                 break;
	             }
	             count++;
	             
	         }
	         
	         if(count == strs.length-1){
	             commonLetters.append(letter);
	         }else{
	             return commonLetters.toString();
	         }
	         
	     }
	     return commonLetters.toString();
	        


        
    }

}
