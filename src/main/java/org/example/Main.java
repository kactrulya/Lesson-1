package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "3", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = checkArraySize(array);
            System.out.println("Сумма всех элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException  {
            if (array.length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4!");
            }

            for (String[] row : array) {
                if (row.length != 4) {
                    throw new MyArraySizeException("Массив должен быть размером 4x4!");
                }
            }

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {

                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {

                        throw new MyArrayDataException("Ошибка данных в ячейке [" + i + "][" + j + "]: \"" + array[i][j] + "\" не является числом.");
                    }
                }
            }
            return sum;

        }

    }
