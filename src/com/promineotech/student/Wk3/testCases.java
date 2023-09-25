package com.promineotech.student.Wk3;
import java.util.*;
public class testCases {

	public static void main(String[] args) {
		
		// clone arrays....
		
		int[] arr = {-11 , 43 , 901 , 72 , -5};
		int[] arr2 = arr.clone();
		System.out.println(arr2[3]);
		
		//declare a 2D integer Array with 3 rows and 4 columns.
		int[][] matrix1 = new int[3][4];
		//initialize a 2D integer Array with 3 rows and 4 columns.
		int[][] matrix2 = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12}};
		//to call for the contents of the array, all dimensions must be specified.
		
		// TODO HOW DO I PULL SPECIFIC CELLS FROM THE 2D ARRAY?????
		System.out.println(matrix2[2][3]);
		
		
		
		
/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	}
}
