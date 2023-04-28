package arrays;

import java.util.Arrays;

public class Sortarray 
{
	public static void sort(Integer[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Integer[] arr = { 10, 5, 7, 2, 9 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
