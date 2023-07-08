package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array)
    {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            if (array[i] == value);

        }

        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] rev = new String[array.length];
        int count =0;
        for (int i = array.length -1 ; i >= 0; i--){

            rev[count] = array[i] ;
            count++;
        }

        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] ans = new String[array.length];
        boolean equal;
        int j =0;
        for (int i = array.length -1 ; i >= 0; i--){

            ans[j] = array[i] ;
            j++;
        }
        equal = Arrays.equals(ans, array);


        return equal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangram = true;
        String str =Arrays.toString(array).toLowerCase();
        for(char c = 'a'; c<='z'; c++) {
            if (!str.contains(String.valueOf(c))){
                pangram = false;
                break;
            }

        }
        return pangram;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i =0; i < array.length; i++){
            if( array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        if (array == null) {
            return null;
        } else if (array.length <= 0) {
            return array;
        } else {
            String[] output = new String[array.length - 1];
            int count = 0;
            for (String i : array) {
                if (!i.equals(valueToRemove)) {
                    output[count++] = i;
                }
            }
            return output;
        }

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                answer.add(array[i]);
            }
        }

        // Add the last element of the original array
        answer.add(array[array.length - 1]);

        return answer.toArray(new String[answer.size()]);
/*      int copy = 0;
       int j = 0;
//        String[] answer = new String[array.length-copy];
        ArrayList<String> answer = new ArrayList<>(array.length-copy);
        for (int i = 0; i< array.length-1; i++){
            if (array[i] == array[i+1]){
                copy ++;
            } else if (array[i] != array[i+1]) {
                array[i] = answer.get(j);
                j++;

            }


        }String[] array2 = answer.toArray(new String[answer.size()]);
        return array2;*/
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String[] answer = removeConsecutiveDuplicates(array);
        int j =0;
        for ( int i = 0; i < array.length-1; i++){
            if(array[i] == array[i+1]){
                answer[j] += array[i];
            } else if (array[i] != array[i+1])  {
                j++;

            }
        }

        return answer;
    }


}
