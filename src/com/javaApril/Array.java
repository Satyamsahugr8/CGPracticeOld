package com.javaApril;

public class Array {

	public static void main(String[] args) {

		int A[] = { 100, 22, 13, 4, 22, 16, 77, 80, 32 };

		// find duplicate
//		DuplicateElement(A);
//		System.out.println(largestElement(A));
//		linearSearch(A, 80);
//		duplicate();
		
		int B[]= {0};
		
		for(int i=0;i<B.length;i++) {
		System.out.println(B[i]);
		}

	}

	static void DuplicateElement(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			for (int j = i + 1; j < a.length; j++) {

				if (num == a[j]) {
					System.out.println("Dulicate at : " + i + " and " + j);
				}
			}
		}

	}

	static int largestElement(int a[]) {
			int num = a[0];
			for (int j = 1; j < a.length; j++) {
				if (num < a[j]) {
					num = a[j];
				}
			}
			return num;
	}
	
	static void linearSearch(int a[], int b) {
		for (int j = 0; j < a.length; j++) {
			if (b == a[j]) {
				System.out.println("Form number at :" + j);
			}
		}
	}
	
	static void duplicate() {
		int ar[]= {1,2,3,1,3,2,5,3,7,9};
	    int maz=ar[0];
	    
	    for(int i=1;i<10;i++)
	    {
	        if(maz<ar[i]) maz=ar[i];
	    }
	    int arr[] = new int[maz+1];
	    
	    for(int i=0;i<maz;i++) {
		    arr[i] = 0;
	}
	    for(int i=0;i<maz+1;i++)
	    {
	        arr[ar[i]]++;
	    }
	    for(int i=0;i<maz+1;i++)
	    {
	        System.out.println(i +" "+ arr[i]);
	    }
	}

}
