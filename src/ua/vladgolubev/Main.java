package ua.vladgolubev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 0, 1};
        Quicksort quicksort = new Quicksort();
        quicksort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
