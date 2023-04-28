package arrays;

public class Equalsarray {
		    public static boolean equals(int[] array1, int[] array2) {
	        
	           return true;
	       }

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 4};
	        int[] array2 = {1, 2, 3};
	        boolean equalArrays = equals(array1, array2);
	        if (equalArrays) {
	            System.out.println("The arrays are equal.");
	        } else {
	            System.out.println("The arrays are not equal.");
	        }
	    }
	}



	