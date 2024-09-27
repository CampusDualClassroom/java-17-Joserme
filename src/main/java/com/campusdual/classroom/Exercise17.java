package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		int[] array = new int[positions];
		return array;
	}

	public static String[] createInitializedStringArray() {
		String[] array2 = new String[3];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = String.valueOf(i+1);
		}
		return array2;
	}

	public static void populateArray(int[] array, int index, int value) {
		for (int i = 0; i < array.length; i++) {
			array[index] = value;
		}
	}

	public static int arrayLength(int[] array) {
		int longitud = array.length;
		return longitud;
	}

	public static void showValue(int[] array, int index) {
		int valor = array[index];
		System.out.println(valor);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
