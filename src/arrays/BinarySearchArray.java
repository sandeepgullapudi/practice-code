package arrays;

public class BinarySearchArray {
	 public static Integer binarySearch(Integer[] intArr, Integer intKey) {
	        
	        return 0;
	    }

	    public static void main(String[] args) {
	        Integer[] intArr = {1, 3, 5, 7, 9, 11};
	        Integer intKey = 7;
	        Integer index = binarySearch(intArr, intKey);
	        if (index >= 0) {
	            System.out.println("The key " + intKey + " is found at index " + index);
	        } else {
	            System.out.println("The key " + intKey + " is not found in the array.");
	        }
	    }
	}
	


