package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer counter = 0;

        for(int i = 0 ; i <= input.length() ; i++){
            for(int j = i+1 ; j <= input.length() ; j++){
                String sub = input.substring(i,j);
                if(isPalindromic(sub)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean isPalindromic(String input) {
        String rev = BasicStringUtils.reverse(input);

        if(rev.equals(input) == true){
            return true;
        } else {
            return false;
        }
    }
}
