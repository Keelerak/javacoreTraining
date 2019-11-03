package com.example.user.javacoretraining.training;

import android.support.v4.content.res.TypedArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i+=2){
            stringBuilder.append(text.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        ArrayList<Integer> placesSymb = new ArrayList<>();
        int countSymb = 0;
        if(!text.isEmpty()){
            char c = text.charAt(text.length()-1);
            for (int i = 0; i<text.length(); i++)
                if (c == text.charAt(i)) {
                    countSymb++;
                    placesSymb.add(i);
                }
        }
        int[] m = new int[placesSymb.size()];
        for (int i = 0; i<placesSymb.size(); i++){
            m[i] = placesSymb.get(i);
        }
        return m;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        int countNumbers = 0;
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                countNumbers++;
            }
        }
        return countNumbers;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цыфры заменены словами
     */
    public String replaceAllNumbers(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : text.toCharArray()){
            if(Character.isDigit(c)){
                switch (Character.getNumericValue(c)){
                    case (0):
                        stringBuilder.append("zero");
                        break;
                    case (1):stringBuilder.append("one");
                        break;
                    case (2):stringBuilder.append("two");
                        break;
                    case (3):stringBuilder.append("three");
                        break;
                    case (4):stringBuilder.append("four");
                        break;
                    case (5):  stringBuilder.append("five");
                        break;
                    case (6):  stringBuilder.append("six");
                        break;
                    case (7):  stringBuilder.append("seven");
                        break;
                    case (8):  stringBuilder.append("eight");
                        break;
                    case (9):  stringBuilder.append("nine");
                        break;
                }

            } else {stringBuilder.append(c);}

        }
        return stringBuilder.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : text.toCharArray()){
            if (Character.isUpperCase(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)){
                stringBuilder.append(Character.toUpperCase(c));
            }else{ stringBuilder.append(c);}
        }

        return stringBuilder.toString();
    }

}
