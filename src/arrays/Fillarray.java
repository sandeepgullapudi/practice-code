package arrays;

import java.util.Arrays;

public class Fillarray {
	public static void fill(int[] ar, int i, int j, int k) {
        if (i < 0 || j > ar.length || i > j) {
            throw new IllegalArgumentException("Invalid range.");
        }
        for (int index = i; index < j; index++) {
            ar[index] = k;
        }
    }
	public static String toString(int[] ar) {
		
		return null;
	}

    public static void main(String[] args) {
        int[] ar = new int[10];
        fill(ar, 2, 8, 5);
        System.out.println("The filled array is: " + Arrays.toString(ar));
    }
}

