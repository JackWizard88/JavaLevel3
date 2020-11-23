package Lesson1;


import Lesson1.classes.Apple;
import Lesson1.classes.Box;
import Lesson1.classes.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //задание1
        String[] list1 = {"1", "2", "3", "4", "5"};
        Integer[] list2 = {1, 2, 3, 4, 5};
        arrayElementSwapper(list1, 2, 3);
        arrayElementSwapper(list2, 2, 3);

        //задание2
        System.out.println(arrayToArrayList(list1));
        System.out.println(arrayToArrayList(list2));

        //задание3
        Box<Orange> orBox1 = new Box<>();
        Box<Apple> applBox1 = new Box<>();
        Box<Orange> orBox2 = new Box<>();

        for (int i = 0; i < 10 ; i++) {
            orBox1.putInBox(new Orange());
        }

        for (int i = 0; i < 12 ; i++) {
            orBox2.putInBox(new Orange());
        }

        for (int i = 0; i < 15 ; i++) {
            applBox1.putInBox(new Apple());
        }

        System.out.println(orBox1.getWeight());
        System.out.println(orBox2.getWeight());
        System.out.println(applBox1.getWeight());

        System.out.println(orBox1.compare(applBox1));
        System.out.println(orBox2.compare(applBox1));

        orBox1.intersperse(orBox2);

        System.out.println(orBox1.getWeight());
        System.out.println(orBox2.getWeight());
    }

    //метод меняющий элементы массива местами
    public static void arrayElementSwapper(Object[] array, int i, int j) {
        Object buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }

    //метод переносса данных из массива в ArrayList
    public static <T> ArrayList arrayToArrayList(T[] array) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }
    


}
