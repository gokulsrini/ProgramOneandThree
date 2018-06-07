package ThirdProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProgramThree {

	 	// Function to return n'th smallest 
	    // element in a given array
	    public static double nSmallest(double [] arr, 
	                                         int n) 
	    {
	        // Sort the given array
	        new HeapSort().sort(arr);
	 
	        // Return k'th element in 
	        // the sorted array
	        return arr[n-1];
	    } 
	     
	    // driver program
	    public static void main(String[] args) 
	    {
	        double arr[] = new double[500];
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i] = Math.random();
	        	//System.out.println(arr[i]);
	        	
	        }
	        System.out.println("Enter the value of n to find the nth smallest value: ");
	        Scanner reader = new Scanner(System.in);
	        int n = reader.nextInt();
	        System.out.print( n +" smallest element is "+
	                            nSmallest(arr, n) );     
	    }
	}

