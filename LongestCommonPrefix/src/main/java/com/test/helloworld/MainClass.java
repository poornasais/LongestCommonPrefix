package com.test.helloworld;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
		System.out.println(longestCommonPrefix(new String[] {"a"}));
		System.out.println("twat");
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
