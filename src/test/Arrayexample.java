package test;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println("length of an array is " +arr1.length);
		System.out.println("first element in array is " +arr1[0]);
		System.out.println("last element in array is " +arr1[arr1.length-1]);
		
		String[] arr2 = {"mon","tues","wed","thr","fri","sat","sun"};
		System.out.println("value at third position is "+arr2[2]);
		
		String str = "i am working in amazon";
		String[] arr3= str.split(" "); //{"i","am","working","in","amazon"}
		
		System.out.println("length of array is"+arr3.length);

	}

}
