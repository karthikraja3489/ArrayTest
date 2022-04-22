package org.array;

public class ArrayTest {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	float avg=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		avg=sum/a.length;
	}
	System.out.println("The average of numbers are "+avg);
	System.out.println("Completed");
	}

}
