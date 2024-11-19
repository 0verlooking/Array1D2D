package com.chmnu_ki_123.c3;

public class Array1D {
    private double[] array;

    // Конструктор
    public Array1D(double[] array) {
        this.array = array;
    }

    // Метод для перевірки предикату
    public boolean checkPredicate() {
        for (int i = 0; i < array.length - 1; i++) {
            if (!f(array[i], array[i + 1])) {
                return false;
            }
        }
        return true;
    }

    // Приватний метод предикату
    private boolean f(double a, double b) {
        return a < b;
    }

    // Метод для виведення масиву
    public void printArray() {
        System.out.print("Масив: ");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
