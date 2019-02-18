package com.zipcodewilmington.assessment1.part2;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(Object o : objectArray){
            if(o.equals(objectToCount)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        int numReduce = getNumberOfOccurrences(objectArray,objectToRemove);
        Integer[] resultArray = new Integer[(objectArray.length-numReduce)];
        int i = 0;
        for(Integer o : objectArray){
            if(!o.equals(objectToRemove)){
                resultArray[i] = o;
                i++;
            }
        }
        return resultArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object result = objectArray[0];

        for(Object o : objectArray){
            Integer numOccurO = getNumberOfOccurrences(objectArray,o);
            Integer numOccurResult = getNumberOfOccurrences(objectArray,result);
            if(numOccurO > numOccurResult){
                result = o;
            }
        }
        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommmomResult = objectArray[0];

        for(Object o : objectArray){
            Integer numOccurO = getNumberOfOccurrences(objectArray,o);
            Integer numOccurResult = getNumberOfOccurrences(objectArray,leastCommmomResult);
            if(numOccurO < numOccurResult){
                leastCommmomResult = o;
            }
        }
        return leastCommmomResult;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        ArrayList<Integer> firstList = new ArrayList<>();
        for (Integer i: objectArray) {
            firstList.add(i);
        }
        for (Integer i: objectArrayToAdd) {
            firstList.add(i);
        }

        return firstList.toArray(new Integer[firstList.size()]);
    }
}
