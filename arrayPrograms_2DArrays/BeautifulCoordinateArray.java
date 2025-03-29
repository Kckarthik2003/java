package com.arrayPrograms_2DArrays;

import java.util.Arrays;

public class BeautifulCoordinateArray {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        String[][] coordinates = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                coordinates[i][j] = "(" + i + "," + j + ")";
            }
        }

        for (String[] row : coordinates) {
            System.out.println(Arrays.toString(row));
        }
    }
}
