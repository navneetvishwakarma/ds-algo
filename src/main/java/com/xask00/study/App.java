package com.xask00.study;

import java.util.List;
import com.xask00.study.problems.array.ZeroSumTriplets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to DS and Algorithm implementation!" );
        List<List<Integer>> triplets = new ZeroSumTriplets().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println("Triplets with zero sum: " + triplets);
    }
}
