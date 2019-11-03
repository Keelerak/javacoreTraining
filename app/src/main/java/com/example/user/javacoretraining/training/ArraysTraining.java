package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i< valuesArray.length-1; i++){
                if(valuesArray[i] > valuesArray[i +1]){
                    int countX = valuesArray[i];
                    valuesArray[i] = valuesArray[i+1];
                    valuesArray[i+1] = countX;
                    isSorted = false;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if (values.length == 0) return 0;
        int maxVal = values[0];
        for (int i = 0; i<values.length; i++){
            if (maxVal< values[i])
                maxVal = values[i];
        }
        return maxVal;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int [] reversed = new int[array.length];
        for (int i = 0; i<array.length; i++)
            reversed[i] = array[array.length-1 - i];
        return reversed;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if (numbersCount < 1)return new int[]{};
        int[] fibArray = new int[numbersCount];
        fibArray[0] = 1;
        fibArray[1] = 2;
        for (int i = 2; i<fibArray.length-1; i++)
            fibArray[i] = fibArray[i-1]+fibArray[i-2];
        return fibArray;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int countSymb = 0;
        if(array.length == 1) return 1;
        else{
            for (int i = 0; i < array.length; i++) {
                int countEl = 0;
                for (int j = i; j < array.length; j++){
                    if (array[i] == array[j]) countEl++;
                }
                if (countEl > countSymb) countSymb = countEl;
            }
        }


        return countSymb;
    }
}
