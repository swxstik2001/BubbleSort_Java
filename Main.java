package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] sampleOne = {70,61,72,83,38};
        int[] sampleTwo = {7,2,76,4,99};
        int[] sampleThree = {28,9,13,78,19};
        int[] sampleFour = {68,84,41,62,18};
        int[] sampleFive= {37,57,40,13,50};

        bubbleSort(sampleOne);
        bubbleSort(sampleTwo);
        bubbleSort(sampleThree);
        bubbleSort(sampleFour);
        bubbleSort(sampleFive);

        System.out.println(Arrays.toString(sampleOne));
        System.out.println(Arrays.toString(sampleTwo));
        System.out.println(Arrays.toString(sampleThree));
        System.out.println(Arrays.toString(sampleFour));
        System.out.println(Arrays.toString(sampleFive));

    }

    public static void bubbleSort(int[] arrayInput) {
        int length = arrayInput.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayInput[j] > arrayInput[j + 1]) {
                    temp = arrayInput[j];
                    arrayInput[j] = arrayInput[j + 1];
                    arrayInput[j + 1] = temp;

                }
            }
        }
    }
}