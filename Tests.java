package com.java8;

import java.util.ArrayList;
import java.util.List;

public abstract class Tests {

	public static void main(String args[]) {
//		System.out.println(countPalindromes("abccba"));
		List<Integer> songs = new ArrayList<Integer>();
		
		  songs.add(5); songs.add(30); songs.add(20); songs.add(150); songs.add(100);
		  songs.add(40);
		 
		songs.add(60);songs.add(120);
		
		System.out.println(playlist(songs));
	}
	
	//Palindrome counter : count no. of substrings that are palindrome
	public static int countPalindromes(String s)
	{
		int count =0;
	    for (int i = 0; i < s.length(); i++) {
	        for (int j = i+1; j <= s.length(); j++) {
	            if (isPalindrome(s.substring(i, j))) {
	            	System.out.print(s.substring(i,j)+" ");
	                count++;
	            }
	        }
	    }
	    return count;
	}
	private static boolean isPalindrome(String input) {
	    StringBuilder plain = new StringBuilder(input);
	    StringBuilder reverse = plain.reverse();
	    return (reverse.toString()).equals(input);
	}
	
	/* Whole Minute Dilemma : music playlist which has a complete minute(u can select single song(60sec or multiple of 60) 
	 * or in pairs of songs which add up to whole minute(or minutes). Given a list of song durations,
	 * Calculate no. of different pairs of songs that can be chosen
	 *  
	 */
	public static long playlist(List<Integer> songs) {
		
		if(songs == null)
			return 0;
		if(songs.isEmpty())
			return 0;
		int count =0;
		
		for(int i=0; i< songs.size();i++)
		{
			if((songs.get(i)%60)==0)
			{
				count++;
				continue;
			}
			for(int j=i+1;j<songs.size();j++)
			{
				
				if((songs.get(i) + songs.get(j))%60 == 0)
					count++;
			}
		}
		return count;
	}
}
